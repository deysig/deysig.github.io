/*
 * deysi garcia
 */
public interface Shape {
	//write method signatures for everything that every shape is going to do
	
	public void setHSpace(int aH); //write method signature but not the method body
				//setHSpace corresponds to how many spaces that its going to skip before it draws the shape

	public int getHSpace(); //return the amount of horizontal space that we have
	
	public void drawShape(); //if this is a shape then we have to be able to draw it in the console
	
	public void drawShapeAt(int lineNumber); //indicates the number of line numbers that it will skip down before it draws the shape

}
