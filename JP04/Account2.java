/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;

/**
 *
 * @author Tran Thi An
 */
public class Account2 {
    private int id;
    private Customer customer;
    private double balance;
    
    public Account2(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account2(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }
    public int getID(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    @Override
    public String toString() {
        return customer + " balance=$" + balance;
    }
    public String getCustomername(){
        return customer.getName();
    }
    public Account2 deposit(double amount){
        return this.balance=balance+amount;
    }
    public Account2 withdrawn(double amount){
        if(balance>=amount){
            return this.balance=amount-balance;
        }else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
    }
    
}
