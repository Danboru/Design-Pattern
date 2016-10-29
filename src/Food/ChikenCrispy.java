package Food;

import Items.Regular;
import Items.Crispy;

/**
 *
 * @author Danboru
 */
public class ChikenCrispy extends Crispy{
 
    @Override
    public float price() {
        return 40.0f;
    }

    @Override
    public String name() {        
        
        return "Chiken";
        
    }

    
    
    
}
