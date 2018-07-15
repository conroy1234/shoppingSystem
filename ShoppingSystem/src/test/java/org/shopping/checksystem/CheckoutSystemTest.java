package org.shopping.checksystem;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.shopping.constants.ConstantsEnum;
import org.shopping.factory.ShoppingFactory;
import org.shopping.mogel.ProductPriceCalculator;

class CheckoutSystemTest {
	CheckoutSystem checkoutSystem;

	@Test
	public void shouldPrintReceiptForShoppingCartContainingApplesAfterBuyOneGetOneOffer() throws Exception {
		// given

		// when

		// then
		checkoutSystem = new CheckoutSystem(new ShoppingFactory());
		List<String> appleList = Arrays.asList(ConstantsEnum.APPLE.toString());
		List<String> applist2 = Arrays.asList(ConstantsEnum.APPLE.toString(), ConstantsEnum.APPLE.toString());
		List<String> applist3 = Arrays.asList(ConstantsEnum.APPLE.toString(), ConstantsEnum.APPLE.toString(),
				ConstantsEnum.APPLE.toString());
		assertThat("1 Apple", CheckoutSystem.generateReceipt(appleList), is("£0.60"));
		assertThat("2 Apple", CheckoutSystem.generateReceipt(applist2), is("£0.60"));
		assertThat("3 Apple", CheckoutSystem.generateReceipt(applist3), is("£1.20"));
	}

	@Test
	public void shouldPrintReceiptForShoppingCartContainingOrangesAfter3For2Offer() throws Exception {
		// given
		checkoutSystem = new CheckoutSystem(new ShoppingFactory());

		List<String> orangeList = Arrays.asList("Orange");
		List<String> orangeList2 = Arrays.asList("Orange", "Orange");
		List<String> orangeList3 = Arrays.asList("Orange", "Orange", "Orange");
		List<String> orangeList4 = Arrays.asList("Orange", "Orange", "Orange", "Orange");
		// then
		assertThat("1 Orange", CheckoutSystem.generateReceipt(orangeList), is("£0.25"));
		assertThat("2 Orange", CheckoutSystem.generateReceipt(orangeList2), is("£0.50"));
		assertThat("3 Orange", CheckoutSystem.generateReceipt(orangeList3), is("£0.50"));
		assertThat("4 Orange", CheckoutSystem.generateReceipt(orangeList4), is("£0.75"));
	}

	@Test
	public void shouldPrintReceiptForShoppingCartContainingApplesAndOrangesAfterOffers() throws Exception {
		checkoutSystem = new CheckoutSystem(new ShoppingFactory());
		List<String> orangeAppleList = Arrays.asList("Apple", "Apple", "Orange");
		List<String> orangeAppleList2 = Arrays.asList("Apple", "Apple", "Orange", "Orange", "Orange");
		// then
		assertThat("2 Apple, 1 Orange", CheckoutSystem.generateReceipt(orangeAppleList), is("£0.85"));
		assertThat("2 Apple, 3 Oranges", CheckoutSystem.generateReceipt(orangeAppleList2), is("£1.10"));
		
	}

}
