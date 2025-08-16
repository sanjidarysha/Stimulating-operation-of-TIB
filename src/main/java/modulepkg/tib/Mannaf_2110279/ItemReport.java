package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class ItemReport {
    private String category;
    private int quantity;
    private LocalDate date;

    public ItemReport(String category, int quantity, LocalDate date) {
        this.category = category;
        this.quantity = quantity;
        this.date = date;
    }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    @Override
    public String toString() {
        return "ItemReport{" +
                "category='" + category + '\'' +
                ", quantity=" + quantity +
                ", date=" + date +
                '}';
    }
}
