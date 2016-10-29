package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class TanpaGula implements Builder.Items{

    @Override
    public String name() {
    
        return "Tanpa Gula";//Data akan di set ulang di class Child
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Minumman.Gelas();
    
    }

    @Override
    public Type type() {
    
        return new Tipe.Minuman.TanpaGula();
    
    }

    @Override
    public float price() {
    
        return 0;//Data akan di set ulang di class Child
    
    }
    
}
