import java.util.List;

/**
 * Created by ioan on 12/1/17.
 */
public abstract class PetriNet
{
    protected List<Tranzitie> Tranzitii;

    protected void exec(String actiune)
    {
        for(int i=0;i<Tranzitii.size();i++){
            if(Tranzitii.get(i).Get_tag()==actiune)
                if (Tranzitii.get(i).isValid()==true)
                    Tranzitii.get(i).update();
        }
    }
}
