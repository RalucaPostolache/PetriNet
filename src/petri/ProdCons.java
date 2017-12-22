package petri;

import java.util.ArrayList;
import java.util.List;

public class ProdCons {

	private List<Tranzitie> lista;
	
	public void CreateList(String locTag, int nrJ, int capacity, String direction, String transTag)
    {
        Locatie location = new Locatie(nrJ, locTag);
        Arc arc = new Arc(location, capacity, direction);
        List<Arc> arce = new ArrayList<Arc>();
        arce.add(arc);
        Tranzitie transition = new Tranzitie(transTag, arce);
        lista.add(transition);
    }
	
	public ProdCons() {
		
		CreateList("producatori", 10, 1, "out", "produse");
		CreateList("producatori", 9, 1, "in", "push");
		CreateList("prodDataReady", 0, 1, "in", "produse");
		CreateList("prodDataReady", 0, 1, "out", "push");
		CreateList("prodDataReady", 0, 1, "out", "push");
		CreateList("pozitiiOcupate", 0, 1, "in", "push");
		CreateList("pozitiiOcupate", 0, 1, "out", "pop");
		CreateList("pozitiiLibere", 5, 1, "in", "pop");
		CreateList("pozitiiLibere", 0, 1, "out", "push");
		CreateList("mutex", 1, 1, "in", "pop");
		CreateList("mutex", 1, 1, "out", "pop");
		CreateList("mutex", 1, 1, "in", "push");
		CreateList("mutex", 1, 1, "out", "push");
		CreateList("consDataReady", 0, 1, "in", "pop");
		CreateList("consDataReady", 0, 1, "out", "consum");
		CreateList("consumatori", 9, 1, "in", "consum");
		CreateList("consumatori", 9, 1, "out", "pop");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
