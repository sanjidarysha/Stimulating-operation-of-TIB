package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class BankTransaction {
    private String transactionType;
    private double amount;
    private String accountNumber;
    private LocalDate transactionDate;
    private String bankSlip;

    public BankTransaction(String transactionType, double amount, String accountNumber, LocalDate transactionDate, String bankSlip) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.transactionDate = transactionDate;
        this.bankSlip = bankSlip;
    }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public LocalDate getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDate transactionDate) { this.transactionDate = transactionDate; }

    public String getBankSlip() { return bankSlip; }
    public void setBankSlip(String bankSlip) { this.bankSlip = bankSlip; }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", accountNumber='" + accountNumber + '\'' +
                ", transactionDate=" + transactionDate +
                ", bankSlip='" + bankSlip + '\'' +
                '}';
    }
}
