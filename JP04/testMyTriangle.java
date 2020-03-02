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
public class testMyTriangle {
    public static void main(String[] args) {
       MyTriangle mt= new MyTriangle(3,8,5,43,7,9);
        System.out.println(mt.toString());
        System.out.println(mt.getPerimeter());
        
    }
}
