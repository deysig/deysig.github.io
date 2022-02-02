/*
 * deysi garcia
 */
import java.util.Scanner;
public class AnimalCollectionFE {
	
	private static Scanner keyboard = new Scanner(System.in); 
	private static AnimalCollection aCollection = new AnimalCollection();

	public static void main(String[] args) {
		
		AnimalCollection collect = new AnimalCollection();
		int pick;
		int typeOfAnimal;
		
		while(true)
		{
			System.out.println("Pick if you want to\n1. Add a cat or dog\n2. Remove a cat or dog\nOr 3. quit");
			System.out.println("\nPlease, enter a choice");
			
			pick = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(pick)
			{
			case 1:
				System.out.println("Would you like to add a \n1. House cat, \n2. Leopard, \n3. Domestic dog, \nor 4. Wolf");
				typeOfAnimal = keyboard.nextInt();
				
				switch(typeOfAnimal)
				{
				case 1:
					System.out.println("Enter the house cats name, weight, mood, and type"); //set the values of what user can enter
					System.out.println("Weight has to be greater than 0\nType of mood can only be sleepy, playful, or hunger \ntype of cat can only be Short Hair, Ragdoll, Sphinx, or Scottish Fold");
					keyboard.nextLine();
					String catName = keyboard.nextLine();
					double catWeight = keyboard.nextDouble(); //user enters data for everything i ask for
					keyboard.nextLine();
					String catMood = keyboard.nextLine();
					String catType = keyboard.nextLine();
					
					HouseCat notDefaultHouseCat = new HouseCat (catName, catWeight, catMood, catType);
					aCollection.addAnimal(notDefaultHouseCat);  //prints out the data we got from user
					break;
					
				case 2:
					System.out.println("Enter the leopards name, weight, mood, and number of spots");
					keyboard.nextLine();
					String leopardName = keyboard.nextLine();
					double leopardWeight = keyboard.nextDouble();  //user enters data for everything i ask for
					keyboard.nextLine();
					String leopardMood = keyboard.nextLine();
					int numberOfSpots = keyboard.nextInt();
					keyboard.nextLine();
					
					Leopard notDefaultLeopard = new Leopard (leopardName, leopardWeight, leopardMood, numberOfSpots);
					aCollection.addAnimal(notDefaultLeopard);  //prints out the data we got from user
					break;
					
				case 3:
					System.out.println("Enter the domestic dogs name, weight, type, and energy level");  //set the values of what user can enter
					System.out.println("Energy level has to be betweetn 1 and 100\ntype ca only be Retriever, Terrier, Husky, and Mutt ");
					keyboard.nextLine();
					String dogName = keyboard.nextLine();
					double dogWeight = keyboard.nextDouble();  //user enters data for everything i ask for
					keyboard.nextLine();
					String dogType = keyboard.nextLine();
					int energyLevel = keyboard.nextInt();
					keyboard.nextLine();
					
					DomesticDog notDefaultDog = new DomesticDog (dogName, dogWeight, energyLevel, dogType);
					aCollection.addAnimal(notDefaultDog); //prints out the data we got from user
					break;
					
				case 4:
					System.out.println("Enter the wolfs name, weight, energy level, and the pack leader");
					keyboard.nextLine();
					String wolfName = keyboard.nextLine();
					double wolfWeight = keyboard.nextDouble();
					keyboard.nextLine();
					int wolfEnergyLevel = keyboard.nextInt(); //user enters data for everything i ask for
					String packLeader = keyboard.nextLine();
					keyboard.nextLine();
					
					Wolf notDefaultWolf = new Wolf (wolfName, wolfWeight, wolfEnergyLevel, packLeader);
					aCollection.addAnimal(notDefaultWolf); //prints out the data we got from user
					break;
					
				default:
					System.out.println("Invalid choice!"); //if user enters a choice that is not an option
					break;
				}
				
				System.out.println("The current collection: ");
				aCollection.printAnimal();
				break;
				
			case 2: //removes the type of animal
				System.out.println("Enter the animals name that you want to remove");
				String remove = keyboard.nextLine();
				aCollection.removeAnimal(remove);
				aCollection.printAnimal(); //collection will then print out the data with removing the animal they wanted to remove
				break;
				
			case 3: //if user enters quit
				System.out.println("Goodbye!");
				System.exit(0); //closes the program
			}
		}
	}
}
