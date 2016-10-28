/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import Builder.Packing;
import Builder.Type;

/**
 *
 * @author Danboru
 */
public class RegularBurger implements Builder.Items{

    @Override
    public String name() {
    
        return "Regular Burger";
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.PiringKertas();
    
    }

    @Override
    public Type type() {
    
        return new Tipe.BurgerType.Regular();
    
    }

    @Override
    public float price() {
    
        return 0;
    
    }
    
}
