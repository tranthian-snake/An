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
public class testAccount {
    public static void main(String[] args) {
        Sol01.Account a1=new Sol01.Account("T1653", "Peter",200);
        Sol01.Account a2=new Sol01.Account("F4236", "Matt",50);
        
        System.out.println(a1.toString());
        System.out.println("TransferTo= "+a1.transferTo(a2, 90));
        System.out.println("Credit = "+a1.credit(60));
        System.out.println("Debit = "+a1.debit(10));
        
    }
}
