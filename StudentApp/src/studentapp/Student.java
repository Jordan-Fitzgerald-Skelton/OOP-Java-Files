/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;

/**
 *
 * @author Jordan
 */
public class Student {
    private String name;
    private int age;
    private String dob;
    private String idnumber;
    private String programme;
    private double grade;
    
    
    public Student(){
        name = "";
        age = 0;
        dob = "";
        idnumber = "";
        programme = "";
    }

    public double getGrade() {
        return grade;
    }
    //local variables only live inside th method and can not be used else where
    public void computeGrade(int g1, int g2){
        grade = (g1+g2)/2;
    }
    //there has to be different perameters to allow for multiplt versions of the same compute method
    public void computeGrade(double g1, double g2){
        grade = (g1 + g2) / 2;
    }
    
    //example of an overloaded constructor 
    public Student(String name, int age, String dob, String idnumber, String programme){
        this.name= name;
        this.age=age;
        this.dob=dob;
        this.idnumber = idnumber;
        this.programme= programme;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    
    
    public String getDetails(){
        return "Student Details:"+name + ", "+ age + ", "+ dob + ", " + idnumber + ", " + programme;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public String getProgramme() {
        return programme;
    }
    
}