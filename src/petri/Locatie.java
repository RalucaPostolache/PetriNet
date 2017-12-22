package petri;

public class Locatie {
	private int nrJ;
	private String tag;
	
	public Locatie(int nrJ, String tag) {
		this.nrJ=nrJ;
		this.tag=tag;
	}
	public String GetTag()
    {
        return this.tag;
    }
	public void SetTag(String tag)
    {
        this.tag=tag;
    }
    public int GetJetoane()
    {
        return this.nrJ;
    }
    public void SetJetoane(int jetoane)
    {
        this.nrJ=jetoane;
    }
}
