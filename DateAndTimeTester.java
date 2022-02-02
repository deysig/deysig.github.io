import java.util.Scanner;
//deysi garcia
/*
 * Written by JJ Shepherd
 */
public class DateAndTimeTester {

	public static void main(String[] args) {
		DateAndTimeTester dtTester = new DateAndTimeTester();
		dtTester.run();
	}
	public void run()
	{
		Scanner keyboard = new Scanner(System.in);
		while (true)//this checks if the data entered is valid
		{
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine\nif it is valid");
			String check = keyboard.nextLine();//this makes it so that user can enter info
			System.out.println("The date and time"+(isValid(check)?" is valid!" : " is not valid"));
			System.out.println("Would you like to exit? Type \"quit\" to exit or press\n[ENTER] to continue");
			//if user just hits enter then the computer will go through the program
			check = keyboard.nextLine();
			if(check.equalsIgnoreCase("quit"))
				break;//if user puts quit then the game exits
		}
		System.out.println("Good bye");//what computer puts out if user decides to quit
	}
	
	public boolean isValid(String dateAndTime)//this breaks the string into the two parts, date and time
	{
		return isValidDate(dateAndTime) && isValidTime(dateAndTime);//divding it into two parts
	}
	public boolean isValidDate(String aDate)//this is gonna check the month and date
	{
		int month = getMonth(aDate);//dividing it individually
		int day = getDay(aDate);
		if (day <= 0 || month <= 0 || month >12)//this is going to check all of the invalid values and it will return false if the user enters any of the false values
		{
			return false;
		}
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			if (day < 30)//checks if the months with 30 or less days is valid
			{
				return true;
			}
			else
			{
				return false;//else is just gonna print out false if the months aren't valid
			}
		}
		else if (month == 2)
		{
			if (day <= 28)//checking for the 28 days in Feb
			{
				return true;
			}
		}
			else if (day <= 31)
			{
				return true;	
			}
			else
			{
				return false;
			}
			
			return false;
		}
	
	public boolean isValidTime (String aTime)
	{
		int hour = getHour(aTime);//now checking for the time is valid or not valid
		int minute = getMinute(aTime);
		if (hour <= 0 || minute < 0)//checks if input is less than 0
		{
			return false;
		}
		else if (hour > 12)//if user enters an hour greater than 12
		{
			return false;
		}
		else if (minute > 59)//checks if user entered a value greater than 59 for minute
		{
			return false;
		}
		return true;
	}
	public int getMonth(String aDate)
	{
		int index = aDate.indexOf("/");//checks the data before the slash
		String month = aDate.substring(0,index);//this is checking at binary 0 up until the slash
		return Integer.parseInt(month);
	}
	public int getDay(String aDate)
	{
		int d = aDate.indexOf("/")+1;//by adding the +1 this is gonna check the data after the slash
		int d01 = aDate.indexOf(" ");
		String day = aDate.substring(d, d01);
		return Integer.parseInt(day);//converting the string into an int
	}
	public int getHour(String aTime)
	{
		int t = aTime.indexOf(" ")+1;
		int t01 = aTime.indexOf(":");
		String hour = aTime.substring(t, t01);
		return Integer.parseInt(hour);
	}
	public int getMinute(String aTime)
	{
		int index = aTime.indexOf(":")+1;//checks the data before the slash
		String minute = aTime.substring(index);//this is checking at binary 0 up until the slash
		return Integer.parseInt(minute);
	}
	
}

