/*
 * deysi garcia
 */
//Step 1:define the class
public class MovingCircle {
	//step 2: create the properties
	//can be instance variables or constants
	private double xAxis;
	private double yAxis;
	private double diameter;
	private double xVelocity;
	private double yVelocity;
	
	public MovingCircle()  //step 3: constructors
	//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
	{
		this.xAxis = 0;
		this.yAxis = 0;
		this.diameter = 0;
		this.xVelocity = 0;
		this.yVelocity = 0;
	}
	
	public MovingCircle(double xAxis, double yAxis, double diameter, double xVelocity, double yVelocity)
	{
		this.setXAxis(xAxis);
		this.setYAxis(yAxis);
		this.setDiameter(diameter);
		this.setXVelocity(xVelocity);
		this.setYVelocity(yVelocity);
	}
	//step 4: create accessors, gives access to each one of the instance variable values outside if this class
	public double getXAxis()
	{
		return this.xAxis;
	}
	public double getYAxis()
	{
		return this.yAxis;
	}
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getXVelocity()
	{
		return this.xVelocity;
	}
	public double getYVelocity()
	{
		return this.yVelocity;
	}
	//step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	public void setXAxis(double xAxis)
	{
		if (xAxis > 0) 
			this.xAxis = xAxis;
		else
			this.xAxis = 0;
	}
	public void setYAxis (double yAxis)
	{
		if (yAxis > 0) 
			this.yAxis = yAxis;  //error checking
		else
			this.yAxis = 0;
	}
	public void setDiameter (double diameter)
	{
		if (diameter > 0.0) 
			this.diameter = diameter;
		else
			this.diameter = 0;
	}
	public void setXVelocity (double xVelocity)
	{
		this.xVelocity = xVelocity;
	}
	public void setYVelocity (double yVelocity)
	{
		this.yVelocity = yVelocity;
	}
	
	//step 6: other methods
	//toString & .equals 
	public String toString()
	{
		return "[Circle] X: "+this.xAxis+" "+"Y: "+this.yAxis+" "+"Diameter: "+this.diameter+" "+"Velocity X: "+this.xVelocity+" "+"Velocity Y:"+this.yVelocity;
	}
	public boolean equals(MovingCircle aC)
	{
		return aC != null &&
				this.xAxis == aC.getXAxis() &&
				this.yAxis == aC.getYAxis() &&
				this.diameter == aC.getDiameter() &&
				this.xVelocity == aC.getXVelocity() &&
				this.yVelocity == aC.getYVelocity();
	}
	
	public void move()
	{
		this.xAxis += this.xVelocity;
		this.yAxis += this.yVelocity;
	}
	
	public boolean isColliding(MovingCircle c2)
	{
		return this.diameter/2 + c2.getDiameter()/2 <= Math.sqrt(Math.pow(this.xAxis-c2.getXAxis(),2) + Math.pow(this.yAxis-c2.getYAxis(), 2));
	}
	
}

