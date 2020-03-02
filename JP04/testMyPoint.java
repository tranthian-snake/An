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
        MyPoint mp=new MyPoint();
        MyPoint mp1=new MyPoint(4,6);
        System.out.println(mp.toString());
        System.out.println(mp1.toString());
        
        mp1.setXY(6, 9);
        System.out.println(mp1.toString());
        System.out.println("Distance="+mp1.distance(6, 4));
    }
}
