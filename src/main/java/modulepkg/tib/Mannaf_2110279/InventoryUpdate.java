package modulepkg.tib.Mannaf_2110279;

public class InventoryUpdate {
    private String itemName;
    private int quantityGiven;
    private String updateReason;

    public InventoryUpdate(String itemName, int quantityGiven, String updateReason) {
        this.itemName = itemName;
        this.quantityGiven = quantityGiven;
        this.updateReason = updateReason;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public int getQuantityGiven() { return quantityGiven; }
    public void setQuantityGiven(int quantityGiven) { this.quantityGiven = quantityGiven; }

    public String getUpdateReason() { return updateReason; }
    public void setUpdateReason(String updateReason) { this.updateReason = updateReason; }

    @Override
    public String toString() {
        return "InventoryUpdate{" +
                "itemName='" + itemName + '\'' +
                ", quantityGiven=" + quantityGiven +
                ", updateReason='" + updateReason + '\'' +
                '}';
    }
}
