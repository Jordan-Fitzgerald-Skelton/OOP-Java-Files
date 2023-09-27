/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapp;

/**
 *
 * @author Jordan
 */
public class SavingsAccount extends Banking{
    
    private double deposit;
    private double withdraw;
        
    public SavingsAccount(String ownerName, String accNum, double balance) {
        super(ownerName, accNum, balance);
    }
    
    public SavingsAccount() {
        super();
    }  
    @Override
    public String getDetails(){
        return "Owner Name:" + ownerName+ ", Account Number:" + accNum + ", Current balance" + balance; 
    }
    @Override
    public void calculateDeposit(){
        balance = balance + deposit + (deposit * 0.01); 
    }

    public double getDeposit() {
        return deposit;
    }
    
    @Override
    public void calculateWithdraw(){
        balance = balance - withdraw - (withdraw * 0.5);
    }

    public double getWithdraw() {
        return withdraw;
    }
}
