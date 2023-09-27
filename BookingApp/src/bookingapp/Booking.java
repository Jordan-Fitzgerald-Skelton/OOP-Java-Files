/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp;

/**
 *
 * @author Jordan
 */
public abstract class Booking {

    protected String clientName;
    protected String bookingRef;
    protected String startDate;
    protected int duration;

    public Booking(String clientName, String bookingRef, String startDate, int duration) {
        this.clientName = clientName;
        this.bookingRef = bookingRef;
        this.startDate = startDate;
        this.duration = duration;
    }

    public Booking() {
        clientName = "";
        bookingRef = "";
        startDate = "";
        duration = 0;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(String bookingRef) {
        this.bookingRef = bookingRef;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public abstract void calculatePrice();
    
    public abstract String getDetails();

}
