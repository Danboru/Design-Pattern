package Drink;

/**
 *
 * @author Danboru
 */
public class Teh extends Items.Drink{
    
     @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Tea Drink";
    }
    
}
