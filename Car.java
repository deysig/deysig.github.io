/*
 * deysi garcia
 */
public class Car extends Vehicle {
	
	private double gasMileage;//instance varibles
	private int numberOfPassengers;
	
	public Car()
	{
		super();
		this.gasMileage = 0;
		this.numberOfPassengers = 0;
	}
	
	public Car(String aMN, int aNC, String aON, double aGM, int aNP)
	{
		super(aMN, aNC, aON); //use super so that we can pull data from the Vehicle class
		this.setGasMileage(aGM);//has to put in instance varibles from Vehicle class
		this.setNumberOfPassengers(aNP);
	}
	
	public double getGasMileage()
	{
		return this.gasMileage;
	}
	
	public int getNumberOfPassengers()
	{
		return this.numberOfPassengers;
	}
	
	public void setGasMileage(double aGS)
	{
		if(aGS >= 0)
			this.gasMileage = aGS; //mutators
		else
			this.gasMileage = 0;//error checking
	}
	
	public void setNumberOfPassengers(int aNP)
	{
		if(aNP >= 0)
			this.numberOfPassengers = aNP;//error check
		else
			this.numberOfPassengers = 0;
	}
	
	public boolean equals(Car aC)
	{
		return aC != null && //gonna print out true if everything matches up
				super.equals(aC) &&
				this.gasMileage == aC.getGasMileage() &&
				this.numberOfPassengers == aC.getNumberOfPassengers();
	}
	
	public String toString()//this is going to print out after we get info from user
	{	//use super
		return super.toString()+" Gas Mileage: "+this.gasMileage+" Passengers: "+this.numberOfPassengers;
	}

}
