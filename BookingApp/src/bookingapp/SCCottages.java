/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp;

/**
 *
 * @author Jordan
 */
public class SCCottages extends Booking{
    private double price;
    private String keyCollectionPoint;
    private String address;

    public String getKeyCollectionPoint() {
        return keyCollectionPoint;
    }

    public void setKeyCollectionPoint(String keyCollectionPoint) {
        this.keyCollectionPoint = keyCollectionPoint;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public SCCottages(String clientName, String bookingRef, String startDate, int duration, String keyCollectionPoint, String address) {
        super(clientName, bookingRef, startDate, duration);
    }
    
    public SCCottages() {
        super();
    }    

    @Override
    public String getDetails(){
        return "Client Name:" + clientName+ ", Booking Reference:" + bookingRef + ", Start Date" + startDate+ ", Duration" + duration + ", Address" + address + ", Key Collection Point" + keyCollectionPoint; 
    }
    @Override
    public void calculatePrice(){
        price = (duration * 60) + 50; 
    }

    public double getPrice() {
        return price;
    }
}
