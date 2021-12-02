import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * Controller of Sushi Project.
 */
public class Main {
    public static void main(String[] args) {

        //load food catalog from the text file.
        HashMap<String, Food> inputCatalog = CatalogFileReader.readCatalog("menu.txt");
        //create FoodCatalog instance with the given hashmap
        FoodCatalog foodCatalog = new FoodCatalog(inputCatalog);
        System.out.println(foodCatalog);

        //load orders from the order file.
        ArrayList<OrderItem> orders = OrderFileReader.readOrder("order.txt");
        //create Order instance with the given list of orders.
        Order order = new Order(orders);
        order.printOrders();

        //Start making sushi
        System.out.println("\nへい、おまち！");

        //print food based on orders
        for (OrderItem orderItem : order.getOrders()){
            for (int j = 0; j < orderItem.getCount(); j++){
                System.out.print(foodCatalog.getItemByName(orderItem.getName()).getPrint() + "  ");
            }
            System.out.println();
        }

        System.out.println();

        //oaiso
        int totalBill = 0; //お会計
        int totalCalorie = 0; //総カロリー
        for (OrderItem orderItem : order.getOrders()){
            for (int j = 0; j < orderItem.getCount(); j++){
                Food food = foodCatalog.getItemByName(orderItem.getName());
                totalBill += food.getPrice();
                totalCalorie += food.getCalorie();
                System.out.println(food.name + ":\t"  + food.id.toString());
                // this is kubomi
            }
        }
        //print
        System.out.println("\nご利用ありがとうございました。");
        System.out.println("\uD83D\uDCB0 お会計: " + totalBill + " 円");
        System.out.println("\uD83D\uDCAA 総カロリー: " + totalCalorie + "kCal");
    }
}
