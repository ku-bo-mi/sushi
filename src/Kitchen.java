import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Represents a kitchen to get orders and serve food.
 */
public class Kitchen {
    private FoodCatalog foodCatalog;

    public Kitchen(FoodCatalog foodCatalog){
        this.foodCatalog = foodCatalog;
    }

    public FoodCatalog getFoodCatalog() {
        return foodCatalog;
    }

    public ArrayList<Food> cook(Order orders){
        ArrayList<Food> foodList = new ArrayList<Food>();
        //TO DO
        for (OrderItem orderItem : orders.getOrders()){
            for (int j = 0; j < orderItem.getCount(); j++){
                Food food = foodCatalog.getItemByName(orderItem.getName()).copy();
                foodList.add(food);
            }
        }

        return foodList;
    }
}
