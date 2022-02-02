/*
 * deysi garcia
 */
//Step 1:define the class
public class Box {
	//step 2: create the properties
	//can be instance variables or constants

	private String label;
	private double length;  //safeguard this information
	private double width;
	private double height;
	//private double volume;
	
	public Box()  //step 3: constructors
	{
		this.label = "none";
		this.length = this.width = this.height = 1;
		
	}
	public Box(String aL, double aLE, double aW, double aH)
	{
		this.setLabel(aL);
		this.setLength(aLE);
		this.setWidth(aW);
		this.setHeight(aH);
	}
	public String getLabel()
	{  //no parameters because we don't need to give it info because we are getting the info
		return this.label;
	}
	public double getLength()  //step 4: create accessors
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setLabel(String aL)  //step 5: create mutators
	{
		if (aL != null)  //making sure the String aN is not null, if parameter is even correct
			this.label = aL;
		else
			this.label = "none";
	}
	public void setLength(double aLE)
	{
		if (aLE > 0)
			this.length = aLE;
		else
			this.length = 1;
	}
	public void setWidth(double aW)
	{
		if (aW > 0)
			this.width = aW;
		else
			this.width = 1;
	}
	public void setHeight(double aH)
	{
		if (aH > 0)
			this.height = aH;
		else
			this.height = 1;
	}
	public double getVolume()  //step 6: other methods
	{
		return length*width*height;
	}
	public String toString() 
	{
		return "Label: "+this.label+" Volume: "+getVolume();
	} 
}
