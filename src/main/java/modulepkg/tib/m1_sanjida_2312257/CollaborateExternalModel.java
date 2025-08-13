package modulepkg.tib.m1_sanjida_2312257;

public class CollaborateExternalModel {private String choosepartner,to,subject,message;

    public CollaborateExternalModel(String choosepartner, String to, String subject, String message) {
        this.choosepartner = choosepartner;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public String getChoosepartner() {
        return choosepartner;
    }

    public void setChoosepartner(String choosepartner) {
        this.choosepartner = choosepartner;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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
        return "CollaborateExternalModel{" +
                "choosepartner='" + choosepartner + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}



