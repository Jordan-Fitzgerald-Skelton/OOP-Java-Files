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
public class Christmas extends Cards{
    private String[] ver = {"Merry Christmas to a friend who makes my life merry and bright!", "The gift of love. The gift of peace. The gift of happiness. May all these be yours at Christmas", "May the peace and joy of Christmas live in your heart all year long.", "Merry Christmas and best wishes for a Happy New Year.", "With all good wishes for Christmas and the New Year."};
    private String[] sal = {"Dear", "To", };
    private String[] clo = {"From", "Merry Christmas", "Wishing You A Merry Christmas"};
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
