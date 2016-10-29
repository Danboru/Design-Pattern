package Drink;

/**
 *
 * @author Danboru
 */
public class CoffeDenganGula extends Items.DenganGula{
    
     @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Kopi";
    }
    
}
