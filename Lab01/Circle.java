/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author Tran Thi An
 */
public class Circle {
    private String color;
    private double radius;
    
    public Circle(String color, double radius){
        this.color=color;
        this.radius=radius;
        System.out.println("Color="+color);
        System.out.println("Radius="+radius);
    }
   public void getRadius(){};
   public void getColor(){};
   public void getArea(){};
}
