package modulepkg.tib.m1_sanjida_2312257;

public class CollaborateExternalModel {private String choosepartner,subject,message;

    public CollaborateExternalModel(String choosepartner, String subject, String message) {
        this.choosepartner = choosepartner;
        this.subject = subject;
        this.message = message;
    }

    public String getChoosepartner() {
        return choosepartner;
    }

    public void setChoosepartner(String choosepartner) {
        this.choosepartner = choosepartner;
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
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
