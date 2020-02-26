/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01;

/**
 *
 * @author Tran Thi An
 */
public class Rectangle {
    private float length;
    private float width;
    
    Rectangle(){
        length=1.0f;
        width=1.0f;
    }
    Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length=length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
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
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    
}
