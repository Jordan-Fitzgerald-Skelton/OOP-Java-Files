/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countingapp;

/**
 *
 * @author Jordan
 */
public class Counting {
    
    private String sentence;
    private int words;
    private int letters;
    private int cons;
    private int vowels;

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int getWords() {
        return words;
    }

    public int getLetters() {
        return letters;
    }

    public int getCons() {
        return cons;
    }

    public int getVowels() {
        return vowels;
    }
    
        public void compute() {
        letters = sentence.length();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == '0' || sentence.charAt(i) == 'u') {
                vowels++;
            } else if (sentence.charAt(i) == ' ') {
                words++;
            } else {
                cons++;
            }
        }
    }
    
    
}

