/**
 * Represents order items.
 */
public class OrderItem {
    private String name;
    private int count;
    //private int timeStamp;

    public OrderItem(String name, int count){
        this.name = name;
        this.count = count;
    }


    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + " x " + count;
    }
}
