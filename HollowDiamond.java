/*
 * deysi garcia
 */
public class HollowDiamond extends BasicShape implements Diamond {//child class
	
	private int width; //instance variable
	
	public HollowDiamond()
	{
		super();
		this.width = 3; //default value
	}
	
	public HollowDiamond(int aH, int aWI)
	{
		super(aH); 
		this.setWidth(aWI);
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public void setWidth(int aWI) //mutators, check for errors
	{
		if(aWI >= 3)
			this.width = aWI; //how to take in only odd numbers, if it is an even number then add one to value
		else
			this.width = 3;
	}
	
	public void drawShape()
		{
			int spaces = this.getWidth()/2; //draw the shape with width
			skipSpaces(spaces + super.getHSpace());
			System.out.println("*");
			
			int innerSpace = 1;
			
			for(int i=0;i<this.getWidth()/2;i++)
			{
				skipSpaces(super.getHSpace());
				skipSpaces(spaces-1);
				spaces--;
				System.out.println("*");
				skipSpaces(innerSpace);
				innerSpace = innerSpace +2;
				System.out.println("*");
			}
			
			for(int i=0;i<(this.getWidth()/2)-1;i++)
			{
				skipSpaces(super.getHSpace());
				skipSpaces(spaces+1);
				spaces++;
				System.out.println("*");
				skipSpaces(innerSpace-4);
				innerSpace = innerSpace-2;
				System.out.println("*");
			}
		}
}