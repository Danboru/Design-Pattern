package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class DietCoke implements Builder.Items{

    @Override
    public String name() {
    
        return "DietCoke";//Data akan di set ulang di class Child
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Minumman.Gelas();
    
    }

    @Override
    public Type type() {
    
        return new Tipe.Minuman.Diet();
    
    }

    @Override
    public float price() {
    
        return 0;//Data akan di set ulang di class Child
    
    }
    
}
