package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class Expense {
    private String expenseType;
    private double amount;
    private String reason;
    private String paymentMethod;
    private LocalDate date;

    public Expense(String expenseType, double amount, String reason, String paymentMethod, LocalDate date) {
        this.expenseType = expenseType;
        this.amount = amount;
        this.reason = reason;
        this.paymentMethod = paymentMethod;
        this.date = date;
    }

    public String getExpenseType() { return expenseType; }
    public void setExpenseType(String expenseType) { this.expenseType = expenseType; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseType='" + expenseType + '\'' +
                ", amount=" + amount +
                ", reason='" + reason + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", date=" + date +
                '}';
    }
}
