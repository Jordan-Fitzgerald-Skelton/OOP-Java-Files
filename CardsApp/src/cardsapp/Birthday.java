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
public class Birthday extends Cards{
    
    private String[] ver = {"Raising a glass And making a toast Wishing joy and health to you And hoping that Your Birthday Will be happy Happy Birthday!", 
        "There are many wishes That could be sent to you But this one, though simple Brings loving wishes, too!", 
        "Extra special wishes For an extra special day May you have much Happiness in every Single way", 
        "As Birthdays come and Birthdays go this card is sent to let you know One year’s over another’s begun here’s hoping you’ll have lots of fun Happy Birthday"};
    private String[] sal = {"Dear", "To"};
    private String[] clo = {"From", "Happy Birthday", "From yours truly "};
    private String salutations;
    private String verse;
    private String closing;
    
    @Override
    public void initialise() {
        salutations = sal[(int)(Math.random() * sal.length)];
        verse = ver[(int)(Math.random()* ver.length)];
        closing = clo[(int)(Math.random()* clo.length)];
    }
    
    @Override
    public void salutationss(){
        JOptionPane.showMessageDialog(null,salutations + " " + to);
    }

    @Override
    public void verses() {
        JOptionPane.showMessageDialog(null, verse);
    }
    
    @Override
    public void closings(){
        JOptionPane.showMessageDialog(null,closing + " " + from);
    }
    
}
