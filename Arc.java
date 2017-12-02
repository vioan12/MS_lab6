/**
 * Created by ioan on 12/1/17.
 */
public class Arc
{
    private Locatie locatie;
    private int capacitate;
    private String directie;

    protected Arc(Locatie valueoflocatie, int valueofcapacitate, String valueofdirectie)
    {
        locatie=valueoflocatie;
        capacitate=valueofcapacitate;
        directie=valueofdirectie;
    }
    protected Locatie Get_locatie()
    {
        return this.locatie;
    }
    protected boolean isValid()
    {
        if(directie.equals("out")){
            if(locatie.Get_jetoane()>=capacitate){
                return true;
            } else {
                return false;
            }
        } else {
            if(directie.equals("in")){
                return true;
            }
        }
        return false;
    }
    protected void update()
    {
        if(directie.equals("out")) {
            locatie.Set_jetoane(locatie.Get_jetoane() - capacitate);
        }
        if(directie.equals("in")){
            locatie.Set_jetoane(locatie.Get_jetoane() + capacitate);
        }
    }
}
