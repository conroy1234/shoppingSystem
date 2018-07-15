package org.shopping.factory;

import org.shopping.factory.service.ShoppingService;
/*
 * process buy three orange for the price of two
 */
public class Buy3ForPriceOfTwoOrangeFactory implements ShoppingService {


    @Override
    public int apply(Integer[] itemsCost) {

        int numberOfItems = itemsCost.length;

        if(numberOfItems==0){
            return 0;
        }

        return (numberOfItems /3)*2* itemsCost[0] +(numberOfItems %3)* itemsCost[0];
    }
}
