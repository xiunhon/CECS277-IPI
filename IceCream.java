/**
 * @author Group 3 - Victorira T. Tien N., Nik K. due date: Feb 17, 2021
 *
 *         subclass IceCream inherited from class DessertItem, create getter
 *         methods for IceCream, override abstract method getCost, override
 *         toString accordingly
 */
public class IceCream extends DessertItem {
	protected double cost;

	/**
	 * Null constructor for IceCream class inherited from DessertItem class
	 */
	public IceCream() {
		super();
	}

	/**
	 * overloaded constructor for IceCream class inherited from DessertItem class
	 * 
	 * @param name, calories
	 */
	public IceCream(String name, int calories) {
		super(name, calories);
		this.name = name + "(IceCream)";
	}

	/**
	 * add cost parameter
	 * 
	 * @param name, calories, cost
	 */
	public IceCream(String name, int calories, double cost) {
		super(name, calories);
		this.name = name + "(IceCream)";
		this.cost = cost;
	}

	/**
	 * @override abstract getCost from DesserItem class
	 * @return cost of IceCream
	 */
	public double getCost() {
		return Math.round(cost);
	}

	/**
	 * @override toString
	 * @return new string
	 */
	public String toString() {
		return String.format("%-30s %5.2f", name, getCost() / 100)
		// + "\n\n" + name + " calories: " + getCalories()
		;
	}
}// end of class
