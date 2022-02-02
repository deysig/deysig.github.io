import java.util.Scanner;

/*
 * deysi garcia
 */
public class CoffeeTester {

	public static void main(String[] args) {
		
		boolean play = false;
		while (!play)//while player wants to play
		{
			Scanner keyboard = new Scanner(System.in);
			
			Coffee coffee01 = new Coffee();//have to do two bc we only ask for two types
			Coffee coffee02 = new Coffee();
			
			String coffee;//creating variables for both instances
			int caffeine;
			
			System.out.println("Enter a name and caffeine content of 2 types of coffee");
			System.out.println("Enter name for the first coffee");
			
			coffee = keyboard.nextLine();//makes it so the user can input info
		
			System.out.println("What is the caffiene content?");
			caffeine = keyboard.nextInt();//so user can enter info if not user cannot enter data
			
			coffee01.setName(coffee);
			coffee01.setAmount(caffeine);//setAmount is from Coffee and it pulls it from there to here
			
			System.out.println("Enter name for second coffee");
			keyboard.nextLine();
			coffee = keyboard.nextLine();
			
			System.out.println("What is the caffiene content?");
			caffeine = keyboard.nextInt();
			
			coffee02.setName(coffee);
			coffee02.setAmount(caffeine);
			keyboard.nextLine();
			
			System.out.println("\nIt would take "+coffee01.getRiskyAmount()+"mg "+coffee01.getName()+" coffee's before it it dangerous to consume in an hour");
			//this is outputting the data that the user put and does the risky amount and prints out info
			
			System.out.println("It would take "+coffee02.getRiskyAmount()+"mg "+coffee02.getName()+" coffee's before it it dangerous to consume in an hour");
			//we pull the risky amount from Coffee to here
			
			System.out.println("\nChecking if the first and second coffee have the same values");
			System.out.println(coffee01.equals(coffee02));
			
			System.out.println("\nDo you want to play again?");
			String play1 = keyboard.nextLine();
			if(play1.equalsIgnoreCase("no"))
			{
				play = true;//if user puts in no, java will stop
				System.out.println("Bye");
			}
	}
	}
}