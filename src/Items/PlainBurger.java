package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class PlainBurger implements Builder.Items{

    @Override
    public String name() {
    
        return "Plain Burger";    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.Wrapper();
    
    }
    
       @Override
    public Type type() {
    
        return new Tipe.BurgerType.Plain();
    
    }

    @Override
    public float price() {
    
        return 0;
    
    }
 
}
