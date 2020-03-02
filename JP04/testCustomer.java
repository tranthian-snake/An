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
public class testCustomer {
    public static void main(String[] args) {
        Customer c1=new Customer(2,"Musv",7);
        System.out.println(c1.toString());
        
        c1.setDiscount(5);
        System.out.println(c1.toString());
        
    }
    
}
