/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Danboru
 */
public class MealBuilder{
    
    public Meal.Meal prepareItem (String makanan, String minuman){
        
      Meal.Meal meal = new Meal.Meal();
      //Desicion makanan
      if(makanan.equalsIgnoreCase("1")){
          
          meal.addItem(new Food.VergBurger());
      
      }
      if(makanan.equalsIgnoreCase("2")){
      
          meal.addItem(new Food.ChikenBurger());
      
      }
      
      
      //Desicin Minuman
      if(minuman.equalsIgnoreCase("1")){
      
          meal.addItem(new Drink.Coke());
      
      }
      
      //Return semua data ke dalam List<Item>
      return meal;
   }   

    
}
