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
        List<Locatie> listalocatii2 = new ArrayList<Locatie>();
        for(int i=0;i<Tranzitii.size();i++) {
            for (int j = 0; j < Tranzitii.get(i).Get_Arce().size(); j++) {
                listalocatii.add(Tranzitii.get(i).Get_Arce().get(j).Get_locatie());

            }
        }
        listalocatii2.add(listalocatii.get(0));
        for(int i=1;i<listalocatii.size();i++){
            boolean sw=true;
            for(int j=0;(j<listalocatii2.size())&&(sw==true);j++){
                if(listalocatii.get(i).Get_tag().equals(listalocatii2.get(j).Get_tag())==true){
                    sw=false;
                }
            }
            if(sw==true){
                listalocatii2.add(listalocatii.get(i));
            }
        }
        return listalocatii2;
    }
}
