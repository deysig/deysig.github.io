/*
 * deysi garcia
 */
import java.util.Scanner;
public class BoxSorter {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		boolean play = true;//the loop so that it will go until user say "no" to stop playing
		while(play)
		{
		{
	    Box[] array = new Box[5];
	    System.out.println("Welcome to the box sorter!");
	    System.out.println("\nEnter the number of boxes you would like to sort or -1 to quit the program. ");
	    keyboard.nextLine();
	    System.out.println("Enter the information about boxes and I'll sort them!");
	    
	    for(int i = 0; i < 5; i++)
	      {
	       System.out.println("Enter the label,length,width,height (all feet) of");
	       System.out.println("box "+(i+1));
	      
	       String label = keyboard.nextLine();
	       double aL = keyboard.nextDouble();//so that th user can enter all of the values
	       keyboard.nextLine();
	       double aW = keyboard.nextDouble();
	       keyboard.nextLine ();
	       double aH = keyboard.nextDouble();
	       keyboard.nextLine  ();
	       Box box = new Box(label,aL,aW,aH);
	       array[i] = box;
	          
	     }
	    	//sorting the box according to volume
	      for(int j=0;j<5;j++)
		   {
	          Box count;
		      for(int a=j+1;a<5;a++)
		      {
		        if (array[j].getVolume() > array[a].getVolume()) //looks for the volume
		        {	
			      count = array[j];
			      array[j] = array[a];
			      array[a] = count;
		                  
		        }
		      }
		   }
	         
	   System.out.println("\nSorted boxes");

	   //printing the sorted boxes
	   for(int j=0; j<5;j++)
	   {
	     System.out.println(array[j]);
	   }
		}
		System.out.println("\nWould you like to sort more boxes?");
		String playAgain = keyboard.nextLine();
		if (playAgain.equalsIgnoreCase("yes"))
		{
			play = true;//if user enters yes game will restart
		}
		else
		{
			play = false;
		System.out.println("Goodbye");//message that prints out if user does not want to play again
		System.exit(0);
		}	

		}
	}
}



