package org.shopping.factory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Buy3ForPriceOfTwoOrangeFactoryTest {

	 @Test
	    public void buyThreeForThePriceOfTwo() throws Exception {
	        //given
		 Buy3ForPriceOfTwoOrangeFactory buyThreeForThePriceOfTwo = new Buy3ForPriceOfTwoOrangeFactory();

	        //when

	        //then
	        assertThat("1 item",buyThreeForThePriceOfTwo.apply(new Integer[]{60}), is(60));
	        assertThat("2 item",buyThreeForThePriceOfTwo.apply(new Integer[]{60,60}), is(120));
	        assertThat("3 item",buyThreeForThePriceOfTwo.apply(new Integer[]{60,60,60}), is(120));
	        assertThat("4 item",buyThreeForThePriceOfTwo.apply(new Integer[]{60,60,60,60}), is(180));
	    }
}
