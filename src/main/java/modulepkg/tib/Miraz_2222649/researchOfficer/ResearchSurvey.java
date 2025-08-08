package modulepkg.tib.Miraz_2222649.researchOfficer;

import java.io.Serializable;
import java.util.List;

public class ResearchSurvey implements Serializable {
    private String title;
    private String sector;
    private String region;
    private String question1;
    private String question2;
    private List<String> choicesQ1;
    private List<String> choicesQ2;


    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getQuestion1() { return question1; }
    public void setQuestion1(String question1) { this.question1 = question1; }

    public String getQuestion2() { return question2; }
    public void setQuestion2(String question2) { this.question2 = question2; }

    public List<String> getChoicesQ1() { return choicesQ1; }
    public void setChoicesQ1(List<String> choicesQ1) { this.choicesQ1 = choicesQ1; }

    public List<String> getChoicesQ2() { return choicesQ2; }
    public void setChoicesQ2(List<String> choicesQ2) { this.choicesQ2 = choicesQ2; }
}
