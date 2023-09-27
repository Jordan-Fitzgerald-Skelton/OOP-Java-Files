/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyapp;

/**
 *
 * @author Jordan
 */
public class PersonalSession extends StudySession{
    private String studytopic;

    public PersonalSession(String studytopic,String day, String modulename, int duration, double time) {
        super(day, modulename, duration, time);
        this.studytopic = studytopic;
    }
    
    public PersonalSession(){
        super();
        studytopic = "";
    }

    public String getStudytopic() {
        return studytopic;
    }

    public void setStudytopic(String studytopic) {
        this.studytopic = studytopic;
    }
    
    @Override
    public String getDeatils(){
        return super.getDeatils()+"\n STUDY TOPIC: " + studytopic;
    }
    
}
