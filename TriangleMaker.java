/*
 * Deysi Garcia-Valdez
 */
import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Draw a size of the triangle using asteriks (*)");
		
		int row = keyboard.nextInt(); //-1
		
	
		for (int i = 0; i <= row; i++) //can pick anything you want for an int=
		{
			for (int c=0; c <= i; c++) // puts asteriks until the original input is shown
			{
				System.out.print("*" +" ");//no .println because all you want to print out are the asterisks
			}
			System.out.println(""); //-1
		}
		for (int r=row; r>=0; r--) //it goes down from the original input
		{
			for (int c=0; c <= r-1; c++)
			{
				System.out.print("*"+" "); //dont put println because then itll do a space
			}//have to put "*" bc thats what we're using in this game
			System.out.println("");
		}
		if (row <0) {
			System.out.println("That is invalid because it is a negative!");
			System.exit(0); // has to put that because it will terminate the input bc its a negative number
		}
	}
}
