/*
 * Brent Able
 */
public class ToyStoreDriver {
	
	public static void main(String[] args) {
		ToyStore specialToys = new MyToyStore();
		
		Toy msThing  = specialToys.orderToy("doll");
		
		System.out.println("\n---------------------\n");
		
		Toy raceCar = specialToys.orderToy("car");
		
		System.out.println("\n---------------------\n");
		
		Toy funnySounder = specialToys.orderToy("rattle");
	}
}