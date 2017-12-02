import java.util.ArrayList;
import java.util.List;

/**
 * Created by ioan on 12/1/17.
 */
public class CoffeeMachine extends PetriNet
{
    CoffeeMachine()
    {
        Tranzitie tranzitiac151,tranzitia51,tranzitia101,tranzitia52,tranzitia103,tranzitiac101,tranzitiac152,tranzitia53,tranzitiac102,tranzitia102,tranzitiac103;
        Arc arcul0c15,arcul010,arcul10101,arcul10c10,arcul05,arcul551,arcul552,arcul5102,arculc1515,arcul155,arcul10102,arcul1020,arculc1020,arcul5c15,arculc1520,arcul10152,arculc105,arcul15c10,arcul5101,arcul10151,arcul0c10,arculc1010;
        Locatie locatia0,locatia5,locatia10,locatia15,locatia20;
        List<Arc> templistaarce;
        Tranzitii = new ArrayList<Tranzitie>();

        locatia0 = new Locatie("0",1);
        arcul05 = new Arc(locatia0,1,"out");
        arcul010 = new Arc(locatia0,1,"out");
        arcul0c15 = new Arc(locatia0,1,"in");
        arcul0c10 = new Arc(locatia0,1,"in");

        locatia5 = new Locatie("5",0);
        arcul551 = new Arc(locatia5,1,"in");
        arculc105 = new Arc(locatia5,1,"in");
        arcul5c15 = new Arc(locatia5,1,"in");
        arcul552 = new Arc(locatia5,1,"out");
        arcul5101 = new Arc(locatia5,1,"out");

        locatia10 = new Locatie("10",0);
        arcul10101 = new Arc(locatia10,1,"in");
        arcul5102 = new Arc(locatia10,1,"in");
        arcul10c10 = new Arc(locatia10,1,"in");
        arcul10102 = new Arc(locatia10,1,"out");
        arcul10152 = new Arc(locatia10,1,"out");
        arculc1010 = new Arc(locatia10,1,"out");

        locatia15 = new Locatie("15",0);
        arcul155 = new Arc(locatia15,1,"in");
        arcul10151 = new Arc(locatia15,1,"in");
        arcul15c10 = new Arc(locatia15,1,"out");
        arculc1515 = new Arc(locatia15,1,"out");

        locatia20 = new Locatie("20",0);
        arculc1020 = new Arc(locatia20,1,"out");
        arculc1520 = new Arc(locatia20,1,"out");
        arcul1020 = new Arc(locatia20,1,"in");

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arculc1515);
        templistaarce.add(arcul0c15);
        tranzitiac151 = new Tranzitie("C15",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul05);
        templistaarce.add(arcul551);
        tranzitia51 = new Tranzitie("5",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul010);
        templistaarce.add(arcul10101);
        tranzitia101 = new Tranzitie("10",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul552);
        templistaarce.add(arcul5102);
        tranzitia52 = new Tranzitie("5",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul5c15);
        templistaarce.add(arculc1520);
        tranzitiac152 = new Tranzitie("C15",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul10102);
        templistaarce.add(arcul1020);
        tranzitia102 = new Tranzitie("10",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul10c10);
        templistaarce.add(arculc1020);
        tranzitiac102 = new Tranzitie("C10",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul10152);
        templistaarce.add(arcul155);
        tranzitia53 = new Tranzitie("5",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul5101);
        templistaarce.add(arcul10151);
        tranzitia103 = new Tranzitie("10",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arculc105);
        templistaarce.add(arcul15c10);
        tranzitiac101 = new Tranzitie("C10",templistaarce);

        templistaarce = new ArrayList<Arc>();
        templistaarce.add(arcul0c10);
        templistaarce.add(arculc1010);
        tranzitiac103 = new Tranzitie("C10",templistaarce);


        Tranzitii.add(tranzitiac151);
        Tranzitii.add(tranzitia51);
        Tranzitii.add(tranzitia101);
        Tranzitii.add(tranzitia52);
        Tranzitii.add(tranzitiac152);
        Tranzitii.add(tranzitia102);
        Tranzitii.add(tranzitiac102);
        Tranzitii.add(tranzitia53);
        Tranzitii.add(tranzitia103);
        Tranzitii.add(tranzitiac101);
        Tranzitii.add(tranzitiac103);

    }

    protected String taglocatiejeton()
    {
        List<Locatie> listalocatii;
        listalocatii=starejetoatelocatii();
        for(int i=0;i<listalocatii.size();i++){
            if(listalocatii.get(i).Get_jetoane()!=0)
                return listalocatii.get(i).Get_tag();
        }
        return null;
    }
}
