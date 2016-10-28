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
public class MealBuilder {
    
    public Meal.Meal prepareVegMeal (){
      Meal.Meal meal = new Meal.Meal();
      meal.addItem(new Food.VergBurger());
      meal.addItem(new Drink.Coke());
      
      return meal;
   }   

   public Meal.Meal prepareNonVegMeal (){
       
      Meal.Meal meal = new Meal.Meal();
      meal.addItem(new Food.ChikenBurger());
      meal.addItem(new Drink.Pepsi());
      return meal;
   }
    
}
