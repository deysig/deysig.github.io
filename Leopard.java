/*
 * deysi garcia
 */
public class Leopard extends Cat {  //child class
	
	private int numberOfSpots;
	
	public Leopard()
	{
		super();  //need this to pull info from the parent class
		this.numberOfSpots = 1;
	}
	
	public Leopard(String aN, double aW, String aM, int aNS)
	{
		super(aN, aW, aM);  //we get the parameters from the cat class
		this.setNumberOfSpots(aNS);
	}
	
	public int getNumberOfSpots()
	{
		return this.numberOfSpots;
	}
	
	public void setNumberOfSpots(int aNS)
	{
		if(aNS >= 1)  //error checking
			this.numberOfSpots = aNS;
		else
			this.numberOfSpots = 1;
	}
	
	public boolean equals(Leopard aL)
	{
		return aL != null &&  //will print out true if everything matches up
				super.equals(aL) &&
				this.numberOfSpots == aL.getNumberOfSpots();
	}
	
	public String toString()
	{
		return super.toString()+" Number of Spots: "+this.numberOfSpots;
	}

}
