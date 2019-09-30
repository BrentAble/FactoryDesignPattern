/*
 * Author @ Brent Able
 */
public abstract class ToyStore {
	public abstract Toy createToy(String type);
	/*
	 * Abstract class creating string type
	 */
	public Toy orderToy(String type) {
		Toy toy = createToy(type);
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}
	/*
	 * Parts needed to create each toy
	 */
}
