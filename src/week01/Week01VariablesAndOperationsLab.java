//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
int seats = 34;
		
		// 2. Create a variable to hold the cost of groceries at checkout
double groceriesCost = 101.23;
		
		// 3. Create a variable to hold a person's middle initial
char middleInitial = 'J';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
boolean hotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
String firstName = "Aaron";
		
		// 6. Create a variable to hold a street address
String streetAddress = "23 spooner st";		

		// 7. Print all variables to the console
	
System.out.println(seats);
System.out.println(groceriesCost);
System.out.println(middleInitial);
System.out.println(hotOutside);
System.out.println(firstName);
System.out.println(streetAddress);
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable

System.out.println(seats - 2);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
System.out.println(groceriesCost = 2.15);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
middleInitial = 'A';
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
hotOutside = !hotOutside;
System.out.println(hotOutside);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	
String fullName = firstName + " " + middleInitial + " Smith";
System.out.println(fullName);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress);
		
		
	}
}