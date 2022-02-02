/*
 * deysi garcia
 */
import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the length and width for your first matrix");
		int rows = keyboard.nextInt();
		int columns = keyboard.nextInt();
		
		int [][] matrix = new int [columns][rows];//have to put 2 arrays for rows and columns for the data
		for (int i = 0; i < columns; i++)//vertical part
		{
			for (int j = 0; j<rows; j++)//horizontal part
			{
				System.out.println("Enter a value at "+i+" "+j+"");
				matrix [i][j] = keyboard.nextInt();
			}
		}	
		
		System.out.println("Enter the length and width for the second matrix");
		int secondRow = keyboard.nextInt();
		int secondColumn = keyboard.nextInt();
		
		int [][] secondMatrix = new int [secondColumn][secondRow];
		
		if (columns != secondColumn || rows != secondRow)
		{
			System.out.println("Inavlid dimensions. These cannot be added");
			System.exit(0);
		}
		
		
		for (int i = 0; i<columns; i++)
		{
			for (int j = 0; j<rows; j++)
			{
				System.out.println("Enter a value at "+i+" "+j+"");
				secondMatrix [i][j] = keyboard.nextInt();
			}
		}
		
		
		for (int i=0; i<matrix.length;i++)
		{
			for (int j=0; j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]);//this prints the numbers inputted into the matrix
			}
			System.out.println();
		}
		
		System.out.println("+");
		
		for (int i=0; i<secondMatrix.length;i++)
		{
			for (int j=0; j<secondMatrix[i].length;j++)
			{
				System.out.print(secondMatrix[i][j]);//dont use "println"
			}
			System.out.println();
		}
		System.out.println("=");
		
		int[][] totalMatrix = new int [columns][rows];
		for (int i = 0; i<matrix.length; i++)
		{
			for (int j = 0; j<secondMatrix.length; j++)
			{
				totalMatrix[i][j] = matrix[i][j] + secondMatrix[i][j];
				System.out.print(totalMatrix[i][j]);
			}
			System.out.println();
		}
	}

}