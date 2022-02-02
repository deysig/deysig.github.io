/*
 * deysi garcia
 */
public class Apple {
	//step 2: properties
	//always make instance variables PRIVATE
	//all the variables will repeat every time for each "apple"
	private String type;
	private double weight;
	private double price;
	//step 3: constructors
	public Apple()
	{
		this.type = "Gala";//this refers to this instance
		this.weight = 0.0;//use "this" so we don't confuse parameters
		this.price = 0.0;
	}
	//paramatized constructor- create an instance of an object and assign from a one-single statement
	public Apple (String aT, double aW, double aP)
	{
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setType (String aT)
	{
		if (aT != null)
		{
			this.type = aT;
		}
		else
		{
			this.type = "Gala";//sets the default to gala if user entered wrong input
		}
	}
	public void setWeight(double aW)
	{
		if (aW < 0  && aW > 2)//had to be between 0 and 2 kg
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 0.0;//if user enters invalid data it will go to the default values
		}
	}
	public void setPrice( double aP)
	{
		if (aP > 0)
		{//price had to be greater than 0
			this.price = aP;
		}
		else
		{
			this.price = 0.0;
		}
	}
	public boolean equals(Apple aA)
	{
		return aA != null &&
				this.type.equals(aA.getType()) &&
				this.weight == aA.getWeight() &&//checks if properties are the same
				this.price == aA.getPrice();
	}
	public String toString()//no parameters
	{
		return this.type+" "+this.weight+" "+this.price+" ";
	}

}
