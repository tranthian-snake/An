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
public class Rectangle extends Shape {
    private double width, length;
    
    public Rectangle(){
        super();
        width=1.0;
        length=1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width=width;
        this.length=length;
    }
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()+ ", "+ "width=" + width + ", length=" + length +']';
    }
    
}
