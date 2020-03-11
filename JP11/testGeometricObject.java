/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP11;

/**
 *
 * @author Tran Thi An
 */
public class testGeometricObject {
    public static void main(String[] args) {
        Circle c1= new Circle(3.5);
        System.out.println(c1.toString());
        System.out.println("Perimeter is: "+ c1.getPerimeter());
        System.out.println("Area is: "+ c1.getArea());
        
        System.out.println("");
        
        ResizableCircle r1= new ResizableCircle(2.5);
        System.out.println(r1.toString());
        System.out.println("Perimeter is: "+ r1.getPerimeter());
        System.out.println("Area is: "+ r1.getArea());
        r1.resize(8);
        System.out.println("Resize :"+ r1.toString());
        System.out.println("Perimeter is: "+ r1.getPerimeter());
        System.out.println("Area is: "+ r1.getArea());
        
    }
}
