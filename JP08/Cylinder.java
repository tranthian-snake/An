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
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("Construced a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height=1.0;
        System.out.println("Construced a Cylinder with Cylinder()");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height=1.0;
        System.out.println("Construced a Cylinder with Cylinder()");
    }
    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height=1.0;
        System.out.println("Construced a Cylinder with Cylinder()");
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }
    
    public double getVolume(){
        return getArea()*height;
    }
    
}
