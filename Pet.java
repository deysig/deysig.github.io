/*
 * deysi garcia
 */
//Step 1:define the class
public class Pet {//noun
	
	//step 2: create the properties
	//can be instance variables or constants
	//in this class, we are going to focus on the variables
	//info that's associated with each one of the instances of a pet
	//"what info do we want to keep track of for every one of these pets"
	
	private String name;//safeguard this information, encapsulation
	private int age;
	private double weight;
	
	//enumerations - useful when creating a type that only has a set number of potential values
	//contains constant values,, all values should be capitalized
	private PetType type;
	
	//step 3: constructors
	//special kind of method, usually public, no return type, & the identifier of constructor has to match the identifier of a class
	
	public Pet()//this is the default constructor
	{
		this.name = "none"; //self-referential pointer, basically references "this" instances variables/methods
		this.age = 0;
		this.weight = 1.0;
		this.type = PetType.UNKNOWN;//pulls from the enum class
	}
	public Pet( String aN, int anA, double aW, PetType aT)//parameterized constructor, sets all of its values
	{
		this.setName(aN);
		this.setAge(anA);
		this.setWeight(aW);
		this.setType(aT);
	}
	
	//step 4: create accessors, gives access to each one of the instance variable values outside if this class
	public String getName()//method has a non-void type so we have to use return type in order to return some type of value
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public PetType getType()// <--also includes if we create our own types
	{
		return this.type;
	}
	
	//step 5: create mutators, allows us to modify the values from outside of this class
	//however before we modify the values, we have to validate if that value is correct
	
	public void setName(String aN)//setting a value
	{
		if (aN != null)//making sure the String aN is not null, if parameter is even correct
			this.name = aN;
		else
			this.name = "none";//if it was null, we want to make sure that "name" was set to something
	}//error checking
	public void setAge(int anA)
	{
		if (anA >= 0)
			this.age = anA;
		else
			this.age = 0;
	}
	public void setWeight(double aW)
	{
		if (aW > 0.0)
			this.weight = aW;   //checking for errors in the mutators
		else
			this.weight = 1.0;
	}
	public void setType(PetType aT)
	{
		if (aT != null)
			this.type = aT;
		else
			this.type = PetType.UNKNOWN;
	}
	
	//step 6: other methods
	//toString & .equals 
	
	public String toString()//purpose is to return a string that is related to this instance
							//no parameters for toString
	{
		return this.name+" "+this.age+" "+this.weight+" "+this.type;
	}
	public boolean equals(Pet aP)//check THIS pets name, age, weight & type vs ANOTHER pets name, age, weight, & type
	{							//comparing this pet to another pet, aP=another pet
		return aP != null &&
				this.name.equals(aP.getName()) && //if pet01 is equal to pet02
				this.age == aP.getAge() &&
				this.weight == aP.getWeight() &&
				this.type == aP.getType();
	}
	
	//other actions we should write inside this pet class
	//step 7: creating instances of these pets
	public void giveCompliment()//overload method
	{ //exact same method definition but a different number of parameters so that it behaves differently
		System.out.println(this.name+" reacted with joy!");
	}
	public void giveCompliment(int c)
	{
		for(int i = 0; i<c; i++)//no more than 3 times
			this.giveCompliment();
	}
	
	//create static methods--not unique to every instance, they are defined in the data
	//section of memory ONE time only
	//static methods are great for providing functionality that can be shared across ALL instances
	public static Pet createNewPet(PetType aT)
	{
		//inside static methods we can't call "this."/non-static method
		Pet newPet = new Pet();
		newPet.setType(aT); //they setType is unique to newPet
		return newPet;  //creates a new instance of a pet
	}
	public static Pet clonePet(Pet aP)  //static methods in properties are only defined one-time only inside the data section of memory
	{
		if(aP == null) //verifying if this pet that we're about to clone even exists
			return null;
		return new Pet(aP.getName(), aP.getAge(), aP.getWeight(), aP.getType());
		//created a new instance of a pet, assigned the pets property to each one of the properties given this pet "aP"
	}
	
}
