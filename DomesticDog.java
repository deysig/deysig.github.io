/*
 * deysi garcia
 */
public class DomesticDog extends Dog {  //child class
	
	private String type;
	
	public DomesticDog()
	{
		super();  //need this to pull info from the parent class
		this.type = "Mutt";
	}
	
	public DomesticDog (String aN, double aW, int aEL, String aT)
	{
		super(aN, aW, aEL);  //we get the parameters from the dog class
		this.setType(aT);
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String aT)
	{
		if(aT.equalsIgnoreCase("Retriever") || aT.equalsIgnoreCase("Terrier") || aT.equalsIgnoreCase("Husky") || aT.equalsIgnoreCase("Mutt"))
			this.type = aT; //error checking
		else
				this.type = "Mutt";
	}
	
	public boolean equals(DomesticDog aD)
	{
		return aD != null &&
				super.equals(aD) && //will print out true if everything matches up
				this.type.equals(aD.getType());
	}
	
	public String toString()
	{
		return super.toString()+" Type: "+this.type;
	}

}
