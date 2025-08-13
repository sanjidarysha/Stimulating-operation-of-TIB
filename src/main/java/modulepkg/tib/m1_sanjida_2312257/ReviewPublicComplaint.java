package modulepkg.tib.m1_sanjida_2312257;

import java.time.LocalDate;

public class ReviewPublicComplaint {private String name,details,region,status,keyword;
    LocalDate dateDP;

    public ReviewPublicComplaint(String name, String details, String region, String status, String keyword, LocalDate dateDP) {
        this.name = name;
        this.details = details;
        this.region = region;
        this.status = status;
        this.keyword = keyword;
        this.dateDP = dateDP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public LocalDate getDateDP() {
        return dateDP;
    }

    public void setDateDP(LocalDate dateDP) {
        this.dateDP = dateDP;
    }

    @Override
    public String toString() {
        return "ReviewPublicComplaint{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", region='" + region + '\'' +
                ", status='" + status + '\'' +
                ", keyword='" + keyword + '\'' +
                ", dateDP=" + dateDP +
                '}';
    }
}
