package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class BudgetRequest {

    private String requestID;
    private String department;
    private double requestedAmount;
    private String status;
    private LocalDate requestDate;
    private double approvedAmount;
    private String priorityLevel;

    public BudgetRequest(String requestID, String department, double requestedAmount, String status,
                         LocalDate requestDate, double approvedAmount, String priorityLevel) {
        this.requestID = requestID;
        this.department = department;
        this.requestedAmount = requestedAmount;
        this.status = status;
        this.requestDate = requestDate;
        this.approvedAmount = approvedAmount;
        this.priorityLevel = priorityLevel;
    }

    public String getRequestID() { return requestID; }
    public void setRequestID(String requestID) { this.requestID = requestID; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public double getRequestedAmount() { return requestedAmount; }
    public void setRequestedAmount(double requestedAmount) { this.requestedAmount = requestedAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getRequestDate() { return requestDate; }
    public void setRequestDate(LocalDate requestDate) { this.requestDate = requestDate; }
    public double getApprovedAmount() { return approvedAmount; }
    public void setApprovedAmount(double approvedAmount) { this.approvedAmount = approvedAmount; }
    public String getPriorityLevel() { return priorityLevel; }
    public void setPriorityLevel(String priorityLevel) { this.priorityLevel = priorityLevel; }

    @Override
    public String toString() {
        return "BudgetRequest{" +
                "requestID='" + requestID + '\'' +
                ", department='" + department + '\'' +
                ", requestedAmount=" + requestedAmount +
                ", status='" + status + '\'' +
                ", requestDate=" + requestDate +
                ", approvedAmount=" + approvedAmount +
                ", priorityLevel='" + priorityLevel + '\'' +
                '}';
    }
}
