package modulepkg.tib.Miraz_2222649.researchOfficer;

import java.io.Serializable;

public class InputSurvey implements Serializable {
    private String title;
    private String sector;
    private String region;
    private String question1;
    private String question2;
    private String answer1;
    private String answer2;
    private String name;
    private int age;

    // Getters and Setters
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

    public String getAnswer1() { return answer1; }
    public void setAnswer1(String answer1) { this.answer1 = answer1; }

    public String getAnswer2() { return answer2; }
    public void setAnswer2(String answer2) { this.answer2 = answer2; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
