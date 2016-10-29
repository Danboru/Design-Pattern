package Drink;

/**
 *
 * @author Danboru
 */
public class Coffe extends Items.Drink{
    
     @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coffe Drink";
    }
    
}
