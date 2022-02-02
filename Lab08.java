/*deysi garcia
 * 
 */
import java.util.Scanner;
import java.util.Random;
public class Lab08 {

	public static final int BOARD_SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		//use nested for loops
		int[][] matrix = new int[BOARD_SIZE][BOARD_SIZE];//matrix size is gonna be 10x10 bc we set the array to that length
		
		System.out.println("Created Matrix");
		
		for (int i = 0; i<matrix.length; i++)//the vertical part of the matrix
		{
			for (int j = 0; j<matrix.length; j++)//horizontal part of the matrix
			{
				matrix[i][j] = r.nextInt(10);//calling the random method
			}
		}	
		
		for (int i= 0; i<matrix.length; i++)
		{
			for (int j=0; j<matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		int start = 0; //swapping the numbers 5 times
		
		System.out.println("Matrix flipped horizontally");
			
		for (int i = 0; i<matrix.length; i++)
		{
			for (int j = matrix.length-1; j>matrix.length/2; j--)
			{
				System.out.print(matrix[i][j] + "");
				int temp = matrix[i][j];
				matrix[i][j]= matrix[i][start];
				matrix[i][start] = temp;
				start++;
			}
		start = 0;//have to repeat it so it knows to start from 0
		System.out.println();
		//print out the other half by inserting "println"
		}
	}
}

