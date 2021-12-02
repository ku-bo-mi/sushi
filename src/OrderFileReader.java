import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Manage the loading of order files.
 */

public class OrderFileReader {

    public class OrderEntity {
        private int count;
        private String name;
    }


    /**
     * Read the given file and returns a map of orders
     * @param fileName to read
     * @return map of orders
     */
    public static ArrayList<OrderItem> readOrder(String fileName){

        ArrayList<OrderItem> orders = new ArrayList<OrderItem>();

        File file = new File(fileName);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            String orderContent;
            int orderNumber;

            while((line = bufferedReader.readLine()) != null){
                line = line.trim();
                String[] words = line.split(",");

                if (words.length != 2){
                    continue;
                }

                try{
                    orderNumber = Integer.parseInt(words[1].trim());
                    orderContent = words[0].trim();

                    OrderItem order = new OrderItem(orderContent, orderNumber);

                    orders.add(order);
                } catch (NumberFormatException e){
                    continue;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            //e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        //System.out.println("\nご注文:");
        //System.out.println(orders);
        return orders;
    }
}
