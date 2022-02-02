/*
 * deysi garcia
 */
public class Tester {

	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		Undergrad u = new Undergrad();
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(u);
		
		Person[] people = new Person[3];
		people[0] = new Person("asdf");
		people[1] = new Student("asdf2",4); //polymorphism
		people[2] = new Undergrad("asdf3",5,2);
		
		for(int i=0; i<people.length;i++)
			System.out.println(people[i]);
	}

}
