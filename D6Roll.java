/*
 * Deysi Garcia-Valdez
 */
import java.util.Scanner;
import java.util.Random; //put random bc user is gonna choose a random number from 1 -6
public class D6Roll {
	//public static final int PICK_NUMBER = 10;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random(); // random bc the user is picking a random number
		System.out.println("Hello!");
		System.out.println("Enter the number of times that the dice will be rolled");
		int numberofrolls = keyboard.nextInt(); //create an int, doesn't matter the name
		int count = 0;
		if (numberofrolls <= 0) { //can't be zero bc dice doesn't have 0 sides
			System.out.println("That is invalid because a negatice cannot be a side on the dice");
			System.exit(0); // have to terminate the game
		}
		
		Random rand = new Random(); //bc the user is picking a random number
		int one = 0; //have to set 6 int bc thats how mnay sides the dice has
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		while (count < numberofrolls) {
			count++;
			int a = rand.nextInt(6) + 1; ////a is how many sides the dice has and have to add one bc it'll print out a 6 if not 0 will be in data
			System.out.println(a + " was rolled"); //you have to put a bc it'll put that from the data and it'll print out the data of all the numbers that was rolled
			if (a == 1) { //a =6 sides so if it rolls out 1
				one++;
			}
			if (a == 2) {
				two++;
			}
			if (a == 3) {
				three++;
			}
			if (a == 4) {
				four++;
			}
			if (a == 5) {
				five++;
			}
			if (a == 6) {
				six++;
			}
		}
		System.out.println("One:" +one+ "\nTwo:" +two+ "\nThree:" +three+ "\nFour:" +four+ "\nFive:" +five+ "\nSix:" +six);
	} //have to put +one+ for every number bc it pulls from the data of how mnay times it was rolled
}
