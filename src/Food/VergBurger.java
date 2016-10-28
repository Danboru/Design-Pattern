package Food;

import Items.RegularBurger;

/**
 *
 * @author Danboru
 */
public class VergBurger extends RegularBurger{

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Vegetable Burger";
    }
    
    
    
}
