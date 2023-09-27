/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gameapp;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class GameApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Would you like to play 1. Crack the code or 2.Word guess?"));
        
        if(choice==1){
            Game myGame;
            myGame = new CrackTheCode();
            String input = JOptionPane.showInputDialog(null,"Please enter your first number guess");
            myGame.play(input);
        }
        else if(choice==2){
            Game myGame;
            myGame = new WordGuess();
            String input = JOptionPane.showInputDialog(null,"Please enter your first letter guess");
            myGame.play(input);
        }
        else{
            JOptionPane.showMessageDialog(null,"Sorry, that is not a valid entry");
        }
    }
    
}
