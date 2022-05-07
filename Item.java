
package vendingmachine;

public class Item
{
    private String name;
    private double price;
    private int qty;
    
    public Item(String itemName, 
       double itemPrice, int itemQty) {
        name = itemName;
        price = itemPrice;
        qty = itemQty;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQty() {
        return qty;
    }
    
    public void reduceQty() {
        if (qty > 0)
            qty -= 1;
    }
}