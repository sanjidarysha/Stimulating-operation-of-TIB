package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class AuditReport {
    private String reportName;
    private String message;
    private String reportType;
    private LocalDate sendDate;

    public AuditReport(String reportName, String message, String reportType, LocalDate sendDate) {
        this.reportName = reportName;
        this.message = message;
        this.reportType = reportType;
        this.sendDate = sendDate;
    }

    public String getReportName() { return reportName; }
    public void setReportName(String reportName) { this.reportName = reportName; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getReportType() { return reportType; }
    public void setReportType(String reportType) { this.reportType = reportType; }

    public LocalDate getSendDate() { return sendDate; }
    public void setSendDate(LocalDate sendDate) { this.sendDate = sendDate; }

    @Override
    public String toString() {
        return "AuditReport{" +
                "reportName='" + reportName + '\'' +
                ", message='" + message + '\'' +
                ", reportType='" + reportType + '\'' +
                ", sendDate=" + sendDate +
                '}';
    }
}
