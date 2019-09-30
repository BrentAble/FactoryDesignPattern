/*
 * Author @ Brent Able
 */

import java.util.ArrayList;

public abstract class Toy {
	protected String name;
	protected ArrayList<String> toys = new ArrayList<String>();
	/*
	 * Create array String list
	 */
	public String getName() {
		return name;
	}
	
	public void assemble() {
		System.out.println("Assembling " + name);
	}
	
	public void boxToy() {
		System.out.println("Boxing " + name);
	}
	
	public void priceToy() {
		System.out.println("Pricing " + name);
	}
	/*
	 * Methods called in toy store with what they print out
	 */
	public String toString() {
		String result = "";
		result += "-------- " + name + " --------\n";
		result += name + "\n";
		
		for(String name : toys) {
			result += name + "\n";
		}
		/*
		 * seperating each of the toys from each other
		 */
		return result;
	}
}
