import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a table
 */
public class Table {
    //table number
    private int tableNum;

    //number of customers to sit on this table
    private int numOfCustomers = 0;

    //list of food served for this table
    private ArrayList<Food> foodList = new ArrayList<Food>();

    public Table(int tableNum, int numOfCustomers){
        this.tableNum = tableNum;
        this.numOfCustomers = numOfCustomers;
    }

    public int getTableNum() {
        return tableNum;
    }

    public ArrayList<Food> getServedFood() {
        return foodList;
    }

    public void setServedFood(ArrayList<Food> servedFood) {
        this.foodList.addAll(servedFood);
    }

    public void printFood(){
        System.out.println("\nへい、おまち！");
        System.out.println("テーブル番号:\t" + this.tableNum + " 番");

        //print food from foodList
        for (Food food : foodList){
            System.out.print(food.getPrint() + "  ");
        }
        System.out.println();
    }

    public void printID(){
        System.out.println("\nUUID");
        System.out.println("テーブル番号:\t" + this.tableNum + " 番");

        //print food from foodList
        for (Food food : foodList){
            System.out.println(food.getId());
        }
        System.out.println();
    }

    public int getTotalBill(){
        int totalBill = 0;
        for (Food food : this.foodList){
            totalBill += food.getPrice();
        }
        return totalBill;
    }

    public int getTotalCalorie(){
        int totalCalorie = 0;
        for (Food food : this.foodList){
            totalCalorie += food.getCalorie();
        }
        return totalCalorie;
    }

    public int getTotalNumOfFood(){
        return this.foodList.size();
    }

    public String getDate(){
        Date nowDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        String formatDate = dateFormat.format(nowDate);
        return formatDate;
    }

    public void oaiso(){
        System.out.println("\nご利用ありがとうございました。");
        System.out.println("-------- 伝票 --------");
        System.out.println(this.getDate());
        System.out.println("テーブル番号:\t" + this.tableNum + " 番");
        System.out.println("人数:\t\t" + this.numOfCustomers + " 名");
        System.out.println("ご注文品数\t" + this.getTotalNumOfFood() + " 品");
        System.out.println("小計:\t\t" + this.getTotalBill() + " 円");
        System.out.println("消費税:\t\t" + (int)Math.round(getTotalBill()*0.1) + " 円");
        System.out.println("合計:\t\t" + (int)Math.round(getTotalBill()*1.1) + " 円");
        System.out.println("総カロリー:\t" + getTotalCalorie() + " kCal");
        System.out.println("----------------------");

    }
}
