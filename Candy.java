/**
 * @author XiuNhon
 * subclass Candy inherited from class DessertItem, create getter
 * methods for Candy, override abstract method getCost to calculate
 * price per lb, override toString accordingly
 */
public class Candy extends DessertItem {
	private double weight;
	private double pricePerlb;

	/**
	 * Null constructor for Candy class inherited from DessertItem class
	 */
	public Candy() {
		super();
		weight = 0.0;
		pricePerlb = 0.0;
	}

	/**
	 * overload constructor for Candy class inherited from DessertItem class add
	 * weight and pricePerlb parameter
	 * 
	 * @param name, calories
	 */
	public Candy(String name, int calories) {
		super(name, calories);
		this.name = name + "(Candy)";
		weight = 0;
		pricePerlb = 0;
	}

	/**
	 * @param name, calories, weight, pricePerlb
	 */
	public Candy(String name, int calories, double weight, double pricePerlb) {
		super(name, calories);
		this.name = name + "(Candy)";
		this.weight = weight;
		this.pricePerlb = pricePerlb;
	}

	/**
	 * getters for Weight and PricePerlb
	 */
	/**
	 * @return weight of Candy
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @return pricePerlb for Candy in cents
	 */
	public double getPricePerlb() {
		return pricePerlb;
	}

	/**
	 * @override abstract getCost from DesserItem class
	 * @return cost of Candy in cents, calculated with price per lb
	 */
	public double getCost() {
		double cost = weight * pricePerlb;
		return Math.round(cost);
	}

	/**
	 * @override toString in class java.lang.Object
	 * @return formatted string, for example 1.5 lbs. @ 7.25 /lb. Corn(Candy) 10.88
	 */
	public String toString() {
		return getWeight() + " lbs. " + "@ " + getPricePerlb() / 100 + " /lb." + "\n"
				+ String.format("%-30s %5.2f", name, getCost() / 100);
	}
}// end of class
