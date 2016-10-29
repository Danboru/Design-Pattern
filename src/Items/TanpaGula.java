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
public class TanpaGula implements Builder.Items{

    @Override
    public String name() {
    
        return "Kopi Tanpa Gula";
    
    }

    @Override
    public Packing packing() {
    
        return new Wrapper.Minumman.Gelas();
    
    }

    @Override
    public Type type() {
    
        return new Tipe.Minuman.TanpaGula();
    
    }

    @Override
    public float price() {
    
        return 0;
    
    }
    
}
