/*
 * deysi garcia
 */
public class Vehicle { //parent class

	private  String manufacturersName;
	private int numberOfCylinders; //instance variables
	private String ownersName;
	
	public Vehicle()
	{
		this.manufacturersName = "none";
		this.numberOfCylinders = 1;
		this.ownersName = "none";//default values
	}
	
	public Vehicle(String aMN, int aNC, String aON)
	{
		this.setManufacturersName(aMN); 
		this.setNumberOfCylinders(aNC);
		this.setOwnersName(aON);
	}
	
	public String getManufacturersName()
	{
		return this.manufacturersName;//accessors
	}
	
	public int getNumberOfCylinders()
	{
		return this.numberOfCylinders;
	}
	
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	public void setManufacturersName(String aMN)
	{
		if(aMN != null)//mutators
			this.manufacturersName = aMN;
		else
			this.manufacturersName = "none"; //error checking
	}
	
	public void setNumberOfCylinders(int aNC)
	{
		if(aNC >= 1)
			this.numberOfCylinders = aNC;
		else
			this.numberOfCylinders = 1; 
	}
	
	public void setOwnersName(String aON)
	{
		if(aON != null)
			this.ownersName = aON;
		else
			this.ownersName = "none"; //error check
	}
	
	public boolean equals(Vehicle aV)
	{
		return aV != null && //if everything matches up then it will print out true
				this.manufacturersName.equals(aV.getManufacturersName()) &&
				this.numberOfCylinders == (aV.getNumberOfCylinders()) &&
				this.ownersName.equals(aV.getOwnersName());
	}
	
	public String toString() //we ovveride so that when user puts in info then it will print out this way
	{
		return " Manufacturer's Name: "+this.manufacturersName+" Number of Cylinders: "+this.numberOfCylinders+" Owner: "+this.ownersName;
	}
	
}
