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
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        BankAccount bb = new BankAccount();
        BankAccount bc = new BankAccount(10000009,"Methini",9500.01);
        System.out.println("bc = "+bc.getAccountId()+","+bc.getName()+","+bc.getBalance());
        
        ba.setAccountId(91000);
        ba.setName("Methini");        
        
        
    }
}
