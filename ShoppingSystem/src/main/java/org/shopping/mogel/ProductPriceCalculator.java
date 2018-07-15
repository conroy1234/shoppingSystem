package org.shopping.mogel;

import java.util.ArrayList;
import java.util.List;

import org.shopping.checksystem.CheckoutSystem;
import org.shopping.constants.ConstantsEnum;
import org.shopping.factory.ShoppingFactory;
public class ProductPriceCalculator {

	private static double totalCost = 0;
	static double result=0;

	public static double priceCalculation(String productName, double quantity) {
		if (productName.equalsIgnoreCase("Apple")) {
			totalCost = quantity * Double.parseDouble(ConstantsEnum.APPLE_COST.toString());
			calculateResultForApple();
			
		}
		if (productName.equalsIgnoreCase("Orange")) {
			totalCost = quantity *Integer.parseInt(ConstantsEnum.ORANGE_COST.toString());;
			int discount = (int) (quantity/2);
			result= (quantity + discount);
			System.out.println("product Name:"	+productName+ "\n Amount selected: "+quantity+	"\n amount recieved: "+result);
			
			System.out.println("Total price: £"+calculateResultForOrange(totalCost));
		}
		return result;
	}

	public static double calculateResultForApple() {
		double firstresult= (totalCost * 50)/100;
		if(firstresult>=1) {
			result=firstresult/100;	
		}
		return result;
	}
	
	public static double calculateResultForOrange(double orangeTotalPrice) {
		return orangeTotalPrice/100;
		
	}

public static double process(String productName,double quantity) {
		
		ShoppingFactory shoppingFactory = new ShoppingFactory();
		shoppingFactory.selectProduct(productName);		
		CheckoutSystem system = new CheckoutSystem(shoppingFactory);
		ProductPriceCalculator.priceCalculation(productName, quantity);
		List<String> list = new ArrayList<>();
		list.add(productName);			
		System.out.println("price per unit: "+CheckoutSystem.generateReceipt(list));
		if(!productName.equalsIgnoreCase("Orange")) {
		System.out.println("product Name:"	+productName+ "\n Amount selected: "+quantity+	"\n total cost: £"+ProductPriceCalculator.priceCalculation(productName, quantity));
		}
		return quantity;
}


}