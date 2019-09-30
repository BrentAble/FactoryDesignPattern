/*
 * Author @ Brent Able
 */
public class MyToyStore extends ToyStore {
	/*
	 * use this toystore class which extends toyStore for the driver
	 * As you cant create a variable of abstract type
	 */
	public Toy createToy(String toy) {
		if(toy.equals("doll")) {
			return new Doll();
		}else if(toy.equals("car")) {
			return new toyCar();
		}else if(toy.equals("rattle")) {
			return new Rattle();
		}
		/*
		 * Create a toy using if statements printing out what type of toy is desired
		 */
		
		return null;
	}
}
