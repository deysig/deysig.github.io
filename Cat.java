/*
 * deysi garcia
 */
public class Cat extends Animal {  //child class
	
	private String mood;
	
	public Cat()
	{
		super();  //need this to pull info from the parent class
		this.mood = "sleepy";
	}
	
	public Cat(String aN, double aW, String aM)
	{
		super(aN,aW);  //we get the parameters
		this.setMood(aM);
	}
	
	public String getMood()
	{
		return this.mood;
	}
	
	public void setMood(String aM)
	{
		if(aM == "sleepy" || aM == "playful" || aM == "hunger")
			this.mood = aM;  //error checking
		else
			this.mood = "sleepy";
	}
	
	public boolean equals(Cat aC)
	{
		return aC != null &&  //will print out true if everything matches up
				super.equals(aC) &&
				this.mood.equals(aC.getMood());
	}
	
	public String toString()
	{
		return super.toString()+" Mood: "+this.mood;
	}

}
