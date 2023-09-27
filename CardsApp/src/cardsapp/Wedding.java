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
public class Wedding extends Cards{
    private String[] ver = {"Wishing you a lifetime of love and happiness", 
        "May the years ahead be filled with love and joy", 
        "Your wedding day will come and go, but may your love forever grow.", 
        "Wishing you well as you embark on this next chapter of life. Cheers!"};
    private String[] sal = {"Dear", "To", };
    private String[] clo = {"From"};
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
