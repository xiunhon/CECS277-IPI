import java.util.*;

public class IPI {
	/**
	 * A program to compare two DessertItems using max() method from DessertItem
	 * class
	 * 
	 * @param d1
	 * @param d2 print the appropriate comparison print "d1 is greater then d2" if
	 *           max() return d1 print "d2 is greater than d1" if max() return d2
	 *           print "d1 is equal to d2" if max() return null
	 */
	public static void caloriesCompare(DessertItem d1, DessertItem d2) {
		DessertItem maxd = DessertItem.max(d1, d2);
		if (maxd == d1)
			System.out.println(d1.getName() + " with " + d1.getCalories() + " calories is bigger than " + d2.getName()
					+ " with " + d2.getCalories() + " calories");
		else if (maxd == d2)
			System.out.println(d2.getName() + " with " + d2.getCalories() + " calories is bigger than " + d1.getName()
					+ " with " + d1.getCalories() + " calories");
		else
			System.out.println(d1.getName() + " with " + d1.getCalories() + " calories is equal to " + d2.getName()
					+ " with " + d2.getCalories() + " calories");
	}

	/**
	 * Main driver
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Subclasses Tester
		 */
//		System.out.println("-------------------------------------\nCANDY Tester:");
//		DessertItem cd1 = new Candy();
//		DessertItem cd2 = new Candy("Candy", 500);
//		DessertItem cd3 = new Candy("Corn", 500, 1.5, 7.25);
//		DessertItem cd4 = new Candy("Lolipop", 640, 2.5, 8.25);
//		System.out.println(cd1 + "\n");
//		System.out.println(cd2 + "\n");
//		System.out.println(cd3 + "\n");
//		System.out.println(cd4 + "\n");
//		
//		System.out.println("-------------------------------------\nCOOKIE Tester:");
//		DessertItem ck1 = new Cookie();
//		DessertItem ck2 = new Cookie("Cookie", 250);
//		DessertItem ck3 = new Cookie("ChocoChip", 250, 17, 4.99);
//		DessertItem ck4 = new Cookie("Oatmeal", 240, 15, 3.99);
//		System.out.println(ck1 + "\n");
//		System.out.println(ck2 + "\n");
//		System.out.println(ck3 + "\n");
//		System.out.println(ck4 + "\n");
//		
//		System.out.println("-------------------------------------\nICECREAM Tester:");
//		DessertItem i1 = new IceCream();
//		DessertItem i2 = new IceCream("IceCream", 600);
//		DessertItem i3 = new IceCream("Vanila", 500, 10.05);
//		DessertItem i4 = new IceCream("Chocolate", 500, 9.99);
//		System.out.println(i1 + "\n");
//		System.out.println(i2 + "\n");
//		System.out.println(i3 + "\n");
//		System.out.println(i4 + "\n");
//		
//		System.out.println("-------------------------------------\nSUNDAE Tester:");
//		DessertItem s1 = new Sundae();
//		DessertItem s2 = new Sundae("Sundae", 600);
//		DessertItem s3 = new Sundae("Caramel", 500, 10.05);
//		DessertItem s4 = new Sundae("Caramel", 500, 9.99, "HotFudge", 3.0);
//		DessertItem s5 = new Sundae("BananaSplit", 560, 4.9, "Strawberries", 2.0);
//		System.out.println(s1 + "\n");
//		System.out.println(s2 + "\n");
//		System.out.println(s3 + "\n");
//		System.out.println(s4 + "\n");
//		System.out.println(s5 + "\n");
//		
//		System.out.println("-------------------------------------\nRANDOM Tester:");
//		DessertItem d1 = new Candy("Vanila",500, 1.5, 5.0);
//		DessertItem d2 = new Cookie("Vanila",500, 15, 5.0);
//		DessertItem d3 = new IceCream();
//		DessertItem d4 = new Sundae("Choco", 300, 6.9, "Mashmallow", 3.0);
//		d3.setName("Matcha");
//		d3.setCalories(520);
//		System.out.println(d1.getCost());
//		System.out.println(d2.getCost());
//		System.out.println(d3.getCalories());
//		System.out.println(d3);
//		System.out.println(d4);

//		System.out.println("-------------------------------------\n"
//				+ "ARRAYLIST Tester:\n"
//				+ "-------------------------------------\n");
//		ArrayList<DessertItem> receipt1 = new ArrayList<DessertItem>();
//		receipt1.add(new Candy("Vanila",500, 1.5, 500));
//		receipt1.add(new Cookie("ChocoChip", 250, 17, 499));
//		receipt1.add(new IceCream("Chocolate", 500, 999));
//		receipt1.add(new Sundae("BananaSplit", 560, 490, "Strawberries", 200));
//		
//		for (DessertItem s : receipt1)
//			System.out.println(s + "\n");

		/**
		 * CheckOut Tester
		 */
//		CheckOut c1 = new CheckOut();
//			c1.enterItem(new Candy("Lolipop", 640, 2.5, 825)); 
//			c1.enterItem(new Cookie("Oatmeal", 240, 15, 399)); 
//			c1.enterItem(new IceCream("Chocolate", 500, 999)); 
//			c1.enterItem(new Sundae("BananaSplit", 560, 490, "Strawberries", 200)); 
//			c1.enterItem(new Candy("Corn", 500, 1.5, 725)); 
//			c1.enterItem(new Cookie("ChocoChip", 250, 17, 499)); 
//			c1.enterItem(new IceCream("Vanilla", 500, 1005));
//			c1.enterItem(new Sundae("Caramel", 600, 700, "HotFudge", 70)); 
//		
//		CheckOut c2 = new CheckOut(c1);
//		
//		c2.setTaxRate(8);
//		c2.enterItem(new Cookie ("Ginger", 660, 25, 799));
//		System.out.println("C1 - tax rate: 0.0775 == " + c1.getTaxRate());
//		System.out.println("C2 - tax rate: 0.08 == " + c2.getTaxRate());
//		System.out.println("C1 - number of items: 8 == " + c1.numberOfItem());
//		c1.clear();
//		System.out.println("C1 - number of items: 0 == " + c1.numberOfItem());
//		c1.enterItem(new IceCream("Matcha", 500, 950));
//		System.out.println("C1 - number of items: 1 == " + c1.numberOfItem());
//		System.out.println("C2 - number of items: 9 == " + c2.numberOfItem());
//		System.out.println("C1 - totalCost without tax in cents: 950 == " + c1.totalCost());
//		System.out.println("C2 - totalTax in cents: 758 == " + c2.totalTax());
//		System.out.println("C2 - totalCost with tax in cents: 10244 == " + (c2.totalCost() + c2.totalTax()));
//		
//		
//		System.out.println(c2);

		/**
		 * Max Tester
		 */
		DessertItem d1 = new Candy("Lolipop", 640, 2.5, 825);
		DessertItem d2 = new Cookie("Oatmeal", 240, 15, 399);
		DessertItem d3 = new IceCream("Chocolate", 500, 999);
		DessertItem d4 = new Sundae("BananaSplit", 560, 490, "Strawberries", 200);
		DessertItem d5 = new Candy("Corn", 500, 1.5, 725);
		DessertItem d6 = new Cookie("ChocoChip", 250, 17, 499);
		DessertItem d7 = new IceCream("Vanilla", 500, 1005);
		DessertItem d8 = new Sundae("Caramel", 600, 700, "HotFudge", 70);

		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Max Test With Same DessertItem Types:\n");
		caloriesCompare(d1, d5);
		caloriesCompare(d2, d6);
		caloriesCompare(d3, d7);
		caloriesCompare(d4, d8);

		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Max Test With Different DessertItem Types:\n");
		caloriesCompare(d1, d2);
		caloriesCompare(d3, d4);
		caloriesCompare(d5, d7);
		caloriesCompare(d6, d8);

		ArrayList<DessertItem> itemList = new ArrayList<DessertItem>();
		itemList.add(d1);
		itemList.add(d2);
		itemList.add(d3);
		itemList.add(d4);
		itemList.add(d5);
		itemList.add(d6);
		itemList.add(d7);
		itemList.add(d8);
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("The unsorted DessertList is:\n");
		for (DessertItem d : itemList)
			System.out.println(d.getName() + " has " + d.getCalories() + " calories");

		Collections.sort(itemList);
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("The sorted DessertList is:\n");
		for (DessertItem d : itemList)
			System.out.println(d.getName() + " has " + d.getCalories() + " calories");

	}// end of main

}// end of class
