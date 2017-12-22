package petri;
import java.util.List;
import java.util.ArrayList;

public class PetriNet {
	List<Tranzitie> transitionList = new ArrayList<>();
	
	
	public boolean exec(String action){
		List<Tranzitie> currentTransitions = new ArrayList<>();
		boolean ok=false;
        for(Tranzitie transition : transitionList){
            if(transition.tag == action && transition.isValid()){
               currentTransitions.add(transition);
               ok=true;
            }
        }
        for (Tranzitie currentTransition : currentTransitions) {
            currentTransition.update();
        }
        return ok;
	}
}
