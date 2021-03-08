/**
 * @author Group 3 - Victorira T. Tien N., Nik K. due date: Feb 17, 2021
 *
 *         An abstract class DessertItem to create new object implementing
 *         polymorphism, inheritance, interface subclasses: Candy, Cookie,
 *         IceCream, Sundae
 */
public abstract class DessertItem implements Comparable<DessertItem> {

	protected String name;
	protected int calories;

	/**
	 * Null constructor for DessertItem class
	 */
	public DessertItem() {
		name = "";
		calories = 0;
	}

	/**
	 * Initializes DessertItem data
	 */
	public DessertItem(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}

	/**
	 * setters for name and calories
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * Returns name of DessertItem
	 * 
	 * @return name of DessertItem
	 */
	public final String getName() {
		return name;
	}

	public final int getCalories() {
		return calories;
	}

	/**
	 * Returns cost of DessertItem
	 * 
	 * @return cost of DessertItem
	 */
	public abstract double getCost();

	/**
	 * compare this DessertItem's calories with the other's
	 * 
	 * @param other
	 * @return 1 if this > other
	 * @return -1 if this < other
	 * @return 0 if this == other
	 */
	public int compareTo(DessertItem other) {
		if (getCalories() > other.getCalories())
			return 1;
		else if (getCalories() < other.getCalories())
			return -1;
		else
			return 0;
	}

	/**
	 * using the result of compareTo() to determine the DessertItem with bigger
	 * calories
	 * 
	 * @param d1
	 * @param d2
	 * @return DessertItem with bigger calories if equal, return null
	 */
	public static DessertItem max(DessertItem d1, DessertItem d2) {
		if (d1.compareTo(d2) == 1) // d1 > d2
			return d1;
		else if (d1.compareTo(d2) == -1)
			return d2;
		return null;
	}

}// end of class