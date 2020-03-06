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
public class Rectangle extends Shape {
     private double length;
    private double width;
    
    Rectangle(){
        super();
        length=1.0;
        width=1.0;
    }
    Rectangle(double length, double width){
        super();
        this.length=length;
        this.width=width;
    }
    Rectangle(double length, double width, String color, boolean filled){
        super(color, filled);
        this.length=length;
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()+ ", length=" + length + ", width=" + width + ']';
    }
    
}
