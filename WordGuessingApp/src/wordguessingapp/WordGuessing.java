/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordguessingapp;

/**
 *
 * @author Jordan
 */
public class WordGuessing {
       private String secword;
       private String guess;
       private StringBuffer strBuff;
  
    public void setGuess(String guess) {
        this.guess = guess;
    }
    
    public void compute() {
        secword = "apple;";
        strBuff = new StringBuffer();
        for(int i = 0; i < secword.length(); i++){
            strBuff.append("*");
        }
        for(int i = 0; i < secword.length(); i++){
            if(secword.charAt(i) == guess.charAt(0)){
                str.insert(i, guess);
            }else{
            JOptionPane.showMessageDialog(null, "please try again");
            }
        }

    public StringBuffer getStrBuff() {
        return strBuff;
    }  
    }
   
