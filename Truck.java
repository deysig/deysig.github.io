/*
 * deysi garcia
 */
public class Truck extends Vehicle {//child class
	
	private double loadCapacity;//instance varibles
	private double towingCapacity;
	
	public Truck()
	{
		super();
		this.loadCapacity = 0;
		this.towingCapacity = 0;
	}
	
	public Truck(String aMN, int aNC, String aON, double aLC, double aTC)
	{
		super(aMN, aNC, aON); //use super so that we can pull data from the Vehicle class
		this.setLoadCapacity(aLC);
		this.setTowingCapacity(aTC);//has to put in instance varibles from Vehicle class
	}
	
	public double getloadCapacity()
	{
		return this.loadCapacity;
	}
	
	public double gettowingCapacity()
	{
		return this.towingCapacity;
	}
	
	public void setLoadCapacity(double aLC)
	{
		if(aLC >= 0)
			this.loadCapacity = aLC; //mutators
		else
			this.loadCapacity = 0;
	}
	
	public void setTowingCapacity(double aTC)
	{
		if(aTC >= 0)
			this.towingCapacity = aTC;
		else
			this.towingCapacity = 0;  //error checking
	}
	
	public boolean equals(Truck aT)
	{
		return aT != null &&  //gonna print out true if everything matches up
				super.equals(aT) &&
				this.loadCapacity == aT.getloadCapacity() &&
				this.towingCapacity == aT.gettowingCapacity();
	}
	
	public String toString()  //this is going to print out after we get info from user
	{
		return super.toString()+" Load Capacity: "+this.loadCapacity+" Towing Capacity: "+this.towingCapacity;
	}

}
