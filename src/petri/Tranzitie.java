package petri;
import java.util.List;

public class Tranzitie {
	public String tag;
	private List<Arc> arce;
	
	public Tranzitie(String valueTag, List<Arc> valueArce)
    {
        this.arce=valueArce;
        this.tag=valueTag;
    }
	public String GetTag()
    {
        return this.tag;
    }
    public List<Arc> GetArce()
    {
        return this.arce;
    }
    public boolean isValid()
    {
    	boolean ok=true;
    	for (Arc a : arce) {
			if (!a.isValid()) {
				ok=false;
			}
		}
    	return ok;
    }
    public void update() {
		if (!isValid()) {
			return;
		}

		for (Arc arc : arce) {
			arc.update();
		}
    }
}
