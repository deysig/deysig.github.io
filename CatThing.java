/*deysi garcia
 * 
 */
//step 1:define class
public class CatThing { //no main method bc we're creating our own
//step 2: properties
//always make instance variables PRIVATE
//all the variables will repeat every time for each "cat"
	private String name;
	private double weight;
	private int numberOfLegs;
//step 3: constructors
	public CatThing()//default constructor
	{
		this.name = "none"; //this refers to this instance
		this.weight = 1.0;//use "this" so we don't confuse parameters
		this.numberOfLegs = 4;
		
	}
	//paramatized constructor- create an instance of an object and assign from a one-single statement
	public CatThing(String aN, double aW, int aNum)
	{
		this.setName(aN);
		this.setWeight(aW);
		this.setNumberOfLegs(aNum);
	}
	//step 4: create access-provide access to other users
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getNumberOfLegs()
	{
		return this.numberOfLegs;
	}
	//step 5: mutators
	public void setName(String aN)
	{
		if(aN != null)
		{
			this.name = aN;
		}
		else
		{
			this.name = "none";
		}
	}
	public void setWeight(double aW)
	{
		if(aW > 0.0)
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 1.0;
		}
	}
	public void setNumberOfLegs(int aNum)
	{
		if(aNum >= 0 && aNum <=4)
		{
			this.numberOfLegs = aNum;
		}
		else
		{
			this.numberOfLegs = 4;
		}
	}
	public boolean equals(CatThing aC) 
	{
		return aC != null &&
				this.name.equals(aC.getName()) &&
				this.weight == aC.getWeight() &&
				this.numberOfLegs == aC.getNumberOfLegs();
	}
	public String toString()
	{
		return this.name+" "+this.weight+" "+this.numberOfLegs;
	}
	public void eat()
	{
		this.weight += 1.0;
	}
	public void sleep()
	{
		System.out.println("Zzz. Cat snore");
	}
	public void destroyYourStuff()
	{
		System.out.println("I am become"+this.name+"destroyer of worlds");
	}
	
}
