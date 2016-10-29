package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class Plain implements Builder.Items{

    @Override
    public String name() {
    
        return "Plain";
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.PiringKertas();
    
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
