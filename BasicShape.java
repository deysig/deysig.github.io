/*
 * deysi garcia
 */
public class BasicShape implements Shape 
{
	private int hSpace;
	
	public BasicShape()
	{
		this.hSpace = 0; //default size
	}
	
	public BasicShape(int aH)
	{
		this.setHSpace(aH); //this method takes care of one method in the Class "Shape"
	}
	
	public int getHSpace() //this tales care of another method in the class "Shape"
	{
		return this.hSpace;
	}
	
	public void setHSpace(int aH)
	{
		if (aH >= 0) //error checking
			this.hSpace = aH;//if user enters correct info
		else
			this.hSpace = 0; //default size if user puts in incorrect info
	}
	
	public void drawShape()
	{
		skipSpaces(this.hSpace); //whenever we call this method, it is going to skip spaces horizontally that's based on the instance
								//variable but based on the static method and then it's just gonna draw an "*"
		System.out.println("*");
	}
	
	public void drawShapeAt(int lineNumber) //this skips the number of lines vertically before it draws the shape
	{
		for(int i = 0; i < lineNumber;i++)
			System.out.println();//this skips the number of lines
		
		drawShape(); //draws the shape bc it calls from the method 'drawShape()'
	}
	
	public static void skipSpaces(int aH) //this is going to skip lines
	{
		for(int i = 0; i < aH; i++)
			System.out.print(" ");
	}
	
	

}
