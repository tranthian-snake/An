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
public class testMyCircle {
    public static void main(String[] args) {
        MyCircle mc=new MyCircle();
        System.out.println(mc.toString());
        MyCircle mc1=new MyCircle(3,5,4);
        System.out.println(mc1.toString());
        
        System.out.println("Area= "+mc1.getArea());
        System.out.println("Circumference= "+mc1.getCircumference());
 
    }
}
