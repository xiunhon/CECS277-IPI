/**
 * @author Group 3 - Victorira T. Tien N., Nik K. due date: Feb 17, 2021
 *
 *         subclass Cookie inherited from class DessertItem, create getter
 *         methods for Cookie, override abstract method getCost to calculate
 *         price per dozen, override toString accordingly
 */
public class Cookie extends DessertItem {
	private int numOfCookie;
	private double pricePerDozen;

	/**
	 * Null constructor for Cookie class inherited from DessertItem class
	 */
	public Cookie() {
		super();
		numOfCookie = 0;
		pricePerDozen = 0;
	}

	/**
	 * overloaded constructor for Cookie class inherited from DessertItem class add
	 * numOfCookie and pricePerDozen parameter
	 * 
	 * @param name, calories
	 */
	public Cookie(String name, int calories) {
		super(name, calories);
		this.name = name + "(Cookie)";
		numOfCookie = 0;
		pricePerDozen = 0;
	}

	/**
	 * @param name, calories, number, price
	 */
	public Cookie(String name, int calories, int number, double price) {
		super(name, calories);
		this.name = name + "(Cookie)";
		this.numOfCookie = number;
		pricePerDozen = price;
	}

	/**
	 * getters
	 */
	/**
	 * 
	 * @return number of cookies
	 */
	public int getNumOfCookie() {
		return numOfCookie;
	}

	/**
	 * 
	 * @return unit price per dozen
	 */
	public double getPricePerDozen() {
		return pricePerDozen;
	}

	/**
	 * @override abstract getCost from DesserItem class
	 * @return cost for cookies calculated with price per dozen
	 */
	public double getCost() {
		double cost = numOfCookie * (pricePerDozen / 12);
		return Math.round(cost);
	}

	/**
	 * @override toString()
	 * @return new string
	 */
	public String toString() {
		return getNumOfCookie() + " @ " + getPricePerDozen() / 100 + " /dz." + "\n"
				+ String.format("%-30s %5.2f", name, getCost() / 100)
		// + "\n\n" + name + " calories: " + getCalories()
		;
	}
}// end of class
