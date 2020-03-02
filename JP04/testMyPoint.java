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
public class testMyPoint {
    public static void main(String[] args) {
        MyPoint m1=new MyPoint(4,6);
        System.out.println(m1.toString());
        
        m1.setXY(6, 9);
        System.out.println(m1.toString());
        System.out.println("Distance="+m1.distance(6, 4));
    }
}
