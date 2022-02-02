/*
 * deysi garcia
 */
public class Wolf extends Dog {  //child class
	//gets data from the dog class
	
	private String packLeader;  //instance variable
	
	public Wolf()
	{
		super(); //need this to pull info from the parent class
		this.packLeader = "none";
	}
	
	public Wolf(String aN, double aW, int aEL, String aPL) //have to add parameters from dog class
	{
		super(aN, aW, aEL); //we get the parameters from the dog class
		this.setPackLeader(aPL);
	}
	
	public String getPackLeader()
	{
		return this.packLeader;
	}
	
	public void setPackLeader(String aPL)
	{
		if(aPL != null) //error checking
			this.packLeader = aPL;
		else
			this.packLeader = "none";
	}
	
	public boolean equals(Wolf aO)
	{
		return aO != null &&  //will print out true if everything matches up
				super.equals(aO) &&
				this.packLeader.equals(aO.getPackLeader());
	}
	
	public String toString() 
	{
		return super.toString()+" Pack Leader: "+this.packLeader; //this will print once we have info from user
	}

}
