//*
	//Deysi Garcia-Valdez
//
//put import java
import java.util.Scanner;
public class CoinMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount, originalAmount,
			quarters, dimes, nickels, pennies;

	// don't forget semi-colon
		System.out.println("Enter a whole number from 1 to 99");
		System.out.println("The machine will determine a combination of coins");
	// no need to repeat int amount since it is already stated
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextInt();

	// 25-quarter, 10-dime, 5-nickel, 1-pennies
		quarters = amount / 25;
		amount = amount % 25;
		dimes= amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
	
	//no need for 1 of pennies because what is left over will go towards pennies
	//put a space inbetween the quote and letter so that there will be a space when you run
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels and");
		System.out.println(pennies + " pennies");
	
		
	}

}
