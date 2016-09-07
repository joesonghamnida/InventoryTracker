/**
 * Created by joe on 9/6/16.
 */
public class InventoryItem {
    private String itemName;
    private int itemQuant;

    //constructor
    public InventoryItem(String item, int quantity){
        this.itemName=item;
        this.itemQuant=quantity;
    }

    //methods
    public void printInventory(){
        int i=1;
        for(InventoryItem item:InventoryTracker.inventoryList){
            System.out.println(i+". "+item.itemName+" "+item.itemQuant);
            i++;
        }
    }

    public static void printOptions(){
        System.out.println("-----");
        System.out.println("1. Create new item");
        System.out.println("2. Enter item number to remove item");
        System.out.println("3. Update item quantity");
    }

    public void addItem(){
        System.out.println("Please enter the item name:");
        String itemName = InventoryTracker.scanner.nextLine();
        System.out.println("Please enter the item quantity");
        int itemQuantity = Integer.valueOf(InventoryTracker.scanner.nextLine());

        InventoryItem item = new InventoryItem(itemName,itemQuantity);
        InventoryTracker.inventoryList.add(item);
    }

    public void deleteItem(){
        System.out.println("Please enter the item index number you wish to delete");
        int removeChoiceInt = Integer.parseInt(InventoryTracker.scanner.nextLine());

        InventoryTracker.inventoryList.remove(removeChoiceInt-1);

    }
    public void updateQuant(){
        System.out.println("Please enter the item index you wish to update:");
        int updateIndex = Integer.parseInt(InventoryTracker.scanner.nextLine());
        System.out.println("Please enter the updated quantity");
        int updateQuantity=Integer.parseInt(InventoryTracker.scanner.nextLine());

        InventoryItem item=InventoryTracker.inventoryList.get(updateIndex-1);
        item.itemQuant=updateQuantity;
    }
}
