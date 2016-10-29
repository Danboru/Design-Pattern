package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class DenganGula implements Builder.Items{
    
    @Override
    public String name() {
    
        return "Dengan Gula";//Data akan di set ulang di CLass Child
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Minumman.Gelas();
    
    }

    @Override
    public Type type() {
    
        return new Tipe.Minuman.DenganGula();
    
    }

    @Override
    public float price() {
    
        return 0;//Data akan di set ulang di class Child
    
    }
    
}
