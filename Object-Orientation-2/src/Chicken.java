
public class Chicken extends Bird {

	public Chicken(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
			
	}
	
/*	// The Chicken Object should inherit all the methods
	// from the Bird Object class but this is a particular
	// method that it cannot inherit, as Chickens cannot fly
	// So we need to manually alter this method and let it
	// unavailable
	
	// So when the user invokes this method on the chicken
	// then this is the fly() method that will be called instead
	// of the one defined in the Bird object. 
	
	// This is called Method Overriding 
	
	public void fly() {
		System.out.println("not able to fly...");
	}
*/

}
