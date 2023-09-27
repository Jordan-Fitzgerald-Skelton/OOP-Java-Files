/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyapp;

/**
 *
 * @author Jordan
 */
public class GroupSession extends StudySession{
    private String teammates, assessmentname;

    public GroupSession(String teammates, String assessmentname, String day, String modulename, int duration, double time) {
        super(day, modulename, duration, time);
        this.teammates = teammates;
        this.assessmentname = assessmentname;
    }

    public GroupSession() {
        super();
        teammates = "";
        assessmentname = "";
    }

    public String getTeammates() {
        return teammates;
    }

    public void setTeammates(String teammates) {
        this.teammates = teammates;
    }

    public String getAssessmentname() {
        return assessmentname;
    }

    public void setAssessmentname(String assessmentname) {
        this.assessmentname = assessmentname;
    }
    
    
    @Override
    public String getDeatils(){
        return super.getDeatils()+"\n TEAM MATES: " + teammates + "\n ASSESSMENT NAME" + assessmentname;
    }
    
}
