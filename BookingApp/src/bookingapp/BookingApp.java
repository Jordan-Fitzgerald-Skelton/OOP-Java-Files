/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookingapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class BookingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clientName;
        String bookingRef;
        String startDate;
        int duration;
        String roomNum;
        String breakfastIn;
        String keyCollectionPoint;
        String address;
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to add a Hotel room booking or 2 to add a Self Catering Cottage booking"));
        if (num == 1) {
            clientName = JOptionPane.showInputDialog(null, "Please enter clients name");
            bookingRef = JOptionPane.showInputDialog(null, "Please enter booking refrence name");
            startDate = JOptionPane.showInputDialog(null, "Please enter the start date");
            duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            roomNum = JOptionPane.showInputDialog(null, "Please enter the room number");
            breakfastIn = JOptionPane.showInputDialog(null, "Is breakfast included, yes or no");
            HotelRooms h = new HotelRooms(clientName, bookingRef, startDate, duration, roomNum, breakfastIn);
            
            if(breakfastIn.equalsIgnoreCase("No")){
                h.calculatePrice();
                JOptionPane.showMessageDialog(null, h.getDetails() + ". The total Price will be " + h.getPrice() + " euro");
            }else if(breakfastIn.equalsIgnoreCase("Yes")){
                h.calculateBPrice();
                JOptionPane.showMessageDialog(null, h.getDetails() + ". The total Price will be " + h.getBPrice() + " euro");
            }

        }else if (num == 2) {
            clientName = JOptionPane.showInputDialog(null, "Please enter clients name");
            bookingRef = JOptionPane.showInputDialog(null, "Please enter booking refrence name");
            startDate = JOptionPane.showInputDialog(null, "Please enter the start date");
            duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            keyCollectionPoint = JOptionPane.showInputDialog(null, "Please enter the Key Collection Point");
            address = JOptionPane.showInputDialog(null, "Please enter the address");
            SCCottages c = new SCCottages(clientName, bookingRef, startDate, duration, address, keyCollectionPoint);
            c.calculatePrice();
            JOptionPane.showMessageDialog(null, c.getDetails() + ". The total Price will be " + c.getPrice() + " euro");
        }
   }
}
