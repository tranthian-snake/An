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
public class testTime {
    public static void main(String[] args) {
        Sol01.Time t1=new Sol01.Time(12, 5, 25);
        System.out.println(t1.toString());
        t1.setHour(4);
        System.out.println("Hour= "+t1.getHour());
        System.out.println("Next Second= "+t1.nextSecond());
        System.out.println("Previous Second= "+t1.previousSecond());
    }
}
