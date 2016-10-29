package Meal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danboru
 */
public class Meal {
    
    //Instance untuk singleton
    private static Meal instance = new Meal();
    
    //private constructor
    private Meal(){
    
    };
    
    private List<Builder.Items> items = new ArrayList<Builder.Items>();
    
    public void addItem(Builder.Items item){
    
        items.add(item);
    
    }
    
    //Data di ambil dari Item.price()
    public float getCost(){
    
        float cost = 00.0f;
        
        for (Builder.Items item : items) {
         cost += item.price();//package Food & Drink
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
    
    //Mengakses private constructor yang di inisialisasi di instance
    public static Meal getInstance(){
    
        return instance;
    
    }
    
}
