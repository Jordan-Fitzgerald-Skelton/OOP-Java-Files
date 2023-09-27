/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapp;

/**
 *
 * @author Jordan
 */
public abstract class Banking {
    protected String ownerName;
    protected String accNum;
    protected double balance;

    public Banking(String ownerName, String accNum, double balance) {
        this.ownerName = ownerName;
        this.accNum = accNum;
        this.balance = balance;
    }

    public Banking() {
        ownerName = "";
        accNum = "";
        balance = 0;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    public abstract void calculateDeposit();
    
    public abstract void calculateWithdraw();
    
    public abstract String getDetails();

}

