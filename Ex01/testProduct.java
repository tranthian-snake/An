/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author Tran Thi An
 */
public class testProduct { 
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println(p1.toString());
     
        Product p2 = new Product(145,"Computer",435.6,7);
        System.out.println(p2.toString());
        
        Product p3 = new Product(32,"Notebook",10);
        System.out.println(p3.toString());
    }
    
}
