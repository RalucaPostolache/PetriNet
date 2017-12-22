package petri;

public class Arc {
	private Locatie location;
    private int capacity;
    private String direction;
    public Arc(Locatie valueLocation, int valueCapacity, String valueDirection)
    {
        location=valueLocation;
        capacity=valueCapacity;
        direction=valueDirection;
    }
    public Locatie GetLocatie()
    {
        return this.location;
    }
    public boolean isValid()
    {
    	if (direction.equals("out")) {
			return true;
		}

		if (direction.equals("in")) {
			if(location.GetJetoane()>= capacity) {
			return true;
		}
		}
		return false;
    }

		
    public void update()
    {
        if(direction=="out") { 
            location.SetJetoane(location.GetJetoane() - capacity);
        }
        else if(direction=="in"){
            location.SetJetoane(location.GetJetoane() + capacity);
        }
    }
}
