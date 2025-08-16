package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class StaffRequest {
    private String employeeName;
    private String item;
    private int quantity;
    private LocalDate date;
    private String comments;
    private String status;

    public StaffRequest(String employeeName, String item, int quantity, LocalDate date, String comments, String status) {
        this.employeeName = employeeName;
        this.item = item;
        this.quantity = quantity;
        this.date = date;
        this.comments = comments;
        this.status = status;
    }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "StaffRequest{" +
                "employeeName='" + employeeName + '\'' +
                ", item='" + item + '\'' +
                ", quantity=" + quantity +
                ", date=" + date +
                ", comments='" + comments + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
//final commit//