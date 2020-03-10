/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP10;

/**
 *
 * @author Tran Thi An
 */
public class Rectangle extends Shape{
    private int length;
    private int width;
    
    public Rectangle( String color, int length, int width){
        super(color);
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle[" + "length=" + length + ", width=" + width + ", "+ super.toString()+ ']';
    }
    
    
}
