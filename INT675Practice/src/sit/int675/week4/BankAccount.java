/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week4;

/**
 *
 * @author Student Lab
 */
public class BankAccount {

    private int accountId;
    private String name;
    private double balance;

    public BankAccount() {
        this(999999,"No name",0.0);
    }   
    
    public BankAccount(int accountId) {
        this(accountId,"No name");
    }
        
    public BankAccount(int accountId, String name) {
       this(accountId,name,0.0);
    }    
    
    public BankAccount(int accountId, String name, double balance) {
        super(); //Initail 
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }    
    
    
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
