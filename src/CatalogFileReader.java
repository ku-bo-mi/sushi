import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Manage the loading of menu.
 */
public class CatalogFileReader {

    /**
     * Reads given file and return the menu
     * @param fileName to read
     * @return menu
     */
    public static HashMap<String, Food> readCatalog(String fileName){
        HashMap<String, Food> foodCatalog = new HashMap<String, Food>();


        File file = new File(fileName);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            String name;
            int calorie;
            int price;
            String print;
            String type;

            while((line = bufferedReader.readLine()) != null){
                line = line.trim();
                //System.out.println(line);
                String[] words = line.split(",");

                if (words.length != 5){
                    System.out.println("line skipped: " + line);
                    continue;
                }

                try{
                    name = words[0].trim();
                    calorie = Integer.parseInt(words[1].trim());
                    price = Integer.parseInt(words[2].trim());
                    print = words[3].trim();
                    type = words[4].trim();

                    if(type.equals("sushi")){
                        //System.out.println("sushi" + type + line);
                        Food sushi = new Sushi(name, calorie, price, print);
                        foodCatalog.put(name, sushi);
                    }else if(Objects.equals(type, "drink")){
                        //System.out.println("drink" + line);
                        Food drink = new Drink(name, calorie, price, print);
                        foodCatalog.put(name, drink);
                    }

                } catch (NumberFormatException e){
                    System.out.println("invalid line: " + line);
                    continue;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            //e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        //System.out.println(orders);
        return foodCatalog;
    }
}
