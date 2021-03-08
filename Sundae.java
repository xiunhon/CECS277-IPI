/**
 * @author XiuNhon
 *
 *         subclass Sundae inherited from class IceCream, create getter methods
 *         for Sundae, override abstract method getCost to calculate IceCream
 *         cost + toppingCost, override toString accordingly
 */
public class Sundae extends IceCream {
	private String topping;
	private double toppingCost;

	/**
	 * Null constructor for Sundae class inherited from IceCream class
	 */
	public Sundae() {
		super();
	}

	/**
	 * overloaded constructor for Sundae class inherited from IceCream class
	 * 
	 * @param name, calories
	 */
	public Sundae(String name, int calories) {
		super(name, calories);
		this.name = name + "(Sundae)";
		topping = "";
	}

	/**
	 * add cost parameter
	 * 
	 * @param name, calories, cost
	 */
	public Sundae(String name, int calories, double cost) {
		super(name, calories, cost);
		this.name = name + "(Sundae)";
		topping = "";
		this.cost = cost;
	}

	/**
	 * add topping's variables
	 * 
	 * @param name,calories,cost,topping,toppingCost
	 */
	public Sundae(String name, int calories, double cost, String topping, double toppingCost) {
		super(name, calories, cost);
		this.name = name + "(Sundae)";
		this.topping = topping + "(Topping)";
		this.toppingCost = toppingCost;
	}

	/**
	 * getter
	 * 
	 * @return topping name of Sundae
	 */
	public String getTopping() {
		return topping;
	}

	/**
	 * getter
	 * 
	 * @return topping cost of Sundae
	 */
	public double getToppingCost() {
		return toppingCost;
	}

	/**
	 * @override abstract getCost from DesserItem class
	 * @return cost of Sundae, calculated from icecream cost + topping cost
	 */
	public double getCost() {
		return Math.round(cost + toppingCost);
	}

	/**
	 * @override toString
	 * @return new string
	 */
	public String toString() {
		return name + " with\n"
				+ String.format("%-30s %5.2f", getTopping() + "+@ " + getToppingCost() / 100, getCost() / 100)
		// + "\n\n" + name + " calories: " + getCalories()
		;
	}
}// end of class
