package Drink;

/**
 *
 * @author Danboru
 */
public class CokeDiet extends Items.DietCoke {

    @Override
    public float price() {
       
        return 50.0f;
    }

    @Override
    public String name() {
         return "Coke";
    }
    
    
    
}
