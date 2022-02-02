/*
 * deysi garcia
 */
public class Person { 
	private String name; //only has one instance variable
	
	public Person()
	{
		this.name = "none";
	}
	
	public Person(String aN)
	{
		this.setName(aN);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	
	public String toString()
	{
		return "Name: "+this.name;
	}
	
	public boolean equals(Person aP)
	{
		return aP != null && //makes sure its not null
				this.name.equals(aP.getName());  //checks if the two names match each other
	}

}
