/*
 * deysi garcia
 */
public class HouseCat extends Cat {  //child class
	
	private String type;
	
	public HouseCat()
	{
		super();  //need this to pull info from the parent class
		this.type = "Short Hair";
	}
	
	public HouseCat(String aN, double aW, String aM, String aT)
	{
		super(aN, aW, aM); //we get the parameters from the cat class
		this.setType(aT);
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String aT)
	{
		if(aT.equalsIgnoreCase("Short Hair") || aT.equalsIgnoreCase("Ragdoll") || aT.equalsIgnoreCase("Sphinx") || aT.equalsIgnoreCase("Scottish Fold"))
			this.type = aT;  //error checking
		else
			this.type = "Short Hair";
	}
	
	public boolean equals(HouseCat aHC)
	{
		return aHC != null &&  //will print out true if everything matches up
				super.equals(aHC) &&
				this.type.equals(aHC.getType());
	}
	
	public String toString()
	{
		return super.toString()+" Type: "+this.type;
	}
	

}
