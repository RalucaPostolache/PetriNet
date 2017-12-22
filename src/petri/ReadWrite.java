package petri;

import java.util.ArrayList;
import java.util.List;

public class ReadWrite extends PetriNet{
	
	private List<Tranzitie> lista;
	
	public ReadWrite() {
		CreateList("Worker", 5, 1, "out", "StartRead");
		CreateList("Reading", 0, 1, "in", "StartRead");
		CreateList("Reading", 1, 1, "out", "EndRead");
		CreateList("Worker", 4, 1, "in", "EndRead");
		CreateList("Worker", 5, 5, "out", "StartWrite");
		CreateList("Writing", 0, 1, "in", "StartWrite");
		CreateList("Writing", 1, 1, "out", "EndWrite");
		CreateList("Worker", 0, 5, "in", "EndWrite");
	}
	
	public void CreateList(String locTag, int nrJ, int capacity, String direction, String transTag)
    {
        Locatie location = new Locatie(nrJ, locTag);
        Arc arc = new Arc(location, capacity, direction);
        List<Arc> arce = new ArrayList<Arc>();
        arce.add(arc);
        Tranzitie transition = new Tranzitie(transTag, arce);
        lista.add(transition);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
