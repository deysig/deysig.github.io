/*
 * deysi garcia
 */
//Step 1:define the class
public class Wheel {
	//step 2: create the properties
		//can be instance variables or constants

	private double diameter;  //"what info do we want to keep track of
	private double width;
	
	public Wheel()  //step 3: constructors
	//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
	{
		this.diameter = 16; //self-referential pointer, basically references "this" instances variables/methods
		this.width = 1;
	}
	public Wheel(double aD, double aW)
	{
		this.setDiameter(aD); //parameterized constructor, sets all of its values
		this.setWidth(aW);  
	}
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void setDiameter(double aD)
	{
		if(aD >= 16 && aD <= 55)
			this.diameter = aD;
		else
			this.diameter = 16;
	}
	public void setWidth(double aW)  //step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	{
		if(aW >= 1 && aW <= 2.5) //checking for errors in the mutators
			this.width = aW;
		else
			this.width = 1;
	}
	public String toString() //purpose is to return a string that is related to this instance
	//no parameters for toString
	{
		return "[Wheel] Diameter"+this.diameter+"Width: "+this.width;
	}
	public boolean equals (Wheel aW)
	{
		return aW != null &&
				this.diameter == (aW.getDiameter()) &&
				this.width == aW.getWidth();
	}
}
