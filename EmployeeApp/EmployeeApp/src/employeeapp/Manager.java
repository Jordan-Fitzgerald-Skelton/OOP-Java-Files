/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 *
 * @author jordan
 */
public class Manager extends Employee{
    private double salary, pay;

    public Manager(double salary, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
    }

    public Manager() {
        super();
        salary = 0;
    }  
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + ", Salary:" + salary ;
    }
    @Override
    public void computePay(){
        pay = salary / 52;
    }
    public double getPay(){
       return pay;
    }
}
