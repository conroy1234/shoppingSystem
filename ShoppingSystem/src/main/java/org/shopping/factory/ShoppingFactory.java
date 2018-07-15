package org.shopping.factory;

import org.shopping.factory.service.ShoppingService;
/*
 * process the product according the type selected
 */
public class ShoppingFactory {

    public ShoppingService selectProduct(String name) {
        switch(name.toLowerCase()) {
            case("apple"):
                return new BuyOneGetOneFreeAppleFactory();
            case ("orange"):
                return new Buy3ForPriceOfTwoOrangeFactory();
            default:
                throw new IllegalArgumentException(name + " Item not listed");
        }
    }

}
