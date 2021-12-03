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

        //Create Kitchen instance with the given FoodCatalog
        Kitchen sushiKitchen = new Kitchen(foodCatalog);

        //Create Table instance
        Table table1 = new Table(1, 2);

        //load orders from the order file.
        ArrayList<OrderItem> orderItems = OrderFileReader.readOrder("order.txt");

        //create Order instance with the given list of orders.
        Order order = new Order(orderItems);

        table1.setServedFood(sushiKitchen.cook(order));
        table1.printFood();
        table1.printID();
        table1.oaiso();

        Table table2 = new Table(2, 3);
        table2.setServedFood(sushiKitchen.cook(order));
        table2.setServedFood(sushiKitchen.cook(order));
        table2.printFood();
        table2.printID();
        table2.oaiso();


    }
}
