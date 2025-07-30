package modulepkg.tib.m1_sanjida_2312257;

import java.util.ArrayList;
import java.util.Arrays;

public class InvestigationReportModel {

    private final String investigationID;
    private String description;
    private ArrayList<String> peopleInvolved;
    private String location;


    public InvestigationReportModel(String investigationID, String description, String peopleInvolved, String location) {
        this.investigationID = investigationID;
        this.description = description;
        this.peopleInvolved = new ArrayList<>(Arrays.asList(peopleInvolved.split(",")));
        this.location = location;
    }


    public void fillOutForm(String description, String peopleCSV, String location) {
        this.description = description;
        this.peopleInvolved = new ArrayList<>(Arrays.asList(peopleCSV.split(",")));
        this.location = location;
    }

    // Submission validation
    public boolean submitReport() {
        if (investigationID == null || investigationID.isEmpty())
            return false;
        if (description == null || description.isEmpty())
            return false;
        if (peopleInvolved == null || peopleInvolved.isEmpty())
            return false;
        if (location == null || location.isEmpty()) {
            return false;
        }

        return true;
    }

    // Confirm the submission
    public boolean confirmSubmission() {
        System.out.println("Submitted Report: " + investigationID);
        return true;
    }

    // toString override
    @Override
    public String toString() {
        return "ID: " + investigationID + " | People: " + peopleInvolved + " | Location: " + location;
    }
}
