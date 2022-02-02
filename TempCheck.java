/*
 * deysi garcia-valdez
 */
import java.util.Scanner;
public class TempCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double[] temperature = new double[10]; //can only have 10 inputs, no more or no less
		// goes from 0-9
		System.out.println("Enter 10 different inputs for temperature");
		System.out.println("The computer will average them and list the tempertures that were below average");
	
		double sum = 0;
		
		//always use for loops when using arrays
		for (int temp = 0; temp <temperature.length; temp++) //writing a loop that reads in the array "temperature"
		{
			System.out.println("Enter temperature for day " + (temp+1)+ "");//put this line in for loop bc the "day" needs to be looped
			//and then + (temp+1)+ bc you're adding one to each day
			temperature[temp] = keyboard.nextDouble();//do .nextDouble bc thats what you put in the beginning
			sum = sum + temperature[temp];
		}
		
		
		double average = sum / 10; //adds up all the input and divides by 10 bc thats how many days we have
		System.out.println("The average temperature is " + average);
		System.out.println("The temperatures below average are:");
		
		for (int temp = 0; temp <temperature.length; temp++)
		{
			if (temperature[temp] <average) //this is gonna list the temps that are below average by pulling the data from the temps user puts
				System.out.println("Day "+ (temp+1)+ " below average");
		}
		
	}

}
