//
	//*Deysi Garcia-Valdez
//
import java.util.Scanner;
public class BinaryChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner keyboard = new Scanner(System.in);
	
		
		System.out.println("Enter one four-digit binary number");
		System.out.println("Enter a second four digit binary number");
		System.out.println("We'll convert to whole numbers, add them together, and print out what they both add up to");
		String binary1 = keyboard.nextLine();
		String binary2 = keyboard.nextLine();
		
		// make sure the int= is not the same word
		// do something that relates to the topic since we're dealing with numbers go with number & binary
		int a = Integer.parseInt(binary1.substring(0,1)) * 8;
		int b = Integer.parseInt(binary1.substring(1,2)) * 4;
		int c = Integer.parseInt(binary1.substring(2,3)) * 2;
		int d = Integer.parseInt(binary1.substring(3)) * 1;
		
		// 0101 is 8, 4, 2, and 1
		//multiply binary1 and binary2 substring with those numbers
		int e = Integer.parseInt(binary2.substring(0,1)) * 8;
		int f = Integer.parseInt(binary2.substring(1,2)) * 4;
		int g = Integer.parseInt(binary2.substring(2,3)) * 2;
		int h = Integer.parseInt(binary2.substring(3)) * 1;
		
		
		int number1 = a+b+c+d;
		int number2 = e+f+g+h; 
		
		System.out.println(number1); 
		System.out.println(number2);
		
		// make sure to put int when making a new variable
		int totalamount = number1 + number2;
		
		//if you want to add things together you gotta system.out.println and say what you wanna and then do the "+" and do the int
		System.out.println("Both of them added together will be " + totalamount);		
		
	}

}
