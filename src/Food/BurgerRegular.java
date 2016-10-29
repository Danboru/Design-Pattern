package Food;

import Items.Plain;

/**
 *
 * @author Danboru
 */
public class BurgerRegular extends Items.Regular{

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Burger";
    }
    
    
    
}
