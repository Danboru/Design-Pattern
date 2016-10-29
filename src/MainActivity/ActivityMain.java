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
package MainActivity;

import ListMenu.Makanan.ListMakanan;
import ListMenu.Minuman.ListMinuman;
import Meal.Meal;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Danboru
 */
public class ActivityMain {

    public static void main(String[] args) {

        //Jika igin meng-edit data edit di Builder.MealBuilder
        String inputanMakanan = null;
        String inputanMinuman = null;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        ListMenu.Makanan.ListMakanan makan = new ListMakanan();
        //List makanan
        makan.DaftarList();

        //try untuk mengangani error pemilihan minuman
        try {

            System.out.print("Masukkan pilihan = ");
            inputanMakanan = buffer.readLine();

        } catch (Exception e) {
            
            System.err.println("Log : Kesalahan dalam penulisan data");
            e.printStackTrace();

        }

        System.out.println("\n");

        ListMenu.Minuman.ListMinuman minum = new ListMinuman();
        //List Minuman
        minum.DaftarList();

        //try untuk mengangani error pemilihan makanan
        try {

            System.out.print("Masukkan pilihan = ");
            inputanMinuman = buffer.readLine();

        } catch (Exception e) {

            e.printStackTrace();

        }

        //Make Object
        Builder.MealBuilder mealBuilder = new Builder.MealBuilder();

        Meal itemnya = mealBuilder.prepareItem(inputanMakanan.toString(), inputanMinuman.toString());

        System.out.println("\n");
        
        //Sow all item from List<Items>
        itemnya.showItems();

        //Show total from Meal.getCost 
        System.out.println("Total Cost: " + itemnya.getCost());
        System.out.println("====================================");

    }
}