/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

/**
 *
 * @author jordan
 */
public class WordGuess extends Game{
    private String words[] = {"house","apple","banana","dog","java"};
    private String secret;
    private char guess;
    
    //initialise method to choose a secret word from array
    @Override
    public void initialise(){
        secret=words[(int)Math.floor(Math.random()*5)];
    }
    
    @Override
    public void instructions(){
        System.out.println("Welcome to Word Guess, to play the game, please...");
    }
    
    @Override
    public void checkGuess(){
        guess = input.charAt(0);
        for(int i = 0; i < secret.length();i++){
            if(secret.charAt(i)==guess){
                output = "Well done, you guessed correctly. That letter is at position "+(i+1)+" in the secret word";  
            }
            else{
                output = "Sorry, that guess is incorrect";
            }
        }
    }
}
