package modulepkg.tib.m1_sanjida_2312257;

public class TrackReportModel {String id,description,status;

    public TrackReportModel(String id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
