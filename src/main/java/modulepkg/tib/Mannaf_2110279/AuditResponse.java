package modulepkg.tib.Mannaf_2110279;

import java.time.LocalDate;

public class AuditResponse {
    private String question;
    private String answer;
    private LocalDate responseDate;
    private String answeredBy;

    public AuditResponse(String question, String answer, LocalDate responseDate, String answeredBy) {
        this.question = question;
        this.answer = answer;
        this.responseDate = responseDate;
        this.answeredBy = answeredBy;
    }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }

    public LocalDate getResponseDate() { return responseDate; }
    public void setResponseDate(LocalDate responseDate) { this.responseDate = responseDate; }

    public String getAnsweredBy() { return answeredBy; }
    public void setAnsweredBy(String answeredBy) { this.answeredBy = answeredBy; }

    @Override
    public String toString() {
        return "AuditResponse{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", responseDate=" + responseDate +
                ", answeredBy='" + answeredBy + '\'' +
                '}';
    }
}
