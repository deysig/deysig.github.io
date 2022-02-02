/*
 * deysi garcia-valdez
 */
import java.util.Scanner;
import java.util.Random;
public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int win = 0;//data thats going to be used when entering the point score
		int lose = 0;
		System.out.println("Let's play a game of Rock, Paper, and Scissors");
		System.out.println("You go first and then I'll go");
		while(true) {
			
		String userMove = keyboard.nextLine(); 
			
		if (userMove.equals("quit")) {
			break;
		}
		
		if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors"))
			{//user puts an invalid number we have to say its invalid and that the computer automatically gets a point
				System.out.println("That's invalid. You lose and computer gets a point");
			}
		else {
			//computer has to randomly generate a move againt user
			int rand = (int)(Math.random() * 3); // goes to 0,1,2 excludes 3
			String computerMove = ""; //0=rock and its making a move for the computer
			if (rand == 0) {
			computerMove = 	"rock"; 
			}
			else if (rand == 1){ //1 is paper, we are assigning a value for the computer to print out
				computerMove = "paper";
			}
			else {
				computerMove = "scissors"; //then whatevers left will be the last output
			}
			System.out.println("Computer move:" + computerMove); //then verify user input is valid
			
			if (userMove.equals(computerMove)) { //have to do an input if they both tie
				System.out.println("That's a tie");
			}
			else if ((userMove.equals("rock") && computerMove.equals("scissors")) || (userMove.equals("scissors") && computerMove.equals("paper")) ||(userMove.equals("paper") && computerMove.equals("rock"))) {
				System.out.println("You won!"); //listing all the possibilities of what is gonna be drawn
				win++;
			}
			else {
				System.out.println("You lost"); // if user get paper and computer gets scissors then they would have lost
				lose++;
				}				
			}
		System.out.println("You have won " +win+ " games");//you do output for whoever wins for games and who loses the game 
		System.out.println("You have lost " +lose+ " games");
		}
		
		if(win>lose) {
			System.out.println("You won more games!");
		}
		else if (win<lose) {
			System.out.println("You lost more games");
		}
		else {
			System.out.println("There was a tie");
		}
		System.out.println("Thanks for playing!");
		System.out.println("user has won" +win+" times and computer has won" +lose+" times");
	}
}

