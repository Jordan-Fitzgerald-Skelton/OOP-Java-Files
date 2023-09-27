/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeapp;

/**
 *
 * @author Jordan
 */
public class FloorStaff extends Employee{
    private double hourlyRate, pay;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public FloorStaff(double hourlyRate, String name, String id, String dob) {
        super(name, id, dob);
        this.hourlyRate = hourlyRate;
    }

    public FloorStaff() {
        super();
        hourlyRate = 0;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+", Hourly Rate: "+hourlyRate;
    }
    
    @Override
    public void computePay(){
        pay = hourlyRate*40;
    }
    
    public double getPay(){
        return pay;
    }
}










