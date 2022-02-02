/*
 * deysi garcia
 */
import java.util.Scanner;
public class DresserFrontEnd {

	public static void main(String args[])
	{
		while (true) 
		{
		Dresser aD = new Dresser();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the dresser!");
		System.out.println("\nEnter 1: to add an item\nEnter 2: to remove an item\nEnter 9: to quit");
		int choice = keyboard.nextInt();//user enters the data we need
		//have a choice in adding, removing, or quitting
		
		keyboard.nextLine();
		
		if (choice == 1)
		{
			System.out.println("Enter information about the type of clothing, must be \"Undergarments\", \"Socks\", \"Stockings\", \"Top\", \"Bottom\", or \"Cape\"");
			String type = keyboard.nextLine();
			System.out.println("Enter information about the color of type of clothing, must be \"Brown\", \"Red\", \"Pink\", \"Black\", \"White\", \"Orange\", \"Green\", \"Blue\", \"Purple\", \"Grey\"");
			String color = keyboard.nextLine();
			Clothing aC = new Clothing (type, color);//the data that user entered will print out
			System.out.println(aC.getType() + " and our color is: " +  aC.getColor());
			aD.add(aC);//this will add the clothing
			aD.print();
		}
		else if (choice == 2)
		{
			System.out.println("Enter information about the type of clothing you want to remove, must be \"Undergarments\", \"Socks\", \"Stockings\", \"Top\", \"Bottom\", or \"Cape\"");
			String type = keyboard.nextLine();
			System.out.println("Enter information about the color of type of clothing you want to remove, must be \"Brown\", \"Red\", \"Pink\", \"Black\", \"White\", \"Orange\", \"Green\", \"Blue\", \"Purple\", \"Grey\"");
			String color = keyboard.nextLine();
			Clothing aC = new Clothing (type, color);//gonna remove the clothing
			aD.remove(aC);
			aD.print();
		}
		else if (choice == 9)
		{
			System.exit(0);//will terminate if user enters 9
		}
		else 
		{
			System.out.println("Invalid input");//if the user enters wrong data
		}
	}
}
}

