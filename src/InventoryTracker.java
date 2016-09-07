import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joe on 9/6/16.
 */
public class InventoryTracker{

    static ArrayList<InventoryItem> inventoryList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        InventoryItem item =new InventoryItem("",0);

        while (true) {
            item.printInventory();
            item.printOptions();
            String choice= scanner.nextLine();

            switch (choice){
                case"1":
                    item.addItem();
                    break;
                case"2":
                    item.deleteItem();
                    break;
                case"3":
                    item.updateQuant();
                    break;
                default:
                    break;
            }
        }
    }
}
