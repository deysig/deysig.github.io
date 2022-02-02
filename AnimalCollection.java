/*
 * deysi garcia
 */
public class AnimalCollection {
	
	private Animal[] animals;
	public static final int DEF_SIZE = 10; //maximum size that collection can be
	
	public AnimalCollection()
	{
		animals = new Animal[DEF_SIZE];
	}
	
	public Animal[] getAnimals()
	{
		return this.animals;
	}
	
	public void addAnimal(Animal aAN)
	{
		for(int i=0;i<animals.length;i++)  //adding an animal
		{
			if(animals[i] == null)
			{
				animals[i] = aAN;
				return;
			}
		}
		System.out.println("It is full!"); //if the collection is full
	}
	
	public void removeAnimal(String remove) //removing animal
	{
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i] == null && animals[i].equals(remove))
			{
				animals[i] = null;
				return;
			}
		}
		System.out.println("That animal was not found!"); //if user put put wrong info
	}
	
	public void printAnimal()
	{
		for(int j=0;j<animals.length;j++) //prints the collection of animal
		{
			if(animals[j] != null)
			{
				System.out.println(animals[j].toString());
			}
		}
	}

}
