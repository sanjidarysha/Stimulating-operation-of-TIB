package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class RequestHistory {
    private int id;
    private String employeeName;
    private String itemName;
    private int quantity;
    private String status;
    private LocalDate requestDate;
    private LocalDate approvalDate;
    private String processedBy;
    private String department;
    private String remarks;

    public RequestHistory(int id, String employeeName, String itemName, int quantity, String status,
                          LocalDate requestDate, LocalDate approvalDate, String processedBy,
                          String department, String remarks) {
        this.id = id;
        this.employeeName = employeeName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.status = status;
        this.requestDate = requestDate;
        this.approvalDate = approvalDate;
        this.processedBy = processedBy;
        this.department = department;
        this.remarks = remarks;
    }

    public int getId() { return id; }
    public String getEmployeeName() { return employeeName; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public String getStatus() { return status; }
    public LocalDate getRequestDate() { return requestDate; }
    public LocalDate getApprovalDate() { return approvalDate; }
    public String getProcessedBy() { return processedBy; }
    public String getDepartment() { return department; }
    public String getRemarks() { return remarks; }
}
