package org.shopping.checksystem;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.shopping.constants.ConstantsEnum;
import org.shopping.factory.ShoppingFactory;
import org.shopping.mogel.ProductPriceCalculator;

import static java.util.Collections.frequency;
import static java.util.Collections.nCopies;

public class CheckoutSystem {

	//object of shopping factory
	private static ShoppingFactory shoppingFactory;
	

	
	public CheckoutSystem(ShoppingFactory shoppingFactory) {
		this.shoppingFactory = shoppingFactory;
	}

	/*
	 * generate receipt
	 */
	public static String generateReceipt(List<String> shoppingCart) {

		BigDecimal total = new BigDecimal(scan(shoppingCart) * .01);

		return NumberFormat.getCurrencyInstance().format(total);
	}

	/*
	 * method that scan for object and orcording to their cost and price
	 */
	public static int scan(List<String> shoppingCart) {

		int total = 0;

		int apples = frequency(shoppingCart, ConstantsEnum.APPLE.toString());
		total += shoppingFactory.selectProduct("Apple").apply(
				nCopies(apples, Integer.parseInt(ConstantsEnum.APPLE_COST.toString())).toArray(new Integer[apples]));

		int oranges = frequency(shoppingCart, ConstantsEnum.ORANGE.toString());
		total += shoppingFactory.selectProduct(ConstantsEnum.ORANGE.toString()).apply(
				nCopies(oranges, Integer.parseInt(ConstantsEnum.ORANGE_COST.toString())).toArray(new Integer[oranges]));

		return total;
	}


}
