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
public class Large implements Builder.Items{

    @Override
    public String name() {
    
        return "Large";//Data akan di set ulang di class Child
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.Wrapper();
    
    }

    @Override
    public float price() {
    
        return 0;//Data akan di set ulang di class Child
    
    }

    @Override
    public Type type() {
    
        return new Tipe.RiceType.Large();
    
    }
    
}
