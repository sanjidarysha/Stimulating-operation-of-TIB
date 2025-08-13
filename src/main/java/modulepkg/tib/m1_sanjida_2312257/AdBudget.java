package modulepkg.tib.m1_sanjida_2312257;

import java.time.LocalDate;

public class AdBudget {private String id,amount,purpose;
    LocalDate date;
    String status;

    public AdBudget(String id, String amount, String purpose, LocalDate date, String status) {
        this.id = id;
        this.amount = amount;
        this.purpose = purpose;
        this.date = date;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AdBudget{" +
                "id='" + id + '\'' +
                ", amount='" + amount + '\'' +
                ", purpose='" + purpose + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
