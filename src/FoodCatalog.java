import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


/**
 * Sushi project controller
 */
public class FoodCatalog {

    /**
     * Internal map for storing Sushis.
     */
    private HashMap<String, Food> catalog;

    public FoodCatalog(HashMap<String, Food> inputCatalog){
        this.catalog = inputCatalog;
    }

    public Food getItemByName(String name){
        if(!this.catalog.containsKey(name)) {
            System.out.println(name + " is not on our catalog.");
            return null;
        }
        return this.catalog.get(name);
    }

    public void printMenu(){
        System.out.println("------ メニュー ------");
        for(String key :catalog.keySet()){
            System.out.println(key + "\t" + catalog.get(key).getPrice() + "円");
        }
        System.out.println("----------------------");
    }


}
