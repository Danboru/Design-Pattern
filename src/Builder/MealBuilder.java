package Builder;

/**
 *
 * @author Danboru
 */
public class MealBuilder {

    public Meal.Meal prepareItem(String makanan, String minuman) {

        Meal.Meal meal = new Meal.Meal();
        //Desicion Makanan
        switch (makanan) {

            case "1": {

                meal.addItem(new Food.ChikenCrispy());
                break;
            }
            case "2": {

                meal.addItem(new Food.ChikenOriginal());
                break;
            }
            case "3": {

                meal.addItem(new Food.BurgerPlain());
                break;
            }
            case "4": {

                meal.addItem(new Food.BurgerRegular());
                break;

            }
            case "5": {

                meal.addItem(new Food.SoupJagung());
                break;
            }
            case "6": {

                meal.addItem(new Food.SoupWortel());
                break;
            }
            case "7": {

                meal.addItem(new Food.NasiMedium());
                break;
            }
            case "8": {

                meal.addItem(new Food.NasiLarge());
                break;
            }
        }

        //Desicion Minuman
        if (minuman.equalsIgnoreCase("1")) {

            meal.addItem(new Drink.CokeRegular());

        }
        if (minuman.equalsIgnoreCase("2")) {

            meal.addItem(new Drink.CokeDiet());

        }
        if (minuman.equalsIgnoreCase("3")) {

            meal.addItem(new Drink.Sprite());

        }
        if (minuman.equalsIgnoreCase("4")) {

            meal.addItem(new Drink.CoffeDenganGula());

        }
        if (minuman.equalsIgnoreCase("5")) {

            meal.addItem(new Drink.CoffeTanpaGula());

        }
        if (minuman.equalsIgnoreCase("6")) {

            meal.addItem(new Drink.TehDenganGula());

        }
        if (minuman.equalsIgnoreCase("7")) {

            meal.addItem(new Drink.TehTanpaGula());

        }

        //Return semua data ke dalam List<Item>
        return meal;
    }

}
