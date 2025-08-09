package modulepkg.tib.m1_sanjida_2312257;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AdMonitor {private String userid;
    LocalDateTime date;
    String activity;

    public AdMonitor(String userid, LocalDateTime date, String activity) {
        this.userid = userid;
        this.date = date;
        this.activity = activity;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date.atStartOfDay();
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "AdMonitor{" +
                "userid='" + userid + '\'' +
                ", date=" + date +
                ", activity='" + activity + '\'' +
                '}';
    }
}
