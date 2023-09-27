/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdatatextapp;

import java.io.Serializable;

/**
 *
 * @author Jordan
 */
public class Student implements Serializable{
    private String name, id, dob;
    
    public Student(){
        name = " ";
        id = " ";
        dob = " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String getDetails(){
        return "Name: "+name+"\n ID: "+id+"\n DOB: "+dob;
    }
    
    
}
