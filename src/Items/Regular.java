package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class Regular implements Builder.Items{

    @Override
    public String name() {
        
        return "Regular";//Data akan di set ulang di class Child
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.Wrapper();
    
    }
    
       @Override
    public Type type() {
    
        return new Tipe.BurgerType.Regular();
    
    }

    @Override
    public float price() {
    
        return 0;//Data akan di set ulang di class Child
    
    }
 
}
