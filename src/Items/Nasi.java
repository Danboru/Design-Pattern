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
public class Nasi implements Builder.Items{

    @Override
    public String name() {
    
        return "Nasi";
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Makanan.PiringKertas();
    
    }

    @Override
    public float price() {
    
        return 0;
    
    }

    @Override
    public Type type() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
