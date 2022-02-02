/*
 * deysi garcia
 */
public class Student extends Person { //established the inheritance relationship
			//student is a person
	
	private int id; //all students have a student id but every person has an id
	
	public Student()
	{
		super(); //Persons default constructor
		this.id=0;
	}
	
	public Student(String aN, int anID)
	{
		super(aN); //person's param constructor
		this.setID(anID);
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setID(int anID)
	{
		if(anID >= 0)
			this.id=anID;
		else
			this.id=0;
	}
	
	public String toString()
	{
		return super.toString()+" ID: "+this.id;//calls the Person's toString method from other class
	}
	
	public boolean equals(Student aS)
	{
		return aS != null && //if aS is not null
				super.equals(aS) && //and their name is a match
				this.id == aS.getID(); //and their ID is a match then it will print out true
	}
	
	
}
