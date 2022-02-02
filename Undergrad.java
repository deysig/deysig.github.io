/*
 * deysi garcia
 */
public class Undergrad extends Student {
	
	private int level;
	
	public Undergrad()
	{
		super(); //calls the Student's default constructor
		this.level=1;
	}
	
	public Undergrad(String aN, int anID, int aL) //include all the properties from other classes
	{
		super(aN,anID);
		this.setLevel(aL);
	}
	
	public int getLevel()
	{
		return this.level;
	}
	
	public void setLevel(int aL)
	{
		if(aL>=1 && aL<=4)
			this.level=aL;
		else
			this.level=1;
	}
	
	public String toString()
	{
		return super.toString()+" Level: "+this.level;
	}
	
	public boolean equals(Undergrad aU)
	{
		return aU != null && 
				super.equals(aU) &&
				this.level == aU.getLevel();
	}

}
