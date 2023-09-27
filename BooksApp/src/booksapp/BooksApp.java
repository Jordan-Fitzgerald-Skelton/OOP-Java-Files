/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package booksapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class BooksApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ans;
        BooksUI myUI = new BooksUI();
        do{
        myUI.menu();
        ans = JOptionPane.showInputDialog(null, "Would you like to go back to the menu");
        
        }while(ans.equalsIgnoreCase("yes"));
    }
}
