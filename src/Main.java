import java.util.*;

/**
 * Controller of Sushi Project.
 */
public class Main {

    public static String askOption(String message, String[] options){
        String inputOption = null;

        System.out.println(message);
        for(int i = 0; i < options.length; i++){
            System.out.println(i + " : " + options[i]);
        }
        //int = readInt
        Scanner scanner = new Scanner(System.in);
        int inputInt = askInt(message);
        inputOption = options[inputInt];

        return inputOption;
    }

    public static int askInt(String message){
        int inputInt = -1;
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            try {
                inputInt = Integer.parseInt(input);
                System.out.println("input: " + inputInt);
                break;
            } catch (NumberFormatException e){
                System.out.print("数値を入力してください > ");
            }
        }

        //scanner.close();
        return inputInt;
    }

    public static void main(String[] args) {

        //load food catalog from the text file.
        HashMap<String, Food> inputCatalog = CatalogFileReader.readCatalog("menu.txt");

        //create FoodCatalog instance with the given hashmap
        FoodCatalog foodCatalog = new FoodCatalog(inputCatalog);

        //print menu from FoodCatalog
        foodCatalog.printMenu();

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
        //table1.printID();
        table1.oaiso();

        Table table2 = new Table(2, 3);
        table2.setServedFood(sushiKitchen.cook(order));
        table2.setServedFood(sushiKitchen.cook(order));
        table2.printFood();
        //table2.printID();
        table2.oaiso();

        /*
        foodCatalog.printMenu();
        //Scanner scanner = new Scanner(System.in);

        int tableNum = askInt("いらっしゃいませ。テーブル番号を入力してください > ");
        int numOfCustomers = askInt("お客様の人数を入力してください > ");

        Table table = new Table(tableNum, numOfCustomers);

        String[] menu = foodCatalog.getKeys();
        String orderItem = askOption("ご注文の商品を入力してください > " ,menu);
        int orderCount = askInt("個数を入力してください > ");

        OrderItem orderItem1 = new OrderItem(orderItem, orderCount);
        ArrayList<OrderItem> orderList = new ArrayList<OrderItem>();
        orderList.add(orderItem1);
        Order order1 = new Order(orderList);

        sushiKitchen.cook(order1);
        */
        
        /*

        String message = "ご注文の商品を入力してください > ";
        System.out.println(message);
        for(int i = 0; i < options.length; i++){
            System.out.println(i + " : " + options[i]);
        }
        //int = readInt

         */

        /*
        System.out.print("ご注文の商品を入力してください > ");
        input = scanner.nextLine();
        if (foodCatalog.getItemByName(input) == null){
            System.out.println("商品が見つかりませんでした。");
        }

        try {
            System.out.print("個数を入力してください > ");
            int orderCount = scanner.nextInt();
            System.out.println("個数: " + orderCount);
        } catch (InputMismatchException e){
            System.out.println("数値を入力してください。");
        }

        System.out.println(orderItem + orderCount + "のご注文を承りました。");


         */



    }
}
