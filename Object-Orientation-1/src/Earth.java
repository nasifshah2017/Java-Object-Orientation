
public class Earth {
	
	// This is the main(), its the entry point of all Java applications
	public static void main(String arg[]) {
		
/*		Human tom;
		
		// Declaring a new object
		tom = new Human();		
		
		// Assigning attributes to the object
		tom.age = 5;			
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Wilson";
		
		// Assigning to a method from the class
		tom.speak();  
		
		Human john;
		john = new Human();
		
		john.age = 10;
		john.eyeColor = "blue";
		john.heightInInches = 75;
		john.name = "John Cena";
		
		john.speak();					*/
		
		Human human1 = new Human("Tom Wilson", 25, 70, "Blue");
		Human human2 = new Human("John Cena", 28, 72, "Black");
	
		
		human1.speak();
		human2.speak();
	
		
		
	} 
}
