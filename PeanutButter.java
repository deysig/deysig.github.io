/*
 * deysi garcia
 */
//Step 1:define the class
public class PeanutButter {
	//step 2: create the properties
		//can be instance variables or constants
	private String name;
	private  int calorie;
	private boolean isCrunchy;
	
	public PeanutButter()  //step 3: constructors
	//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
	{
		this.name = "none";
		this.calorie = 100;
		this.isCrunchy = false;
	}
	public PeanutButter(String aN, int aC, boolean aCr)
	{
		this.setName(aN);
		this.setCalorie(aC);
		this.setisCrunchy(aCr);
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
	public boolean getisCrunchy()
	{
		return this.isCrunchy;
	}
	
	//step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	public void setName(String aN)
	{
		if (aN != null)  //making sure the String aN is not null, if parameter is even correct
			this.name = aN;   //checking for errors in the mutators
		else 
			this.name = "none";
	}
	public void setCalorie(int aC)
	{
		if (aC > 100 && aC < 300)
			this.calorie = aC;
		else
			this.calorie = 100;
	}
	public void setisCrunchy(boolean aCr)
	{
		if (aCr == true)
			this.isCrunchy = aCr;
		else
			this.isCrunchy = false;
	}
	public boolean equals(PeanutButter aPB)
	{
		return aPB != null &&
				this.name.equals(aPB.getName()) &&
				this.calorie == aPB.getCalorie() &&
				this.isCrunchy == aPB.getisCrunchy();
	}
	public String toString()   //purpose is to return a string that is related to this instance
							//no parameters for toString
	{
		return this.name+" "+this.calorie+" "+this.isCrunchy+" ";
	}
}
