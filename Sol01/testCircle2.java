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
public class testCircle2 {
    public static void main(String[] args) {
        Sol01.Circle2 c1=new Sol01.Circle2();
        Sol01.Circle2 c2=new Sol01.Circle2(3.4);
        System.out.println(c1.toString());
        
        System.out.println("Area="+c1.getArea()+", Circumference"+c1.getCircumference());
        
        c2.setRadius(2.0);
        System.out.println(c2.toString());
        
    }
}
