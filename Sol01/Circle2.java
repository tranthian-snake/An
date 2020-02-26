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
public class Circle2 {
    private double radius;
    
    public Circle2(){
        radius=1.0;
    }
    public  Circle2(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
            /**
             * dien tich hinh tron = ban kinh.3,14
             */
    }
    public double getCircumference(){
        return radius*2*Math.PI;
        /**
         * chu vi hinh tron= 2.ban kinh.3,14
         */
    }

    @Override
    public String toString() {
        return "Circle2{" + "radius=" + radius + '}';
    }
    
    
}
