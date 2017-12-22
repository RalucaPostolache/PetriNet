package petri;
import java.util.List;
import java.util.ArrayList;

public class CoffeeMachine extends PetriNet{
	
	private List<Tranzitie> lista;

	public CoffeeMachine() {
		CreateList("0", 1, 1, "out", "5");
		CreateList("0", 1, 1, "out", "10");
		CreateList("0", 0, 1, "in", "C10");
		CreateList("0", 0, 1, "in", "C15");
		CreateList("5", 1, 1, "out", "5");
		CreateList("5", 1, 1, "out", "10");
		CreateList("5", 0, 1, "in", "C10");
		CreateList("5", 1, 1, "in", "5");
		CreateList("10", 0, 1, "in", "5");
		CreateList("10", 1, 1, "out", "5");
		CreateList("15", 0, 1, "in", "5");
		CreateList("15", 0, 1, "in", "10");
		CreateList("10", 1, 1, "out", "C10");
		CreateList("15", 1, 1, "out", "C15");
		
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
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		coffeeMachine.exec("5");
	}

}
