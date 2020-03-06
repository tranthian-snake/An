/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP08;

/**
 *
 * @author Tran Thi An
 */
public class testRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(4.0f,3.0f);
        
        System.out.println(r1.toString());
        System.out.println("Area="+r1.getArea());
        System.out.println("Perimeter"+r1.getPerimeter());
    }
}
