/*
 * deysi garcia
 */
//Step 1:define the class
public class Frame {
	//step 2: create the properties
		//can be instance variables or constants

	private double size;
	private String type;  //"what info do we want to keep track of
	
	public Frame()
	{
		this.size = 18.5;  //step 3: constructors
		//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
		this.type = "Diamond"; //self-referential pointer, basically references "this" instances variables/methods
	}
	public Frame(double aS, String aT)
	{
		this.setSize(aS);  //parameterized constructor, sets all of its values
		this.setType(aT);
	}
	public double getSize()
	{
		return this.size;
	}
	public String getType()
	{
		return this.type;
	}
	public void setSize(double aS)  //step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	{
		if(aS >= 18.5 && aS <= 60)
			this.size = aS;
		else
			this.size = 18.5;
	}
	public void setType(String aT) //checking for errors in the mutators
	{
		if(aT.equals("Diamond") || aT.equals("Step-Through") || aT.equals("Truss") || aT.equals("Penny-Farthing") )
			this.type = aT;
		else
			this.type = "Diamond";
	}
	public String toString() //purpose is to return a string that is related to this instance
	//no parameters for toString
	{
		return"[Frame] Size: "+this.size+"Type: "+this.type;
	}
	public boolean equals (Frame aFrame)
	{
		return aFrame != null &&
				this.size == (aFrame.getSize()) &&
				this.type == aFrame.getType();
	}
}
