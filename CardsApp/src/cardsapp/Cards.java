/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardsapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public abstract class Cards {
    protected String to;
    protected String from;

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    //abstract methods to be overridden in sub classes
    public abstract void initialise();
    public abstract void salutationss();
    public abstract void verses();
    public abstract void closings();
    
    //template method - this will control the flow of the game, regardless of which type of game it is
    public final void play(String to, String from){
        setTo(to);
        setFrom(from);
        initialise();
        salutationss();
        verses();
        closings();
    }
}

