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
        //this.catalog = inputCatalog;
        this.catalog = new HashMap<String, Food>();
        this.catalog = inputCatalog;
        /*
        System.out.println("foodcatalog" + catalog);
        for (String key: inputCatalog.keySet()){
            this.catalog.put(key, inputCatalog.get(key));
            System.out.println(this.catalog.get(key));
        }
        System.out.println(this.catalog.get("maguro"));

         */
    }

    public HashMap<String, Food> getSushiMap(){
        return this.catalog;
    }

    public void printItemByName(String name){
        if(!this.catalog.containsKey(name)){
            System.out.println(name + " is not on our catalog.");
        } else {
            System.out.println(this.catalog.get(name).getPrint());
        }

    }

    public Food getItemByName(String name){
        if(!this.catalog.containsKey(name)) {
            System.out.println(name + " is not on our catalog.");
            return null;
        }
        return this.catalog.get(name);
    }

    @Override
    public String toString() {
        return "カタログ" + catalog;
    }

    /*public void makeSushiFromOrders(ArrayList<ArrayList<String>> orders){

        System.out.println("\nへい、おまち！\n");

        for (int i = 0; i < orders.size(); i++){
            String orderContent = orders.get(i).get(0);
            int orderCount = Integer.parseInt(orders.get(i).get(1));

            for (int j = 0; j < orderCount; j++){
                System.out.println(this.sushiMap.get(orderContent).toString());
            }



        }



    }*/


}
