package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class FundTransfer {
    private String senderDepartment;
    private String receiverDepartment;
    private double amount;
    private String note;
    private LocalDate transferDate;
    private String referenceID;

    public FundTransfer(String senderDepartment, String receiverDepartment, double amount, String note, LocalDate transferDate, String referenceID) {
        this.senderDepartment = senderDepartment;
        this.receiverDepartment = receiverDepartment;
        this.amount = amount;
        this.note = note;
        this.transferDate = transferDate;
        this.referenceID = referenceID;
    }

    public String getSenderDepartment() { return senderDepartment; }
    public void setSenderDepartment(String senderDepartment) { this.senderDepartment = senderDepartment; }

    public String getReceiverDepartment() { return receiverDepartment; }
    public void setReceiverDepartment(String receiverDepartment) { this.receiverDepartment = receiverDepartment; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }

    public LocalDate getTransferDate() { return transferDate; }
    public void setTransferDate(LocalDate transferDate) { this.transferDate = transferDate; }

    public String getReferenceID() { return referenceID; }
    public void setReferenceID(String referenceID) { this.referenceID = referenceID; }

    @Override
    public String toString() {
        return "FundTransfer{" +
                "senderDepartment='" + senderDepartment + '\'' +
                ", receiverDepartment='" + receiverDepartment + '\'' +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", transferDate=" + transferDate +
                ", referenceID='" + referenceID + '\'' +
                '}';
    }
}
