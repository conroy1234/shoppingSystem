package org.shopping.factory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuyOneGetOneFreeAppleFactoryTest {

	@Test
    public void shouldApply_Buy1Get1_Offer() throws Exception {
        //given
		BuyOneGetOneFreeAppleFactory buyOneApplegetOneFree = new BuyOneGetOneFreeAppleFactory();

        //when

        //then
        assertThat("1 Item", buyOneApplegetOneFree.apply(new Integer[]{60}), is(60));
        assertThat("2 Item", buyOneApplegetOneFree.apply(new Integer[]{60,60}), is(60));
        assertThat("3 Item", buyOneApplegetOneFree.apply(new Integer[]{60,60,60}), is(120));
    }

}
