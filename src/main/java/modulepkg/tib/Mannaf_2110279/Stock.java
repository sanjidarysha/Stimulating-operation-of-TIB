package modulepkg.tib.Mannaf_2110279;

public class Stock {
    private String itemName;
    private String category;
    private int quantity;

    public Stock(String itemName, String category, int quantity) {
        this.itemName = itemName;
        this.category = category;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Stock{" +
                "itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
