/*
 * deysi garcia
 */
import java.util.Scanner;
public class SortingCircles {

	public static final double PI = 3.14159;//create a final bc the value of PI never changes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter how big your collection of circles you want");
		
		
		int size = keyboard.nextInt();
		
		
		double[] radius = new double[size];
		double[] area = new double[size];
		
		for (int i=0; i<radius.length;i++)
		{
			System.out.println("Enter the radius for each of the the circles");
			radius[i] = keyboard.nextDouble();//using double bc user can enter decimals
		}
		System.out.println("The area of the circles are");
			for (int i=0; i<area.length; i++)
			{
				//System.out.println("The area of the circle is");
				area[i] = radius[i] * radius[i] * PI;//multiply radius*2 and *PI
				System.out.println(area[i]);
			}
			
			
			boolean hasSwapped = true;//set it to true
			while(hasSwapped)
			{
				hasSwapped = false;
				for(int i=0; i<area.length-1;i++)
				{
					if(area[i] > area[i+1])
					{
						double temp = area[i];//create a temp so we won't lose that number
						area[i] = area[i+1];
						area[i+1] = temp;
						hasSwapped = true;//bubble sort
					}
				}
			}	
			
			System.out.println("Choose 1 for least to greatest");
			System.out.println("Choose 2 for greatest to least");
			
			int answer = keyboard.nextInt();
			if (answer == 1)
				{System.out.println("The order from least to greatest is");
				for(int i=0; i<area.length;i++)
				{
					System.out.println(area[i]);//prints out the area in order
				}	
			}
			else if (answer == 2)
			{
				
				System.out.println("The order from greatest to least is");
				for(int i=0; i<area.length;i++)
				{
					System.out.println(area[i]);//prints out the area in order
				}	
			}
	}

}
