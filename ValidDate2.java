/*
 * Deysi Garcia-Valdez
 */
import java.util.Scanner;
public class ValidDate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//"/" if you use .substring it cuts off data before the first slash when doing the day part after you're done with the month part
		System.out.println("Enter a date in the format month/day/year");
		String date = keyboard.nextLine();
		// 01/21/2003. 01= 01, /21=234, /2003=56789
		int a = date.indexOf("/");
		String month = date.substring(0,a);
		int M = Integer.parseInt(month);
		
		int b = date.lastIndexOf("/");
		String day = date.substring(a +1,b);
		int D = Integer.parseInt(day);
		
		String year = date.substring(b+1);
		int Y = Integer.parseInt(year);
		//>=greater than or = to and <= less than or = to 
		if (M >= 1 && M<= 12) {
			if (M == 2) {
				if (D >= 1 && D <= 29) {
					if (D == 29) { //check math and make sure its correct for leap year
						if (Y % 4 == 0) {
							
							if (Y % 100 != 0 || Y % 400 == 0) {
								System.out.println(date + " is a valid date!");
							} else {
								System.out.println(date + " is invalid because it is not a leap year");
							}
						} else {
							System.out.println(date + " is invalid");
						}
					}
				} // always do date + to add the input with the sentence
				else {
					System.out.println(date + " is invalid");
				}
			} else {
				if (M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) {
					if (D >= 1 && M <=31) {
						System.out.println("valid date!");
					} else 
						System.out.println("not valid date");
				} else {
					if (D >= 1 && D <=30) {
						System.out.println("valid date!");
					} else 
						System.out.println("not valid date. Has to be between 1 and 30 days");
				}
			}
		}
		else {
			System.out.println(date + "is invalid date");
		}
	 

}}
