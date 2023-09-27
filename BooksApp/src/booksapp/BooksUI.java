/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booksapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class BooksUI {

    private ArrayList<Books> bookss;

    public BooksUI() {
        bookss = new ArrayList<>();
    }

    //menu 
    public void menu() {
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Add \n 2. Dialpay \n 3. Search \n 4. Delete"));

        switch (ans) {
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }

    public void add() {
        Books b = new Books();
        b.setTitle(JOptionPane.showInputDialog(null, "Enter the books title "));
        b.setAuthor(JOptionPane.showInputDialog(null, "Enter the books author "));
        b.setGenre(JOptionPane.showInputDialog(null, "Enter the books genre "));
        b.setIsbn(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the books isbn")));

        bookss.add(b);
    }

    public void print() {
        for (Books e : bookss) {
            JOptionPane.showMessageDialog(null, e.getDetails());
        }
    }

    public void search() {
        if (bookss.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry, there are no books to search");
        } else {
            int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to search using a books ISBN \n or enter 2 to search using both the books title and auhtor"));
            if (choice == 1) {
                int searchterm = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a book ISBN to search"));
                for (Books e : bookss) {
                    if (e.getIsbn() == searchterm) {
                        JOptionPane.showMessageDialog(null, e.getDetails());
                    }
                }
            } else if (choice == 2) {
                String stitle = JOptionPane.showInputDialog(null, "Please enter the books title you wish to search");
                String sauthor = JOptionPane.showInputDialog(null, "Please enter the books author you wish search");

                for (Books s : bookss) {
                    if (s.getTitle().equals(stitle) || s.getAuthor().equals(sauthor)) {
                        JOptionPane.showMessageDialog(null, s.getDetails());
                    }
                }
            }
        }
    }

    public void delete() {
        if (bookss.isEmpty()) {
            JOptionPane.showMessageDialog(null, "There are no books to delete ");
        } else {
            int pick = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to delete a specific book or 2 to delete the first or last book"));
            if (pick == 1) {
                int searchterm = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a book ISBN to delete"));
                for (Books e : bookss) {
                    if (e.getIsbn() == searchterm) {
                        JOptionPane.showMessageDialog(null, "The following will be deleted \n" + e.getDetails());
                        bookss.remove(e);
                    }
                }
            } else if (pick == 2) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to delete the first book in the catalog 2 to delete the last book in the catalog"));
                if (num == 1) {
                    bookss.remove(0);
                    JOptionPane.showInputDialog(null, "The first item in the catalog has been deleted");
                } else if (num == 2) {
                    bookss.remove(bookss.size());
                    JOptionPane.showInputDialog(null, "The last item in the catalog has been deleted");
                }
            }
        }
    }
}
