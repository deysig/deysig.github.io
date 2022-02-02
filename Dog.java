/*
 * deysi garcia
 */
public class Dog extends Animal {  //child class
	
	private int energyLevel;
	
	public Dog()
	{
		super();  //need this to pull info from the parent class
		this.energyLevel = 0;
	}
	
	public Dog(String aN, double aW, int aEL)
	{
		super(aN,aW); //parameters
		this.setEnergyLevel(aEL);
	}
	
	public int getEnergyLevel()
	{
		return this.energyLevel;
	}
	
	public void setEnergyLevel(int aEL)
	{
		if(aEL >= 0 && aEL <= 100)  //error checking
			this.energyLevel = aEL;
		else
			this.energyLevel = 0;
	}
	
	public boolean equals(Dog aD)
	{
		return aD != null &&  //will print out true if everything matches up
				super.equals(aD) &&
				this.energyLevel == (aD.getEnergyLevel());
	}
	
	public String toString()
	{
		return super.toString()+" Energy Level: "+this.energyLevel;
	}

}
