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
public class testShape {
    public static void main(String[] args) {
        Shape s1= new Circle();
        System.out.println(s1.toString());
        System.out.println("Area is: "+ s1.getArea());
        System.out.println("Perimeter is: "+ s1.getPerimeter());
        
        System.out.println("");
        
        Shape s2= new Rectangle();
        System.out.println(s2.toString());
        System.out.println("Area is: "+ s2.getArea());
        System.out.println("Perimeter is: "+ s2.getPerimeter());
        
        System.out.println("");
        
        Shape s3= new Square();
        System.out.println(s3.toString());
       
    }
}
