/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Food;

/**
 *
 * @author Danboru
 */
public class BurgerBesar extends Items.RegularBurger{

    @Override
    public float price() {
        return 70.0f;
    }

    @Override
    public String name() {
        return "Burger Besar";
    }   
     
}
