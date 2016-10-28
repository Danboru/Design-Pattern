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
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal.Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

    }

}
