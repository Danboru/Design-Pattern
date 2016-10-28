package Items;

import Builder.Packing;

/**
 *
 * @author Danboru
 */
public class ColdDrink implements Builder.Items{

    @Override
    public String name() {
    
        return "Cold Drink";
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Minumman.Bottle();
    
    }

    @Override
    public float price() {
    
        return 0;
    
    }
    
}
