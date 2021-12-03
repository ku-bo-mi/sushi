import java.util.ArrayList;

/**
 * Represents order
 */
public class Order {
    private ArrayList<OrderItem> orders;



    public Order(ArrayList<OrderItem> orders){
        this.orders = orders;
    }


    public ArrayList<OrderItem> getOrders() {
        return orders;
    }

    public void printOrders(){
        System.out.println("\nご注文内容");
        for (OrderItem order : this.orders){
            System.out.println(order);
        }
    }
}


