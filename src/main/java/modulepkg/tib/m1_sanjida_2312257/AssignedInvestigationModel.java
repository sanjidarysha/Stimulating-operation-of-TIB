package modulepkg.tib.m1_sanjida_2312257;

import java.time.LocalDate;

public class AssignedInvestigationModel {
    private String caseid, location, time, description;
    LocalDate dateDP;

    public AssignedInvestigationModel(String caseid, String location, String time, String description, LocalDate dateDP) {
        this.caseid = caseid;
        this.location = location;
        this.time = time;
        this.description = description;
        this.dateDP = dateDP;
    }

    public String getCaseid() {
        return caseid;
    }

    public void setCaseid(String caseid) {
        this.caseid = caseid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateDP() {
        return dateDP;
    }

    public void setDateDP(LocalDate dateDP) {
        this.dateDP = dateDP;
    }

    @Override
    public String toString() {
        return "AssignedInvestigationModel{" +
                "caseid='" + caseid + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", dateDP=" + dateDP +
                '}';
    }
}
