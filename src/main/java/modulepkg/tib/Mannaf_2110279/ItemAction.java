package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class ItemAction {
    private String itemName;
    private String action; // "Remove" or "Replace"
    private String reason;
    private LocalDate date;

    public ItemAction(String itemName, String action, String reason, LocalDate date) {
        this.itemName = itemName;
        this.action = action;
        this.reason = reason;
        this.date = date;
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    @Override
    public String toString() {
        return "ItemAction{" +
                "itemName='" + itemName + '\'' +
                ", action='" + action + '\'' +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                '}';
    }
}
