package modulepkg.tib.Miraz_2222649.policyAnalyst;

import java.io.Serializable;

public class ResearchTopic implements Serializable {
    private String topicNumber;
    private String topicTitle;
    private String details;

    public ResearchTopic(String topicNumber, String topicTitle, String details) {
        this.topicNumber = topicNumber;
        this.topicTitle = topicTitle;
        this.details = details;
    }

    public String getTopicNumber() {
        return topicNumber;
    }

    public String getTopicTitle() {
        return topicTitle;
    }

    public String getDetails() {
        return details;
    }

    public void setTopicNumber(String topicNumber) {
        this.topicNumber = topicNumber;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
