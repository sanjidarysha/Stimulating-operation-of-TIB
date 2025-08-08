package modulepkg.tib.Miraz_2222649.policyAnalyst;

import java.io.Serializable;

public class ReviewReport implements Serializable {
    private String surveyTitle;
    private String comment;

    public ReviewReport(String surveyTitle, String comment) {
        this.surveyTitle = surveyTitle;
        this.comment = comment;
    }

    public String getSurveyTitle() {
        return surveyTitle;
    }

    public void setSurveyTitle(String surveyTitle) {
        this.surveyTitle = surveyTitle;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
