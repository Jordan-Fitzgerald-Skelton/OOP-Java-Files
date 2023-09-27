/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

/**
 *
 * @author jordan
 */
public class CrackTheCode extends Game{
    private int secretCode[];
    private int guess;
    
    public CrackTheCode(){
        secretCode = new int[5];
    }
    
    @Override
    public void initialise(){
        for(int i = 0; i <5;i++){
        secretCode[i]=(int)Math.floor(Math.random()*10);
        }
    }
    
    @Override
    public void instructions(){
        System.out.println("Welcome to Crack the Code, to play the game, please enter a number.....");
    }
    
    @Override
    public void checkGuess(){
        guess = Integer.parseInt(input);
        for(int i = 0; i < secretCode.length;i++){
            if(guess==secretCode[i]){
                output = "Well done, you guessed correctly, that is the number at position "+(i+1)+" in the secret code";
            }
            else{
                output = "Sorry, you guessed incorrectly";
            }
        }
    }
}
