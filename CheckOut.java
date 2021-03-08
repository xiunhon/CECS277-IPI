import java.util.*;

/**
 * @author Group 3 - Victorira T. Tien N., Nik K. due date: Feb 17, 2021
 * 
 *         Maintains a list of DessertItem references There is no limit to the
 *         number of DessertItem's in the list
 *
 */
public class CheckOut {
	private ArrayList<DessertItem> itemList;
	private double taxRate;

	/**
	 * Null constructor of CheckOut class Creates a Checkout instance with an empty
	 * list of DessertItem's
	 */
	public CheckOut() {
		this.itemList = new ArrayList<DessertItem>();
		taxRate = 7.75 / 100;
	}

	/**
	 * copy constructor
	 * 
	 * @param another CheckOut object
	 */
	public CheckOut(CheckOut newCustomer) {
		this.itemList = new ArrayList<DessertItem>(newCustomer.itemList);
		this.taxRate = newCustomer.taxRate;
	}

	/**
	 * Clears the Checkout to begin checking out a new set of items
	 */
	public void clear() {
		itemList.clear();
	}

	/**
	 * A DessertItem is added to the end of the list of items
	 * 
	 * @param item - DessertItem to add to list of items
	 */
	public void enterItem(DessertItem item) {
		itemList.add(item);
	}

	/**
	 * Returns the number of DessertItem's in the list
	 * 
	 * @return number of items on the list
	 */
	public int numberOfItem() {
		return itemList.size();
	}

	/**
	 * Changes the tax rate for this purchase
	 * 
	 * @param rate
	 */
	public void setTaxRate(double rate) {
		taxRate = rate / 100;
	}

	/**
	 * @return tax rate for this purchase
	 */
	public double getTaxRate() {
		return taxRate;
	}

	/**
	 * @return total cost of items in cents (without tax)
	 */
	public int totalCost() {
		double totalCost = 0;
		for (DessertItem c : itemList)
			totalCost += c.getCost();
		return (int) (totalCost);
	}

	/**
	 * @return total tax on items in cents
	 */
	public int totalTax() {
		double totalTax = totalCost() * getTaxRate();
		return (int) totalTax;
	}

	/**
	 * @override toString in class java.lang.Object
	 * @return a String representing a receipt for the current list of DessertItem's
	 *         with the name of the Dessert store, the items purchased, the tax, and
	 *         the total cost, for example, M & M Dessert Shoppe
	 *         --------------------
	 * 
	 *         Strawberry Ice Cream 1.45 Caramel Sundae with Vanilla Ice Cream 1.55
	 *         1.33 lbs. @ .89 /lb. Gummy Worms 1.18 4 @ 3.99 /dz. Chocolate Chip
	 *         Cookies 1.33 1.50 lbs. @ 2.09 /lb. Salt Water Taffy 3.14 3.00 lbs. @
	 *         1.09 /lb. Candy Corn 3.27
	 * 
	 *         Tax .77 Total Cost 12.69
	 */
	public String toString() {
		// header contains: number of items, total cost, total tax, cost + tax, name of
		// the shop
		String header = "\n======================================\n" + "======================================\n"
				+ "Output Receipt:\n\n" + "Number of items: " + numberOfItem() + "\n" + "Total cost: " + totalCost()
				+ "\n" + "Total tax: " + totalTax() + "\n" + "Cost + tax: " + (totalCost() + totalTax()) + "\n"
				+ "\n\tGroup 3 Dessert Shoppe\n" + "\t----------------------";
		// body contains name + cost of each DessertItem
		String body = "";
		for (DessertItem s : itemList)
			body = body + "\n" + s.toString();
		// footer contains: subtotal, tax rate, total tax, total cost = subtotal + total
		// tax
		String footer;
		footer = "\n\n" + String.format("%-30s %5.2f", "Subtotal: ", (double) totalCost() / 100) + "\n"
				+ String.format("%-30s %5.2f", "Tax rate: ", (getTaxRate() * 100)) + "%" + "\n"
				+ String.format("%-30s %5.2f", "Total tax: ", (double) totalTax() / 100) + "\n\n"
				+ String.format("%-30s %5.2f", "TOTAL COST: ", (double) (totalCost() + totalTax()) / 100);

		return header + body + footer;
	}
}// end of class
