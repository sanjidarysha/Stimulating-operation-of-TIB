package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class SampleRequest {
    private String name;
    private String item;
    private String reason;
    private int quantity;
    private LocalDate requestDate;
    private String note;
    private String status;

    public SampleRequest(String name, String item, String reason, int quantity, LocalDate requestDate, String note, String status) {
        this.name = name;
        this.item = item;
        this.reason = reason;
        this.quantity = quantity;
        this.requestDate = requestDate;
        this.note = note;
        this.status = status;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDate getRequestDate() { return requestDate; }
    public void setRequestDate(LocalDate requestDate) { this.requestDate = requestDate; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "SampleRequest{" +
                "name='" + name + '\'' +
                ", item='" + item + '\'' +
                ", reason='" + reason + '\'' +
                ", quantity=" + quantity +
                ", requestDate=" + requestDate +
                ", note='" + note + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
