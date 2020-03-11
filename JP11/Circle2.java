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
public class Circle2 implements GeometricObject{
    double radius;
    
    public Circle2(){
        radius=1.0;
    }
    public Circle2(double radius){
        this.radius=radius;
    }
    @Override
    public double getPerimeter(){
        return radius*radius*Math.PI;
    }
    @Override
    public double getArea(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle2[" + "radius=" + radius + ']';
    }
    
}
