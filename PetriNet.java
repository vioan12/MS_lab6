import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by ioan on 12/1/17.
 */
public abstract class PetriNet
{
    protected List<Tranzitie> Tranzitii;

    protected void exec(String actiune)
    {
        List<Tranzitie> tempTranzitii= new ArrayList<Tranzitie>();
        for(int i=0;i<Tranzitii.size();i++){
            if(Tranzitii.get(i).Get_tag().equals(actiune))
                if (Tranzitii.get(i).isValid()==true)
                    tempTranzitii.add(Tranzitii.get(i));
        }
        for(int i=0;i<tempTranzitii.size();i++){
            tempTranzitii.get(i).update();
        }
    }
    protected List<Locatie> starejetoatelocatii()
    {
        List<Locatie> listalocatii = new ArrayList<Locatie>();
        for(int i=0;i<Tranzitii.size();i++) {
            for (int j = 0; j < Tranzitii.get(i).Get_Arce().size(); j++) {
                listalocatii.add(Tranzitii.get(i).Get_Arce().get(j).Get_locatie());

            }
        }
        for(int i=0;i<listalocatii.size()-1;i++)
            for(int j=0;j<listalocatii.size();j++)
                if(listalocatii.get(i).Get_tag().equals(listalocatii.get(j).Get_tag()))
                    listalocatii.remove(j);
        return listalocatii;
    }
}
