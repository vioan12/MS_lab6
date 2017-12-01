import java.util.ArrayList;
import java.util.List;

/**
 * Created by ioan on 12/1/17.
 */
public class CoffeeMachine extends PetriNet
{
    CoffeeMachine()
    {
        Tranzitie tranzitia51,tranzitia52,tranzitia10;
        Arc arcul05,arcul010,arcul55i,arcul55o,arcul510,arcul1010;
        Locatie locatia0,locatia5,locati10;
        List<Arc> templistaarce;
        Tranzitii = new ArrayList<Tranzitie>();

        locatia0 = new Locatie("0",1);
        arcul05 = new Arc(locatia0,1,"out");
        arcul010 = new Arc(locatia0,1,"out");

        locatia5 = new Locatie("5",0);
        arcul55i = new Arc(locatia5,1,"in");
        arcul55o = new Arc(locatia5,1,"out");

        locati10 = new Locatie("10",0);
        arcul510 = new Arc(locati10,1,"in");
        arcul1010 = new Arc(locati10,1,"in");

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul05);
        templistaarce.add(arcul55i);
        tranzitia51= new Tranzitie("5",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul55o);
        templistaarce.add(arcul510);
        tranzitia52 = new Tranzitie("5",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul010);
        templistaarce.add(arcul1010);
        tranzitia10 = new Tranzitie("10",templistaarce);

        Tranzitii.add(tranzitia51);
        Tranzitii.add(tranzitia52);
        Tranzitii.add(tranzitia10);
    }
}
