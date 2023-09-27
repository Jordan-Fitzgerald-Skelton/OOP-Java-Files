/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameapp;

/**
 *
 * @author jordan
 */
public abstract class Game {
    protected String input;
    protected String output;
    
    //input and output methods to be inherited by sub classes
    public void setInput(String input){
        this.input = input;
    }
    
    public void output(){
        System.out.println(output);
    }
    
    //abstract methods to be overridden in sub classes
    public abstract void initialise();
    public abstract void instructions();
    public abstract void checkGuess();
    
    //template method - this will control the flow of the game, regardless of which type of game it is
    public final void play(String input){
        initialise();
        instructions();
        setInput(input);
        checkGuess();
        output();
    }
}
