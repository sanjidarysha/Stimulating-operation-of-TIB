package modulepkg.tib.m1_sanjida_2312257;

import java.util.ArrayList;
import java.util.Arrays;

public class InvestigationReportModel {String username,id,location,involved,description;

    public InvestigationReportModel(String username, String id, String location, String involved, String description) {
        this.username = username;
        this.id = id;
        this.location = location;
        this.involved = involved;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInvolved() {
        return involved;
    }

    public void setInvolved(String involved) {
        this.involved = involved;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "InvestigationReportModel{" +
                "username='" + username + '\'' +
                ", id='" + id + '\'' +
                ", location='" + location + '\'' +
                ", involved='" + involved + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
