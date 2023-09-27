/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countingapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class CountingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sentence;
        int words, letters, vowels, cons;
        
        Counting myCounting = new Counting();
        
        sentence = JOptionPane.showInputDialog(null,"Enter a sentence");
        myCounting.setSentence(sentence);
        
        myCounting.compute();
        
        words = myCounting.getWords();
        vowels = myCounting.getVowels();
        letters = myCounting.getLetters();
        cons = myCounting.getCons();
        
        JOptionPane.showMessageDialog(null,"This sentence contains "+words+" words, "+letters+" letters,"+vowels+" vowels, and "+cons+" consonants");
    }
    
}
