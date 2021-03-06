// Letting the Bird class inherit Animal behaviors (methods/works)
public class Bird extends Animal {	
	
	// When we extend an Object to its parent class we need
	// a constructor, and this constructor imports (inherits)  
	// all the methods from the parent class.
	
	public Bird(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		
	}

	
	public void move() {
		System.out.println("Flapping wings...");
		
	}
	
	// This method specifically belongs to the
	// Bird object, its it developed itself and
	// did not inherit from its parent class (Animal class).
	// Only Objects children to "Bird" class that extends to
	// the "Bird" class can inherit this method.

/*	public void fly() {
		System.out.println("Flying...");
	}
*/

}
