package modulepkg.tib.m1_sanjida_2312257;

public class AdAssignCases {private String caseid,title,officer,status;

    public AdAssignCases(String caseid, String title, String officer, String status) {
        this.caseid = caseid;
        this.title = title;
        this.officer = officer;
        this.status = status;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
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

    @Override
    public String toString() {
        return "AdAssignCases{" +
                "caseid='" + caseid + '\'' +
                ", title='" + title + '\'' +
                ", officer='" + officer + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
