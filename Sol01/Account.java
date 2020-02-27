/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01;

/**
 *
 * @author Tran Thi An
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account(String id, String name){
        this.id=id;
        this.name=name;
        balance=0;
    }
    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        return this.balance=balance+amount;
    }
    public int debit(int amount){
        if(amount<=balance){
            this.balance=balance-amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount<=balance){
             another.credit(amount);
             this.debit(amount);
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    
}
