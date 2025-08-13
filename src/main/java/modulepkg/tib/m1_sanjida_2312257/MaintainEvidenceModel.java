package modulepkg.tib.m1_sanjida_2312257;

public class MaintainEvidenceModel {
    private String item, evidenceid, officername, officerid, status;

    public MaintainEvidenceModel(String item, String evidenceid, String officername, String officerid, String status) {
        this.item = item;
        this.evidenceid = evidenceid;
        this.officername = officername;
        this.officerid = officerid;
        this.status = status;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getEvidenceid() {
        return evidenceid;
    }

    public void setEvidenceid(String evidenceid) {
        this.evidenceid = evidenceid;
    }

    public String getOfficername() {
        return officername;
    }

    public void setOfficername(String officername) {
        this.officername = officername;
    }

    public String getOfficerid() {
        return officerid;
    }

    public void setOfficerid(String officerid) {
        this.officerid = officerid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MaintainEvidenceModel{" +
                "item='" + item + '\'' +
                ", evidenceid='" + evidenceid + '\'' +
                ", officername='" + officername + '\'' +
                ", officerid='" + officerid + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
