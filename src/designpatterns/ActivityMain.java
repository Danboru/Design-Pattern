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

import ListMenu.Makanan.ListMakanan;
import ListMenu.Minuman.ListMinuman;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Danboru
 */
public class ActivityMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Jika igin meng-edit data edit di Builder.MealBuilder
        
        String inputanMakanan = null;
        String inputanMinuman = null;
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        ListMenu.Makanan.ListMakanan makan = new ListMakanan();
        //List makanan
        makan.DaftarList();
        
        //try untuk mengangani error pemilihan minuman
        try{
            
            System.out.println("Masukkan pilihan = "); inputanMakanan = buffer.readLine();
        
        }catch(Exception e){
        
            e.printStackTrace();
            
        }
        
        ListMenu.Minuman.ListMinuman minum = new ListMinuman();
        //List Minuman
        minum.DaftarList();
        
        //try untuk mengangani error pemilihan makanan
        try{
            
            System.out.println("Masukkan pilihan = "); inputanMinuman = buffer.readLine();
        
        }catch(Exception e){
        
            e.printStackTrace();
            
        }
        
        //make Object
        Builder.MealBuilder mealBuilder = new Builder.MealBuilder();

        Meal.Meal itemnya = mealBuilder.prepareItem(inputanMakanan.toString() ,inputanMinuman.toString());
        
        //Sow all item from List<Items>
        itemnya.showItems();
        
        //Show total from Meal.getCost 
        System.out.println("Total Cost: " + itemnya.getCost());
        System.out.println("====================================");
        

    }

}
