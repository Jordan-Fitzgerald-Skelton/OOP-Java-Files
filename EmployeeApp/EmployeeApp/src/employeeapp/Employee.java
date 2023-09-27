/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 *
 * @author jordan
 */
public abstract class Employee {
    protected String name, id, dob;

    public Employee(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public Employee(){
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
        return "Employee Deatils- ID:"+id+", Name:" + name+ ", DOB:" + dob;
    }
    
    public abstract void computePay();
}
