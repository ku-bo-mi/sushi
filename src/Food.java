import java.util.UUID;

public class Food {
    /**
     * name of food
     */
    protected String name;

    /**
     * calorie of food
     */
    protected int calorie;

    /**
     * price of food
     */
    protected int price;

    /**
     * print text of food
     */
    protected String print;
    protected UUID id;


    public Food(String name, int calorie, int price, String print){
        // author kubomi
        this.name = name;
        this.calorie = calorie;
        this.price = price;
        this.print = print;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getPrint() {
        return print;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                ", price=" + price +
                ", print='" + print + '\'' +
                '}';
    }
}
