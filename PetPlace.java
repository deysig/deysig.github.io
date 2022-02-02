/*
 * deysi garcia
 */
public class PetPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet01 = new Pet();
		System.out.println(pet01);
		
		Pet pet02 = new Pet("Mr. Flufferkins",7,8.6,PetType.CAT);
		System.out.println(pet02);
		
		Pet pet03 = new Pet("Roofles",3,15.0,PetType.DOG);
		System.out.println(pet03);
		
		pet02.giveCompliment();
		
		pet03.giveCompliment(3);//give 3 compliments
		
		Pet pet04 = Pet.createNewPet(PetType.HAMSTER); //from the static method ".createNewPet" providing the "PetType" it's going to create a new instance of this pet, assigning the pet type to hamster, and then assigning it to "pet04"
		System.out.println(pet04);
		
		Pet pet05 = Pet.clonePet(pet04);
		System.out.println(pet05);
		System.out.println(pet04.equals(pet05)); //checks if the all the properties are the same for both so it "true"
		//use .equals when checking the contents of an object
		
		System.out.println(pet04 == pet05); //print "false" because pet04 is at a different memory address that was dynamically allocated
											//than pet05 which was also dynamically allocated
		//use ==  or != when checking for the memory address
	}

}
