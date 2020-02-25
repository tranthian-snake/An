/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author Tran Thi An
 */
public class Rectangle {
    private int width;
    private int height;
    
    public Rectangle(){
        width=7;
        height=3;
    }
    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public void display(){
        if(width>0&&height>0){
            String i="";
    
            for(;width>0;width--){
                i=i+"#";
            }
            for(;height>0;height--){
                System.out.println(i);
            }
        }
    }
    public void setWidth(int width2){
        this.width=width2;
    }
    public void setHeight(int height2){
        this.height=height2;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getArea(){
        return width * height;
    }
    public int getPerimeter(){
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
    
}
