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
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        this.radius=1.0;
        this.color="red";
        System.out.println("Contruced a Circle with Circle()");
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="red";
        System.out.println("Contruced a Circle with Circle(radius)");
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
        System.out.println("Contruced a Circle with Circle(radius, color)");
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
