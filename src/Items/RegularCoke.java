package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class RegularCoke implements Builder.Items{

    @Override
    public String name() {
    
        return "RegularCoke";
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Minumman.Gelas();
    
    }

    @Override
    public float price() {
    
        return 0;
    
    }

    @Override
    public Type type() {
    
        return new Tipe.Minuman.Regular();
    
    }
    
}
