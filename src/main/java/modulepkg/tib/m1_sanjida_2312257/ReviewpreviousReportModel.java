package modulepkg.tib.m1_sanjida_2312257;

import java.time.LocalDate;

public class ReviewpreviousReportModel {private String reportId, title,officer, status;
    LocalDate date;
    String fullDescription;

    public ReviewpreviousReportModel(String reportId, String title, String officer, String status, LocalDate date, String fullDescription) {
        this.reportId = reportId;
        this.title = title;
        this.officer = officer;
        this.status = status;
        this.date = date;
        this.fullDescription = fullDescription;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    @Override
    public String toString() {
        return "ReviewpreviousReportModel{" +
                "reportId='" + reportId + '\'' +
                ", title='" + title + '\'' +
                ", officer='" + officer + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                ", fullDescription='" + fullDescription + '\'' +
                '}';
    }
}
