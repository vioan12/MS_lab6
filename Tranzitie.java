import java.util.Iterator;
import java.util.List;

/**
 * Created by ioan on 12/1/17.
 */
public class Tranzitie
{
    private String tag;
    private List<Arc> Arce;

    protected Tranzitie(String valueoftag, List<Arc> valueofArce)
    {
        this.Arce=valueofArce;
        this.tag=valueoftag;
    }
    protected String Get_tag()
    {
        return this.tag;
    }
    protected boolean isValid()
    {
        boolean sw=true;
        for(int i=0;(i<Arce.size())&&(sw==true);i++){
            if(Arce.get(i).isValid()==false){
                sw=false;
            }
        }
        return sw;
    }
    protected void update()
    {
        for(int i=0;i<Arce.size();i++){
            Arce.get(i).update();
        }
    }
}
