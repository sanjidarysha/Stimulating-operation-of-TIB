package modulepkg.tib.m1_sanjida_2312257;

import java.io.Serializable;
import java.time.LocalDate;

public class AdReviewreport implements Serializable {private String id,title,department,status;
    LocalDate date;

    public AdReviewreport(String id, String title, String department, String status, LocalDate date) {
        this.id = id;
        this.title = title;
        this.department = department;
        this.status = status;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    @Override
    public String toString() {
        return "AdReviewreport{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
