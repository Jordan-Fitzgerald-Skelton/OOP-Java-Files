/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ownerName;
        String accNum;
        double balance;
        double withdraw;
        double deposit;

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter 1 to deposit to a Current Account, 2 to deposit to a saving account, 3 to withdraw from a current account or 4 to withdraw from a savings account"));
        if (num == 1) {
            ownerName = JOptionPane.showInputDialog(null, "Please enter owners name");
            accNum = JOptionPane.showInputDialog(null, "Please enter account number");
            balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the current balance"));
            deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter how much you want to deposit"));
            CurrentAccount c = new CurrentAccount(ownerName, accNum, balance);
            c.calculateDeposit();
            JOptionPane.showMessageDialog(null, c.getDetails() + ", Updated balance = " + c.getDeposit() + " euro");
        } else if (num == 2) {
            ownerName = JOptionPane.showInputDialog(null, "Please enter clients name");
            accNum = JOptionPane.showInputDialog(null, "Please enter booking refrence name");
            balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            SavingsAccount s = new SavingsAccount(ownerName, accNum, balance);
            s.calculateDeposit();
            JOptionPane.showMessageDialog(null, s.getDetails() + ". The total Price will be " + s.getDeposit() + " euro");
        }else if(num ==3){
            ownerName = JOptionPane.showInputDialog(null, "Please enter clients name");
            accNum = JOptionPane.showInputDialog(null, "Please enter booking refrence name");
            balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            withdraw = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            CurrentAccount c = new CurrentAccount(ownerName, accNum, balance);
            c.calculateWithdraw();
            JOptionPane.showMessageDialog(null, c.getDetails() + ". The total Price will be " + c.getWithdraw() + " euro");
        }else if(num ==4){
            ownerName = JOptionPane.showInputDialog(null, "Please enter clients name");
            accNum = JOptionPane.showInputDialog(null, "Please enter booking refrence name");
            balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            withdraw = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of nights"));
            SavingsAccount s = new SavingsAccount(ownerName, accNum, balance);
            s.calculateWithdraw();
            JOptionPane.showMessageDialog(null, s.getDetails() + ". The total Price will be " + s.getWithdraw() + " euro");
        }
    }
    
}
