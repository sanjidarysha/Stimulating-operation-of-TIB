package modulepkg.tib.m1_sanjida_2312257;

public class AdCommunicateofficer {public String choose,toname,subject,message;

    public AdCommunicateofficer(String choose, String toname, String subject, String message) {
        this.choose = choose;
        this.toname = toname;
        this.subject = subject;
        this.message = message;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public String getToname() {
        return toname;
    }

    public void setToname(String toname) {
        this.toname = toname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AdCommunicateofficer{" +
                "choose='" + choose + '\'' +
                ", toname='" + toname + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
