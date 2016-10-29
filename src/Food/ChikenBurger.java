package Food;

import Items.PlainBurger;

/**
 *
 * @author Danboru
 */
public class ChikenBurger extends PlainBurger{
 
    @Override
    public float price() {
        return 40.0f;
    }

    @Override
    public String name() {        
        
        return "Chiken Burger";
        
    }

    
    
    
}
