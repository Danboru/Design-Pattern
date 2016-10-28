package Items;

import Builder.Packing;

/**
 *
 * @author Danboru
 */
public class Burger implements Builder.Items{

    @Override
    public String name() {
    
        return "Burger";    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.Wrapper();
    
    }

    @Override
    public float price() {
    
        return 0;
    
    }
    
}
