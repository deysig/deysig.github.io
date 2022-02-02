/*
 * deysi garcia
 */
//Step 1:define the class
public class Bread {
	//step 2: create the properties
	//can be instance variables or constants
	private String name;
	private int calorie;  //safeguard this information, encapsulation
	private String type;
	
	public Bread()
	{
		this.name = "none";
		this.calorie = 50;  //self-referential pointer, basically references "this" instances variables/methods
		this.type = "Whole Grain";
	}
	public Bread (String aN, int aC, String aT)   //parameterized constructor, sets all of its values
	{
		this.setName(aN);
		this.setCalorie(aC);
		this.setType(aT);
	}
	public String getName()
	{
		return this.name;
	}
	public int getCalorie()
	{
		return this.calorie;
	}
	public String getType()
	{
		return this.type;
	}
	
	//step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	public void setName(String aN)
	{
		if (aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalorie(int aC)
	{
		if (aC > 50 && aC < 250)   //checking for errors in the mutators
			this.calorie = aC;
		else
			this.calorie = 50;
	}
	public void setType(String aT)
	{
		if(aT.equals("Honey Wheat") || aT.equals("White") || aT.equals("Whole Grain") || aT.equals("Whole Wheat") )
			this.type = aT;
		else
			this.type = "Whole Grain";
	}
	public boolean equals(Bread aB)
	{
		return aB != null &&
				this.name.equalsIgnoreCase(aB.getName()) &&
				this.calorie == aB.getCalorie() &&
				this.type.equalsIgnoreCase(aB.getType());
	}
	public String toString()
	{
		return this.name+" "+this.calorie+" "+this.type+" ";
	}
}
