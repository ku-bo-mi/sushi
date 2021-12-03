/**
 * Represents a sushi to be cooked.
 */
public class Sushi extends Food {


    public Sushi(String name, int calorie, int price, String print) {
        super(name, calorie, price, print);
    }

    @Override
    public String getPrint() {
        return "\uD83C\uDF63" + this.print;
    }
}