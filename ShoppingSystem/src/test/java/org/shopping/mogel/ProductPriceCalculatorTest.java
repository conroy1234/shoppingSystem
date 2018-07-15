package org.shopping.mogel;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductPriceCalculatorTest {

	@Test
	void testPriceCalculation() {
		
		assertNotNull(ProductPriceCalculator.priceCalculation("Apple",6));
		assertNotNull(ProductPriceCalculator.priceCalculation("Orange",4));
	}

	@Test
	void testCalculateResultForApple() {
		assertNotNull(ProductPriceCalculator.calculateResultForApple());
	}

	@Test
	void testCalculateResultForOrange() {
		assertNotNull(ProductPriceCalculator.calculateResultForOrange(0.25));
	}

	@Test
	void testProcess() {		
		assertNotNull(ProductPriceCalculator.process("Apple", 3));
	}

}
