/*
 * deysi garcia
 */
//Step 1:define the class
public class PBJSandwich {
	//step 2: create the properties
		//can be instance variables or constants
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	
	public PBJSandwich()  //step 3: constructors
	//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
	{
		Bread aB = new Bread();
		this.topSlice = new Bread();
		
		PeanutButter aPB = new PeanutButter();
		this.peanutButter = new PeanutButter();
		
		Jelly aJ = new Jelly();
		this.jelly = new Jelly();
		Bread aBr = new Bread();
		this.bottomSlice = new Bread();
	}
	public PBJSandwich(Bread aTS, PeanutButter aPB, Jelly aJ, Bread aBS)
	{
		this.settopSlice(aTS);
		this.setpeanutButter(aPB);
		this.setJelly(aJ);
		this.setbottomSlice(aBS);
	}
	//step 4: create accessors, gives access to each one of the instance variable values outside if this class
	public Bread gettopSlice()
	{
		return this.topSlice;
	}
	public PeanutButter getpeanutButter()
	{
		return this.peanutButter;
	}
	public Jelly getJelly()
	{
		return this.jelly;
	}
	public Bread getbottomSlice()
	{
		return this.bottomSlice;
	}
	//step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	public void settopSlice(Bread aTS)
	{
		if (aTS != null)  //making sure the String aN is not null, if parameter is even correct
			this.topSlice = aTS;
		else
			this.topSlice = new Bread();
	}
	public void setpeanutButter(PeanutButter aPB)
	{
		if (aPB != null)
			this.peanutButter = aPB;
		else
			this.peanutButter = new PeanutButter();
	}
	public void setJelly(Jelly aJ)
	{
		if (aJ != null)
			this.jelly = aJ;
		else
			this.jelly = new Jelly();
	}
	public void setbottomSlice(Bread aBS)
	{
		if (aBS != null)
			this.bottomSlice = aBS;   //checking for errors in the mutators
		else
			this.bottomSlice = new Bread();
	}
	public boolean equals (PBJSandwich aS)
	{
		return aS != null &&
				this.topSlice.equals(aS.gettopSlice()) &&
				this.jelly == aS.getJelly() &&
				this.peanutButter == aS.getpeanutButter() &&
				this.bottomSlice == aS.getbottomSlice();
	}
	public String toString()  //purpose is to return a string that is related to this instance
							//no parameters for toString
	{
		return this.topSlice+" "+this.peanutButter+" "+this.jelly+" "+this.bottomSlice+" ";
	}
}
