package modulepkg.tib.m1_sanjida_2312257;

public class AdInvestigationReport {private String reportid,officer,desc,status;

    public AdInvestigationReport(String reportid, String officer, String desc, String status) {
        this.reportid = reportid;
        this.officer = officer;
        this.desc = desc;
        this.status = status;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AdInvestigationReport{" +
                "reportid='" + reportid + '\'' +
                ", officer='" + officer + '\'' +
                ", desc='" + desc + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
