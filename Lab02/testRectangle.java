/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author Tran Thi An
 */
public class testRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        System.out.println(r1.toString());
        
        r1.display();
        r1.setHeight(5);
        r1.setWidth(10);
        System.out.println(r1.toString());
        r1.getArea();
        r1.getPerimeter();
        System.out.println("Area="+r1.getArea());
        System.out.println("Perimeter="+r1.getPerimeter());
        
        
    }
}
