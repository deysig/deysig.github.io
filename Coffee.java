/*
 * deysi garcia
 */
public class Coffee {
	
	private String name;
	private double amount;
	private double riskyAmount;//all private bc properties
	
	public Coffee()//always has to match the name of the class
	{
		this.name = "none";//this refers to the current object
		this.amount = 50;
	}
	
	public Coffee (String aN, double aAM)//parameter aN & aAM
	{ //String aN & double aAM assigns the instance variable values as long as they are valid
		this.setName(aN);
		this.setAmount(aAM);//calls the mutators
	}
	
	public String getName()//accessors
	{//since we called them private, we can't directly access this info so we call the accessors
		return this.name; 
	}
	
	public double getAmount()
	{
		return this.amount;//"this" is a way to access a class' variables and methods
	}
	
	public double getRiskyAmount()//this is just going output the risky amount
	{
		return 180.0 / ((getAmount() / 100.0) * 6.0);//formula
	}
	
	public void setName(String aN)
	{
		if (aN != null)
		{
			this.name = aN;//if user does not enter a name it will print out the default name "none"
		}
		else
		{
			this.name = "none";
		}
	}
	
	public void setAmount(double aAM)
	{
		if (aAM <= 50 && aAM >=300)//user can only put values from 50mg to 300mg
		{//with this we're setting the values and if user puts in any other values computer will do default value
			this.amount = aAM;
		}
		else 
		{
			this.amount = 50;
		}
	}

	public boolean equals (Coffee aCoffee)//checks to see if another instance of this same type has the same properties
	{
		return aCoffee != null &&//make sure the other instance is not null
				this.name.equals(aCoffee.getName()) &&
				this.amount == aCoffee.getAmount();
	}
	
	public String toString()//this is overriding the method
	{
		return this.name+" "+this.amount+" ";
	}

}
