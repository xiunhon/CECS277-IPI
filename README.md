# Dessert Shop
Implement inheritance, polymorphis, interface\
Part I
For this homework assignment, you will be writing software in support of a Dessert Shoppe which sells candy by the pound, cookies by the dozen, ice cream, and sundaes (ice cream with a topping).
To do this, you will implement an inheritance hierarchy of classes derived from a DessertItem superclass.
The Candy, Cookie, and IceCream classes will be derived from the DessertItem class.
The Sundae class will be derived from the IceCream class.
The DessertItem class
The DessertItem class is a superclass from which specific types of DessertItems can be derived.
It contains only one instance variable for the name of a specific dessert item.
Here is the code for DessertItem: DessertItem.java.
The getCost() method is not defined in the DessertItem class because the method of determining the costs varies based on the type of item.
The Derived(Child) Classes
The Candy class should be derived from the DessertItem class. A Candy item has a weight and a price per pound which are used to determine its cost. For example, 2.30 lbs.of fudge @ .89 /lb. = 205 cents. The cost should be rounded to the nearest cent.
The Cookie class should be derived from the DessertItem class. A Cookie item has a number and a price per dozen which are used to determine its cost. For example, 4 cookies @ 399 cents /dz. = 133 cents. The cost should be rounded to the nearest cent.
The IceCream class should be derived from the DessertItem class. An IceCream item simply has a cost.
The Sundae class should be derived from the IceCream class. The cost of a Sundae is the cost of the IceCream plus the cost of the topping.
All DessertItems have calories. You must also create the appropriate getter and setter methods for this instance variable.
The Checkout Class
You will also need to write a Checkout class. This class provides methods to enter dessert items into the cash register, clear the cash register, get the number of items, get the total cost of the items (before tax), get the total tax for the items, and get a String representing a receipt for the dessert items.
The Checkout class must use an ArrayList to store the DessertItem's. The total tax should be rounded to the nearest cent.
All output from the Checkout class must display money in dollars and cents.
The complete specifications for the Checkout class are provided for you in JavaDoc format.
You will also need to allow for a tax rate in the Checkout class. You can add it to the constructor. Or you can create setTax() and getTax() methods to this class.
Testing
You must do extensive testing for this project. You will test every constructor and every method.
Create tests that will demonstrate polymorphism. You can do this by creating an ArrayList of DessertItems objects then proving that if you invoke the getCost() or getCalorie() methods, the correct version of the method will be executed.

Part II
Modify the DessertItem class to implement the Comparable interface, and define a static max method in the DessertItem class for finding the larger of two DessertItem objects. This max() method will use the results of the compareTo() method to make that determination. This method needs to return the larger object.
Write a test program that uses the max() method to find the larger of any two DessertItems.
Make several tests comparing DessertItems of the same type (IceCream vs. IceCream and DessertItems of different types (IceCream vs. Candy). Use the appropriate methods to determine if two DessertItems are the same.
Add all your desserts to an ArrayList, sort it, then print out the sorted ArrayList.
You do not need to hand in two parts. I divided the project into two parts so you could start on it before we covered all the required material.
Sample Output
Following is just some of the possible output. You will need to test every constructor, every method, etc.


------------------------------------------------------------------------------------------------------
CANDY TEST:
0.0 lbs. @ 0.0 /lb.
                             0.00

1.5 lbs. @ 7.25 /lb.
Corn(Candy)                 10.88

Corn(Candy) calories:500

2.5 lbs. @ 8.25 /lb.
Lolipop(Candy)              20.63

Lolipop(Candy) calories:640

------------------------------------------------------------------------------------------------------
COOKIE TEST:
0 @ 0.0 /dz.
                             0.00

17 @ 4.99 /dz.
ChocChip(Cookie)             7.07

ChocChip(Cookie) calories:250

15 @ 3.99 /dz.
Oatmeal(Cookie)              4.99

Oatmeal(Cookie) calories:240

------------------------------------------------------------------------------------------------------
ICECREAM TEST:
                             0.00

Vanilla(IceCream)           10.05

Vanilla(IceCream) calories:500

Chocolate(IceCream)          9.99

Chocolate(IceCream) calories:500

------------------------------------------------------------------------------------------------------
SUNDAE TEST:
 with
                             0.00

Caramel(Sundae) with
HotFudge(Topping)            7.70

Caramel(Sundae) calories:600

BananaSplit(Sundae) with
Strawberries(Topping)        6.90

BananaSplit(Sundae) calories:560
------------------------------------------------------------------------------------------------------
Output Receipt:

Number of items: 8
Total cost: 7821
Total tax: 606
Cost + Tax: 8427

        A&S Dessert Shop
        ----------------
2.5 lbs. @ 8.25 /lb.
Lolipop(Candy)              20.63
15 @ 3.99 /dz.
Oatmeal(Cookie)              4.99
Chocolate(IceCream)          9.99
BananaSplit(Sundae) with
Strawberries(Topping)        6.90
1.5 lbs. @ 7.25 /lb.
Corn(Candy)                 10.88
17 @ 4.99 /dz.
ChocChip(Cookie)             7.07
Vanilla(IceCream)           10.05
Caramel(Sundae) with
HotFudge(Topping)            7.70

Tax:                         6.06
Total cost:                 84.27


------------------------------------------------------------------------------------------------------
Max Test With Same DessertItem Types:
Lolipop(Candy) with 640 calories is bigger than Corn(Candy) with 500 calories.
ChocChip(Cookie) with 250 calories is bigger than Oatmeal(Cookie) with 240 calories.
Vanilla(IceCream) with 500 calories is equal to Chocolate(IceCream) with 500 calories.
Caramel(Sundae) with 600 calories is bigger than BananaSplit(Sundae) with 560 calories.
------------------------------------------------------------------------------------------------------
Max Test With Different DessertItem Types:
Lolipop(Candy) with 640 calories is bigger than Oatmeal(Cookie) with 240 calories.
BananaSplit(Sundae) with 560 calories is bigger than Chocolate(IceCream) with 500 calories.
Corn(Candy) with 500 calories is equal to Vanilla(IceCream) with 500 calories.
Caramel(Sundae) with 600 calories is bigger than ChocChip(Cookie) with 250 calories.
------------------------------------------------------------------------------------------------------
The unsorted DessertList is:
Corn(Candy) has 500 calories.
Lolipop(Candy) has 640 calories.
ChocChip(Cookie) has 250 calories.
Oatmeal(Cookie) has 240 calories.
Vanilla(IceCream) has 500 calories.
Chocolate(IceCream) has 500 calories.
Caramel(Sundae) has 600 calories.
BananaSplit(Sundae) has 560 calories.
------------------------------------------------------------------------------------------------------
The sorted DessertList is:
Oatmeal(Cookie) has 240 calories.
ChocChip(Cookie) has 250 calories.
Corn(Candy) has 500 calories.
Vanilla(IceCream) has 500 calories.
Chocolate(IceCream) has 500 calories.
BananaSplit(Sundae) has 560 calories.
Caramel(Sundae) has 600 calories.
Lolipop(Candy) has 640 calories.
