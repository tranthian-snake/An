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
public class testCircle {
    public static void main(String[] args) {
        Sol01.Circle c1= new Sol01.Circle();
        Sol01.Circle c2=new Sol01.Circle();
        
        System.out.println(c1.toString());
        System.out.println("Area=" + c1.getArea());
        c1.setRadius(12);
        c1.setColor("blue");
        System.out.println(c1.toString());
        System.out.println("Area="+c1.getArea());
        
        
        
    }
}
