/*
 * deysi garcia
 */
public class Animal {  //parent class
	
	private String name;
	private double weight;
	
	public Animal()
	{
		this.name = "none";
		this.weight = 1;
	}
	
	public Animal(String aN, double aW)
	{
		this.setName(aN);
		this.setWeight(aW); //instance variables
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public void setName(String aN)
	{
		if(aN != null) //error checking
			this.name = aN;
		else
			this.name = "none";
	}
	
	public void setWeight(double aW)
	{
		if(aW >= 1) //error checking
			this.weight = aW;
		else
			this.weight = 1;
	}
	
	public boolean equals(Animal aAN)
	{
		return aAN != null &&  //will print out true if everything matches up
				this.name.equals(aAN.getName()) &&
				this.weight == (aAN.getWeight());
	}
	
	public String toString()
	{
		return " Name: "+this.name+" Weight: "+this.weight;
	}

}
