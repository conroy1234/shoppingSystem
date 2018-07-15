package org.shopping.checkout.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.shopping.mogel.ProductPriceCalculator;

/*
 * the main method for execution
 */
public class CustomerService {
	public static void main(String[] args) {
		System.out.println("select your product");
		// scanner object for input stream
		Scanner input = new Scanner(System.in);
		// assing userinput to name
		String name=input.nextLine();
	 
		System.out.println("enter the quantity");
		//assign quantity entered by the user to the variable quantity
		int quantity = input.nextInt();
		
		//call product price calculator static method and pass name and quantity as parameters
		ProductPriceCalculator.process(name,quantity);
	}
	

	
}
