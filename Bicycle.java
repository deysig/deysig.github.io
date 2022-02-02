/*
 * deysi garcia
 */
//Step 1:define the class
public class Bicycle {
	//step 2: create the properties
		//can be instance variables or constants

	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;  //"what info do we want to keep track of
	private Frame frame;
	
	public Bicycle()
	{
		this.make = "none";
		Wheel aW = new Wheel();  //step 3: constructors
		//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
		this.frontWheel = new Wheel();
		
		Wheel aW2 = new Wheel();
		this.backWheel = new Wheel();
		
		Frame aF = new Frame();
		this.frame = new Frame();
	}
	public Bicycle(String aM, Wheel aFW, Wheel aBW, Frame aF)
	{
		this.setMake(aM);
		this.setFrontWheel(aFW);
		this.setBackWheel(aBW); //parameterized constructor, sets all of its values
		this.setFrame(aF);
	}
	public String getMake()
	{
		return this.make;
	}
	public Wheel getFrontWheel()
	{
		return this.frontWheel;
	}
	public Wheel getBackWheel()
	{
		return this.backWheel;
	}
	public Frame getFrame()
	{
		return this.frame;
	}
	public void setMake(String aM)  //step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	{
		if (aM != null)
			this.make = aM;
		else
			this.make = "none";
	}
	public void setFrontWheel(Wheel aFW)
	{
		if (aFW != null)
			this.frontWheel = aFW;
		else
			this.frontWheel = new Wheel();
	}
	public void setBackWheel(Wheel aBW)
	{
		if (aBW != null)
			this.backWheel = aBW;
		else
			this.backWheel = new Wheel();
	}
	public void setFrame(Frame aF)
	{
		if (aF != null)
			this.frame = aF; //checking for errors in the mutators
		else
			this.frame = new Frame();
	}
	public boolean equals (Bicycle aB)
	{
		return aB != null &&
				this.make.equals(aB.getMake()) &&
				this.frontWheel == aB.getFrontWheel() &&
				this.backWheel == aB.getBackWheel() &&
				this.frame == aB.getFrame();
	}
	public String toString()  //purpose is to return a string that is related to this instance
							//no parameters for toString
	{
		return"[Bicycle] Make: "+this.make+"Front Wheel "+this.frontWheel+"Back Wheel "+this.backWheel+"Frame "+this.frame+" ";
	}
}
