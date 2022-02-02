/*
 * deysi garcia
 */
//Step 1:define the class
public class Jelly {
	//step 2: create the properties
		//can be instance variables or constants
	private String name;
	private int calorie;
	private String fruitType;
	
	public Jelly()  //step 3: constructors
	//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
	{
		this.name = "none";
		this.calorie = 50;
		this.fruitType = "Grape";
	}
	public Jelly (String aN, int aC, String aFt)
	{
		this.setName(aN);
		this.setCalorie(aC);
		this.setType(aFt);
	}
	//step 4: create accessors, gives access to each one of the instance variable values outside if this class
	public String getName()
	{
		return this.name;
	}
	public int getCalorie()
	{
		return this.calorie;
	}
	public String getFruitType()
	{
		return this.fruitType;
	}
	//step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	public void setName(String aN)
	{
		if (aN != null)  //making sure the String aN is not null, if parameter is even correct
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalorie(int aC)
	{
		if (aC > 50 && aC < 200)   //checking for errors in the mutators
			this.calorie = aC;
		else
			this.calorie = 50;
	}
	public void setType(String aT)
	{
		if(aT.equals("Apple") || aT.equals("Blackberry") || aT.equals("Grape") || aT.equals("Mango") || aT.equals("Tomato") )
			this.fruitType = aT;
		else
			this.fruitType = "Grape";
	}
	public boolean equals(Jelly aJ)
	{
		return aJ != null &&
				this.name.equalsIgnoreCase(aJ.getName()) &&
				this.calorie == aJ.getCalorie() &&
				this.fruitType.equalsIgnoreCase(aJ.getFruitType());
	}
	public String toString()  //purpose is to return a string that is related to this instance
							//no parameters for toString
	{
		return this.name+" "+this.calorie+" "+this.fruitType+" ";
	}
}
