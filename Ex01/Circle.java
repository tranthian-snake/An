/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author Tran Thi An
 */
public class Circle {
    private double radius;
    private String color;
//   constructer khởi tạo đối tượng
    public Circle(){
        radius = 5;
        color = "blue";
    }
    public Circle (double radius){
        this.radius = radius;
    }
    public Circle (String color){
        this.color = color;
    }
    public Circle (double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    
    /**
     * lấy ra bán kính
     * @return 
     */
    public double getRadius(){
        return radius;
    }
    /**
     * lấy ra màu sắc
     * @return 
     */
    public String getColor(){
        return color;
    }
    /**
     * lấy ra diện tích
     */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
}
