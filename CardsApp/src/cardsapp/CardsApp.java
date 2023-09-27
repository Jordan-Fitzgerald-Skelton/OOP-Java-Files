/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardsapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class CardsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"enter 1 for a Christmas card, 2 for a Birthday card, or 3 for a Wedding card"));
        
        if(choice==1){
            Cards myCards;
            myCards = new Christmas();
            String to = JOptionPane.showInputDialog(null,"Please enter the senders name");
            String from = JOptionPane.showInputDialog(null,"Please enter the recievers name ");
            myCards.play(to, from);
        }
        else if(choice==2){
            Cards myCards;
            myCards = new Birthday();
            String to = JOptionPane.showInputDialog(null,"Please enter the senders name");
            String from = JOptionPane.showInputDialog(null,"Please enter the recievers name ");
            myCards.play(to, from);
        }else if(choice == 3){
            Cards myCards;
            myCards = new Wedding();
            String to = JOptionPane.showInputDialog(null,"Please enter the senders name");
            String from = JOptionPane.showInputDialog(null,"Please enter the recievers name ");
            myCards.play(to, from);
        }else{
            JOptionPane.showMessageDialog(null,"Sorry, that is not a valid entry");
        }
    }
}