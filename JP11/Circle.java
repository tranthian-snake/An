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
public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        super();
        radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString()+ ", "+ "radius=" + radius + ']';
    }
    
}
