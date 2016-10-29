package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class Crispy implements Builder.Items{

    @Override
    public String name() {
    
        return "Crispy";//Data di set ulang di Class Child
    
    }

    @Override
    public Packing packing() {
        
        return new Wrapper.Makanan.Wrapper();
    
    }

    @Override
    public float price() {
    
        return 0;//Data akan di set ulang di class Child
    
    }

    @Override
    public Type type() {
    
        return new Tipe.ChikenType.Crispy();
    
    }
    
}
