/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class GuessApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //links the instantiable class to the main code
        String again;
        Guess myGuess;
        myGuess = new Guess();
        do{
            //prints the rules
            
            JOptionPane.showMessageDialog(null, "The secret word will apear as *");
            JOptionPane.showMessageDialog(null, "Every correct letter guessed will reveal more of the word");
            JOptionPane.showMessageDialog(null, "You can only guess one letter at a time");
            JOptionPane.showMessageDialog(null, "You also only get 5 lives");
            //used to assign * to the word variable and checks the users guess against the secret password
            myGuess.word();
            //this returns the word variable after being checked if the user gessed any letters 
            JOptionPane.showMessageDialog(null, "This is the secret word " + myGuess.getWord());
            //myGuess.check();
           
            myGuess.check();
            again = myGuess.getAgain();
            
        }while(again.equalsIgnoreCase("yes"));
    }
    
}
