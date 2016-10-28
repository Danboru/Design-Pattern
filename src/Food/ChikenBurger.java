/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

import Items.Burger;

/**
 *
 * @author Danboru
 */
public class ChikenBurger extends Burger{

    @Override
    public float price() {
        return 40.0f;
    }

    @Override
    public String name() {
        return "Chiken Burger";
    }
  
    
}
