//BISMILLAHIRRAHMANIRRAHIM
//########################################
//## #####      ###      ###  ########  ##
//## #######    ####     ###  ###   ### ##
//## ###  ###   #####    ###  ###    ## ##
//## ###   ###  ### ##   ###  ###   ### ##
//## ###   ###  ###  ##  ###  ########  ##
//## ###   ###  ###   ## ###  ###   ### ##
//## ###  ###   ###    #####  ###    ## ##
//## #######    ###     ####  ###   ### ##
//## #####      ###      ###  ########  ##
//########################################
package designpatterns;

/**
 *
 * @author Danboru
 */
public class ActivityMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Builder.MealBuilder mealBuilder = new Builder.MealBuilder();

        Meal.Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal.Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        System.out.println("====================================");
        
        System.out.println("\n\n");
        
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
        System.out.println("====================================");

    }

}
