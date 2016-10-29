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
public class ChikenOriginal implements Builder.Items{

    @Override
    public String name() {
    
        return "Chiken Original";
    
    }

    @Override
    public Packing packing() {
    
       return new Wrapper.Makanan.Wrapper();
    
    }

    @Override
    public Type type() {
    
        return null;
    
    }

    @Override
    public float price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
