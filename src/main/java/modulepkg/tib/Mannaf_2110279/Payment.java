package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class Payment {
    private String paymentID;
    private String vendor;
    private double amount;
    private LocalDate dueDate;
    private String status;
    private boolean reminderSet;
    private String paymentType;

    public Payment(String paymentID, String vendor, double amount, LocalDate dueDate, String status, boolean reminderSet, String paymentType) {
        this.paymentID = paymentID;
        this.vendor = vendor;
        this.amount = amount;
        this.dueDate = dueDate;
        this.status = status;
        this.reminderSet = reminderSet;
        this.paymentType = paymentType;
    }

    public String getPaymentID() { return paymentID; }
    public void setPaymentID(String paymentID) { this.paymentID = paymentID; }

    public String getVendor() { return vendor; }
    public void setVendor(String vendor) { this.vendor = vendor; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean isReminderSet() { return reminderSet; }
    public void setReminderSet(boolean reminderSet) { this.reminderSet = reminderSet; }

    public String getPaymentType() { return paymentType; }
    public void setPaymentType(String paymentType) { this.paymentType = paymentType; }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", vendor='" + vendor + '\'' +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                ", reminderSet=" + reminderSet +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
