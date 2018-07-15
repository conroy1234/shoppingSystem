package org.shopping.factory;

import org.shopping.factory.service.ShoppingService;
/*
 * process buy one get on free apple
 */
public class BuyOneGetOneFreeAppleFactory implements ShoppingService {


    @Override
    public int apply(Integer[] itemsCost) {
        int numberOfItems = itemsCost.length;
        
        if(numberOfItems==0){
            return 0;
        }

        return (numberOfItems /2)* itemsCost[0] + (numberOfItems %2)* itemsCost[0];
    }
}