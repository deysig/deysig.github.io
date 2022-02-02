/*
 * deysi garcia
 */
public class Tester {

	public static void main(String[] args) {
		
		//Shape s = newShape();  //"s" becomes an instance of 'Shape', error
		
		Shape s = new BasicShape(); //no error because "BasicShape" is a class that implements--that is a shape
		
		s.drawShape();
		
		Shape[] shapes = new Shape[11]; //this is creating an array of 'Shapes[11]'
		
		shapes[0] = new BasicShape();
		shapes[1] = new BasicShape(4);
		shapes[2] = new BasicRectangle(0,2,3);
		shapes[3] = new BasicRectangle(2,3,4);
		
		for(int i =0; i< shapes.length;i++)
		{
			if(shapes[i] != null)
			{
				//shapes[i].drawShape();
				shapes[i].drawShapeAt(i);
			}
		}
	}

}
