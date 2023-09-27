/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp;

/**
 *
 * @author Jordan
 */
public class HotelRooms extends Booking {
    private double price;
    private String roomNum;
    private int breakfastIn;
    private double bPrice;

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public int getBreakfastIn() {
        return breakfastIn;
    }

    public void setBreakfastIn(int breakfastIn) {
        this.breakfastIn = breakfastIn;
    }  
    
    public HotelRooms(String clientName, String bookingRef, String startDate, int duration, String roomNum, String breakfastIn) {
        super(clientName, bookingRef, startDate, duration);
    }
    
    public HotelRooms() {
        super();
    }    

    @Override
    public String getDetails(){
        return "Client Name:" + clientName+ ", Booking Reference:" + bookingRef + ", Start Date" + startDate+ ", Duration" + duration; 
    }
    @Override
    public void calculatePrice(){
            price = duration * 130;
    }

    public double getPrice() {
        return price;
    }
    public void calculateBPrice(){
        bPrice = (duration * 130) + (duration * 10);
    }
    
    public double getBPrice(){
        return bPrice;
    }
}
