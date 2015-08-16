/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo;

/**
 *
 * @author Student Lab
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        
        BankAccount bb = new BankAccount();
        
        ba.deposit(500);
        ba.setAccountId(900001);
        ba.setName("Somchai");
        
        bb.setAccountId(900005);
        bb.setName("Somsri");
        bb.withdraw(900);
        
//        
//        System.out.println("Account ID: "+ba.getAccountId());
//        System.out.println("Account Name: "+ba.getName());
//        System.out.println("Balance: "+ba.getBalance());
//        System.out.println("-----------------------------------");
//        System.out.println("Account ID: "+bb.getAccountId());
//        System.out.println("Account Name: "+bb.getName());
//        System.out.println("Balance: "+bb.getBalance());
//        
        StringBuilder str = new StringBuilder();
        str.append("Account ID: ");
        str.append(ba.getAccountId());
        str.insert(3,"***");
        System.out.println(str);
        
    }
}
