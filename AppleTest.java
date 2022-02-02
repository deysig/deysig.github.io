/*
 * deysi garcia
 */
public class AppleTest {

	public static void main(String[] args) {
		
		Apple apple01 = new Apple();//creating apple 01 for the first apple
		
		System.out.println("Welcome to the apple tester");
		System.out.println("\nCreating a default apple \nPrinting the default apple's value");
		
		apple01.setType("Gala");
		apple01.setWeight(0.0);//setting the data to the defaults
		apple01.setPrice(0.0);
		
		System.out.println("Type: "+apple01.getType()+ " Weight: "+apple01.getWeight()+" Price: "+apple01.getPrice());
		//the code above is going to get the default values
		
		Apple apple02 = new Apple("Granny Smith", 0.75 , 0.99);
	
		System.out.println("\nCreating another apple");
		System.out.println("Setting the new apple's values to the following, \nvalid values");
		System.out.println("\"Granny Smith 0.75 0.99\"");
		System.out.println("Printing the new apple's values");
		

		apple02.setType("Granny Smith");
		apple02.setWeight(0.75);
		apple02.setPrice(0.99);
		
		System.out.println("Type: "+apple02.getType()+ " Weight: "+apple02.getWeight()+" Price: "+apple02.getPrice());
		
		Apple apple03 = new Apple();
		
		System.out.println("\nCreating another default apple");
		System.out.println("Then setting the new apple's values to the following, \ninvalid values \"iPad 2,5 -200\"");
		System.out.println("Printing the newest apple's values which should not have \nchanged from the default values");
		
		apple03.setType("Gala");
		apple03.setWeight(0.0);
		apple03.setPrice(0.0);
		
		System.out.println("Type: "+apple03.getType()+ " Weight: "+apple03.getWeight()+" Price: "+apple03.getPrice());
		
		System.out.println("\nChecking if the first and last apple have the same values");
		System.out.println(apple01.equals(apple03));
		
		
	}

}
