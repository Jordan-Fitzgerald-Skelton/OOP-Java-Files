/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyapp;

import java.io.Serializable;

/**
 *
 * @author Jordan
 */
public class StudySession implements Serializable{
    protected String day, modulename;
    protected int duration;
    protected double time;

    public StudySession(String day, String modulename, int duration, double time) {
        this.day = day;
        this.modulename = modulename;
        this.duration = duration;
        this.time = time;
    }
    
    public StudySession(){
    day = "";
    modulename = "";
    duration = 0;
    time = 0.00;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    
    public String getDeatils(){
        return "DAY: " + day + "\n TIME: " + time + "\n DURATION: " + duration + "\n MODULE NAME: " + modulename;
    }
}
