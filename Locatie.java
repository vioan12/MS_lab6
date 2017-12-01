/**
 * Created by ioan on 12/1/17.
 */
public class Locatie
{
    private String tag;
    private int jetoane;

    protected Locatie(String valueoftag, int valueofjetoane)
    {
        this.tag=valueoftag;
        this.jetoane=valueofjetoane;
    }
    protected String Get_tag()
    {
        return this.tag;
    }
    protected int Get_jetoane()
    {
        return this.jetoane;
    }
    protected void Set_jetoane(int valueofjetoane)
    {
        this.jetoane=valueofjetoane;
    }

}
