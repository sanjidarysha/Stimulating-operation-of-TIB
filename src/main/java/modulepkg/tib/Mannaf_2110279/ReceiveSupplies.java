package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class ReceiveSupplies {
    private String itemName;
    private int quantity;
    private String source;
    private String supplierContact;
    private double unitPrice;
    private LocalDate date;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReceiveSupplies{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", source='" + source + '\'' +
                ", supplierContact='" + supplierContact + '\'' +
                ", unitPrice=" + unitPrice +
                ", date=" + date +
                '}';
    }

    public ReceiveSupplies(String itemName, int quantity, String source, String supplierContact, double unitPrice, LocalDate date) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.source = source;
        this.supplierContact = supplierContact;
        this.unitPrice = unitPrice;
        this.date = date;
    }
}
