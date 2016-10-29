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
public class Wortel implements Builder.Items{

    @Override
    public String name() {
    
        return "Wortel";//Data akan di set ulang di class Child
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.Wrapper();
    
    }

    @Override
    public Type type() {
    
        return new Tipe.SoupType.Wortel();
    
    }

    @Override
    public float price() {
    
        return 0;//Data akan di set ulang di class Child
    
    }
    
}
