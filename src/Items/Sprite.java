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
public class Sprite implements Builder.Items{

    @Override
    public String name() {
    
        return "Sprite";//Data akan di set ulang di class Child
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Minumman.Bottle();
    
    }

    @Override
    public Type type() {
    
        return new Tipe.Minuman.Original();
    
    }

    @Override
    public float price() {
   
        return 0;//Data akan di set ulang di class Child
    
    }
    
}
