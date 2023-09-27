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
    private double hourlyRate, pay, hours;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public FloorStaff(double hourlyRate, int hours, String name, String id, String dob) {
        super(name, id, dob);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public FloorStaff() {
        super();
        hourlyRate = 0;
        hours = 0;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+", Hours" + hours+ " Hourly Rate: "+hourlyRate ;
    }
    
    @Override
    public void computePay(){
        pay = hourlyRate*hours;
    }
    
    public double getPay(){
        return pay;
    }
}










