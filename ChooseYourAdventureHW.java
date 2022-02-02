/*
 * Deysi Garcia-Valdez
 */

import java.util.Scanner;
public class ChooseYourAdventureHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean bool = true;
		
		while(bool) {
		System.out.println("Hello! Welcome to the planet of Emerald, where everything is not what it looks like.");
		System.out.println("What is your name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("That is a unique and beautiful name, "+name);
		
		//choosing what you want to fight with, many options
		//make sure to put IgnoreCase because user might do all caps or no caps
		System.out.println("Which weapon would you like to use on your adventure?");
		System.out.println("(Please type KNIFE or the HAMMER?)");
		String weapon = keyboard.nextLine();
		String KNIFE = "Knife";
		String HAMMER = "Hammer";
		//knife
			if(weapon.equalsIgnoreCase(KNIFE)) 
			{
				System.out.println("Wow! You got a sharp knife which is good for enemies.");
				System.out.println("You're walking down alone on the planet and you see strawberries sprouting out, looking fresh and delicious! How many would you like to grab and eat (0 or 1)?");
				int strawberry = keyboard.nextInt();
				keyboard.nextLine();
					if(strawberry == 0) 
						{
							System.out.println("You don't like strawberries??? Okayyyyy I guess. Everyone has a preference");
							System.out.println("You stop by a house you see while you're walking the planet because you're hungry after not eating the amazing strawberries. Do you eat at the eerie house you spot while you're walking or ask the aliens of their food, hoping they are friendly?");
							System.out.println("(HOUSE or ALIENS?");
							String choice = keyboard.nextLine();
							String House = "house";
							String Aliens = "aliens";
								if(choice.equalsIgnoreCase(House)) 
								{
									System.out.println("There was an ogre inside the errie house and kidnaped you forever!!. Ogre's never let their people go sadly you can't adventure anymore...");
								}
								else if(choice.equalsIgnoreCase(Aliens)) {
									System.out.println("Surprisingly, the aliens were nice and shared their ummm....unique food. Though, it did look pretty wierd... oh well. Keep going forward!");
									System.out.println("Where will you go now? To the BUILDING or MALL?");
									String place = keyboard.nextLine();
									String building = "building";
									String mall = "mall";
										if(place.equalsIgnoreCase(building)) {
											System.out.println("Wow, it's really messy in here. You meet some aliens who live on the planet! How amazing, many people don't meet them because the people who visit are scared of aliens.");
											System.out.println("While talking with the aliens, you meet a visitor from another planet and befriend them!");
											System.out.println("The aliens, visitor, and you talk for awhile! The conversion about looking for a place to live comes up and the visitor says they're looking for a new home. You say that you are too and both of y'all decide to live on planet Emerald forver!!");
											System.out.println("HAPPY ENDING");
										}
										else if(place.equalsIgnoreCase(mall)) {
											System.out.println("A troll was living inside the mall and said hello! The troll gave some creepy vibes but after inviting you inside the mall, he grabbed a knife secretly and stabbed you.....and you did not survive");
										}
								}
						}
					else if(strawberry == 1) 
						{
							System.out.println("Turns out that strawberry was kind of poisinous....and you didn't survive. Looks like when you visit other planets the fruits aren't the same as your home planet");
						}
			}	
				
			
			else if(weapon.equalsIgnoreCase(HAMMER)) 
			{
			System.out.println("That hammer looks tough! It can certainly protect you if anything happens!");
			System.out.println("You encounter a pack of 20 trolls. OH NO. Killing time??? (kill 0 or 20?)");
			int trolls = keyboard.nextInt();
			keyboard.nextLine();
				if(trolls == 0) 
					{
						System.out.println("You are very glad because they were nice trolls!!");
						System.out.println("A baby troll comes up to you pleading for you to play with them. Do you play with the baby troll?");
						String yes = "Yes";
						String no = "No";
						String answer2 = keyboard.nextLine();
							if(answer2.equalsIgnoreCase(yes)) 
							{
								System.out.println("The mother of the baby troll is very happy because many people run away from the babies.");
								System.out.println("The mother takes you to their land which has a castle filled with candy and it has a chocolate waterfall.");
								System.out.println("Do you touch the gold statue in the middle of their castle that's shining?");
								String yeah = "yeah";
								String nope = "nope";
								String answer = keyboard.nextLine();
									if(answer.equalsIgnoreCase(yeah)) {
										System.out.println("You become their queen!! Nice. They live to serve and feed you.");
										System.out.println("Good Ending");
								}
									else if(answer.equalsIgnoreCase(nope)) {
										System.out.println("The mother is sad you didn't touch it and push you in their dungeon. Looks like they weren't as nice as they seemed");
										System.out.println("They eventually eat you. Booo");
									}
								
							}
						else if(answer2.equalsIgnoreCase(no)) 
							{
								System.out.println("The baby troll gets mad and transforms into a big troll and eats you!!. Game is now over.");
							}
					}
				else if(trolls == 20) 
					{
						System.out.println("It's actually a law on planet Emerald where it is illegal to kill trolls!! You go to jail FOREVERRR. GOODBYE");
					}
			}
				
			else 
			{
			System.out.println("Ummmm...that isn't an option????");
			System.out.println("UH OH, a group of mean leprechauns come up from the ground. They killed you for trespassing on their land. Bye bye.");
			}
		
		System.out.println("Would you like to play again yes/no?");
		String answer = keyboard.nextLine();
		if(answer.equalsIgnoreCase("yes")) {
			bool = true;
		}
		else {
			System.out.println("I hope you enjoyed your adventure on planet Emerald! Goodbye!!");
			bool = false;
		}
		}
		
	}
	}
