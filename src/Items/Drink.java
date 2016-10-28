package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class Drink implements Builder.Items{

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

    @Override
    public Type type() {
    
        return new Tipe.Minuman.TanpaGula();
    
    }
    
}
