/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class Guess {
    private final String secword;
    private String guess;
    private String word;
    private StringBuffer strBuff;
    private int lives;
    private String again;

    public Guess() {
        secword = "apple";
        guess = "";
        word = "";
        strBuff = new StringBuffer();
        lives = 0;
        again = " ";
    }

    //used to convert the secret word to * 
    public void word(){
        strBuff = new StringBuffer();
        for(int i = 0; i < secword.length(); i++){
            //adds * to the string buffer and makes it as long as the secret word
            strBuff.append("*");
        }
        //assigns the converted string bufffer to the string variable word 
        word = strBuff.toString();
    }
    
    // better version 
    //private char guess;
    //guess = ' ';
    //guess = (JOptionPane.showInputDialog(null, "Please enter a letter")).charAt(0);
    
    //public void compute(){
        //for(int i = 0; i < secword.length(); i++){
            //if(guess == secword.charAt(i)){
                //strBuff.setCharAt(i, guess);
            //}
        //}
        //word = strBuff.toString();
    //}
    
    
    
    
    //used to check the users guess against the secret word
    public void check(){
        //this runs the loop as long as the user has more than 0 lives
        do{
                guess = JOptionPane.showInputDialog(null, "Time to guess ");
                if(guess.equals("a")){
                    //inserts the users correct guess into the correct index
                    strBuff.insert(0, guess);
                    //deletes any characters that are bigger then the lenghth of the string buffer
                    strBuff.deleteCharAt(1);
                    //coverst string buffer into a string and assigns it to word
                    word = strBuff.toString();
                    JOptionPane.showMessageDialog(null, "The word currently is " +word);
                }else if(guess.equals("p")){
                    //should inserts the users correct guess into the correct index
                    strBuff.insert(1, guess);
                    strBuff.insert(2, guess);
                    //deletes any characters that are bigger then the lenghth of the string buffer
                    strBuff.deleteCharAt(3);
                    strBuff.deleteCharAt(4);
                    //coverst string buffer into a string and assigns it to word
                    word = strBuff.toString();
                    JOptionPane.showMessageDialog(null, "The word currently is " +word);
                }else if(guess.equals("l")){
                    //should inserts the users correct guess into the correct index
                    strBuff.insert(3, guess);
                    strBuff.deleteCharAt(5);
                    //coverst string buffer into a string and assigns it to word
                    word = strBuff.toString();
                    JOptionPane.showMessageDialog(null, "The word currently is " +word);
                }else if(guess.equals("e")){
                    //should inserts the users correct guess into the correct index
                    strBuff.insert(4, guess);
                    strBuff.deleteCharAt(5);
                    //coverst string buffer into a string and assigns it to word
                    word = strBuff.toString();
                    JOptionPane.showMessageDialog(null, "The word currently is " +word);
                }else if (secword.equals(guess)){
                    JOptionPane.showMessageDialog(null, "Well done you got the word. The word is " +word);
                }else{
                    JOptionPane.showMessageDialog(null, "Not a letter in the secret word try again ");
                    //removes a life if the user gesses an incorrect letter 
                    lives++;
                }
        }while(lives < 5);
        JOptionPane.showMessageDialog(null, "You have run out of lives");
        again = JOptionPane.showInputDialog(null, "Enter yes to play again or no yo quit");
       }
    //returns the variable word when called appon in the app file
    public String getWord() {
        return word;
    }
    public String getAgain(){
        return again;
    }
    
}
