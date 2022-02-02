/*
 * deysi garcia
 */
public class Clothing {
	//step 2: properties
	//always make instance variables PRIVATE
	private String type;
	private String color;
		
	//step 3: constructors
	public Clothing() //Default
		{
		this.type = "Socks"; //this refers to this instance
		this.color = "Black"; //use "this" so we don't confuse parameters
		}
	public Clothing(String aT, String aC)
	{
		this.setType(aT);  //paramatized constructor- create an instance of an object and assign from a one-single statement
		this.setColor(aC);
	}
//Step 4- Create Accessors
	public String getType ()
		{
			return this.type;
		}
	public String getColor ()
		{
			return this.color;
		}
// Step 5- Create Mutators
	public void setType(String aT)
	{
		if(aT.equals("Undergarments") || aT.equals("Socks") || aT.equals("Stockings") || aT.equals("Tops") || aT.equals("Bottoms") || aT.equals("Capes")) {
			this.type = aT;
		}
		else 
			this.type = "Socks"; //sets the default to gala if user entered wrong input
	}
	public void setColor(String aC)
	{
		if(aC.equals("Brown") || aC.equals("Red") || aC.equals("Pink") || aC.equals("Black") || aC.equals("White") || aC.equals("Orange") || aC.equals("Green") || aC.equals("Blue") || aC.equals("Purple") || aC.equals("Grey"))
			this.color = aC;
		else 
			this.color = "Black";  //sets the default to gala if user entered wrong input
	}
	public String toString() 
	{
		return "Type: "+this.type+" Color: "+this.color;
	}
	public boolean equals(Clothing aE)
	{
		return aE != null &&
				this.type.equals(aE.getType()) &&
				this.color.equals(aE.getColor());
	}

}
