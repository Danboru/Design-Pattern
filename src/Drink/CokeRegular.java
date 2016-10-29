package Drink;

import Items.RegularCoke;

/**
 *
 * @author Danboru
 */
public class CokeRegular extends RegularCoke{

    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }

    
    
}
