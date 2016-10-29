/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Meal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danboru
 */
public class Meal {
    
    
    private List<Builder.Items> items = new ArrayList<Builder.Items>();
    
    public void addItem(Builder.Items item){
    
        items.add(item);
    
    }
    
    public float getCost(){
    
        float cost = 00.0f;
        
        for (Builder.Items item : items) {
         cost += item.price();
      }		
      return cost;
    
    }
    
    
    public void showItems(){
   
      for (Builder.Items item : items) {
          
         System.out.println("========== PEMESANANSANAN =========="); 
         System.out.println("Item : " + item.name());
         System.out.println("Packing : " + item.packing().Pack());
         System.out.println("Type : " + item.type().Type());
         System.out.println("Price : " + item.price());
         System.out.println("====================================");
         
      }	
    }
    
}
