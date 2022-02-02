/*
 * deysi garcia
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		boolean play = true;
		while(play)
		{
			PBJSandwich firstSandwich = new PBJSandwich(); //creating sandwich one 
			
			System.out.println("Welcome to Creating Your Own PB&J Sandwich!!");
			System.out.println("\nThis information is for the top slice of the bread:");
			System.out.println("\nEnter the name brand for the bread, the calorie intake and the bread type:");
			System.out.println("Calorie intake has to be between 50 and 250\nThe type of bread has to be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			
			String topSlice = keyboard.nextLine();
			int firstTopSlice = keyboard.nextInt();
			keyboard.nextLine();
			String secondTopSlice = keyboard.nextLine();
			
			firstSandwich.settopSlice(new Bread (topSlice,firstTopSlice,secondTopSlice));
			
			System.out.println("\nThis information is for the peanut butter for the sandwich:");
			System.out.println("\nEnter the name brand for the peanut butter, the calorie intake for the peanut butter and if it is cruchy");
			System.out.println("Calorie intake has to be between 100 and 300\nEnter \"true\" or \"false\" if it is crunchy or not");
			
			String peanutButter = keyboard.nextLine();
			int peanutButter1 = keyboard.nextInt();
			boolean peanutButter2 = keyboard.nextBoolean();
			keyboard.nextLine();
			
			firstSandwich.setpeanutButter(new PeanutButter (peanutButter,peanutButter1,peanutButter2));
			
			
			System.out.println("\nThis information is for the jelly of the sandwich:");
			System.out.println("\nEnter the name brand for the jelly, the calorie intake of the jelly and the jelly type:");
			System.out.println("Calorie intake has to be between 50 and 200\nThe type of jelly has to be \"Apple\", \"Blackberry\", \"Grape\",\"Mango\" or \"Tomato\"");
			
			String jelly = keyboard.nextLine();
			int jelly1 = keyboard.nextInt();
			String jelly2 = keyboard.nextLine();
			keyboard.nextLine();
			
			firstSandwich.setJelly(new Jelly (jelly,jelly1,jelly2));
			
			System.out.println("\nThis information is for the bottom slice of the bread:");
			System.out.println("\nEnter the name brand for the bread, the calorie intake and the bread type:");
			System.out.println("Calorie intake has to be between 50 and 250\nThe type of bread has to be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			
			String bottomSlice = keyboard.nextLine();
			int bottomSlice1 = keyboard.nextInt();
			String bottomSlice2 = keyboard.nextLine();
			keyboard.nextLine();
			
			firstSandwich.setbottomSlice(new Bread (bottomSlice,bottomSlice1,bottomSlice2));
			System.out.println("\nUser entered: "+ firstSandwich); //print all the inputs user entered
			
			
			PBJSandwich secondSandwich = new PBJSandwich();
			
			System.out.println("\nTime to make your second sandwich!!");  //creating second sandwich
		
			System.out.println("\nThis information is for the top slice of the bread:");
			System.out.println("\nEnter the name brand for the bread, the calorie intake and the bread type:");
			System.out.println("Calorie intake has to be between 50 and 250\nThe type of bread has to be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			
			String topSlice2 = keyboard.nextLine();
			int firstTopSlice2 = keyboard.nextInt();//makes it so that the user can enter their values
			keyboard.nextLine();
			String secondTopSlice2 = keyboard.nextLine();
			
			secondSandwich.settopSlice(new Bread (topSlice2,firstTopSlice2,secondTopSlice2));
			
			System.out.println("\nThis information is for the peanut butter for the sandwich:");
			System.out.println("\nEnter the name brand for the peanut butter, the calorie intake for the peanut butter and if it is cruchy");
			System.out.println("Calorie intake has to be between 100 and 300\nEnter \"true\" or \"false\" if it is crunchy or not");
			
			String secondpeanutButter = keyboard.nextLine();
			int secondpeanutButter1 = keyboard.nextInt();
			boolean secondpeanutButter2 = keyboard.nextBoolean();
			
			secondSandwich.setpeanutButter(new PeanutButter (secondpeanutButter,secondpeanutButter1,secondpeanutButter2));
			
			keyboard.nextLine();
			
			System.out.println("\nThis information is for the jelly of the sandwich:");
			System.out.println("\nEnter the name brand for the jelly, the calorie intake of the jelly and the jelly type:");
			System.out.println("Calorie intake has to be between 50 and 200\nThe type of jelly has to be \"Apple\", \"Blackberry\", \"Grape\",\"Mango\" or \"Tomato\"");
			
			String secondjelly = keyboard.nextLine();
			int secondjelly1 = keyboard.nextInt();
			String secondjelly2 = keyboard.nextLine();
			keyboard.nextLine();
			
			secondSandwich.setJelly(new Jelly (secondjelly,secondjelly1,secondjelly2));
			
			System.out.println("\nThis information is for the bottom slice of the bread:");
			System.out.println("\nEnter the name brand for the bread, the calorie intake and the bread type:");
			System.out.println("Calorie intake has to be between 50 and 250\nThe type of bread has to be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
			
			String secondbottomSlice = keyboard.nextLine();//makes it so that user can enter information
			int secondbottomSlice1 = keyboard.nextInt();
			String secondbottomSlice2 = keyboard.nextLine();
			keyboard.nextLine();
			
			secondSandwich.setbottomSlice(new Bread (secondbottomSlice,secondbottomSlice1,secondbottomSlice2));
			System.out.println("\nUser entered: "+ secondSandwich);// all the values user entered
			
			System.out.println("\nChecking if the two sandwiches are equal");
			System.out.println(firstSandwich == (secondSandwich));//does the first equal the second
			
			System.out.println("Would you like to restart?");
			String play1 = keyboard.nextLine();
			
			if (play1.equalsIgnoreCase("yes"))
			{
				play = true;//if user enters yes game will restart
			}
			else
			{
				play = false;
			System.out.println("Bye Bye");//message that prints out if user does not want to play again
			System.exit(0);
			}
		}	
	}

}
