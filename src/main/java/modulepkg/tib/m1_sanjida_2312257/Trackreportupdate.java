package modulepkg.tib.m1_sanjida_2312257;

public class Trackreportupdate {String reportid,description,status;

    public Trackreportupdate(String reportid, String description, String status) {
        this.reportid = reportid;
        this.description = description;
        this.status = status;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Trackreportupdate{" +
                "reportid='" + reportid + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
