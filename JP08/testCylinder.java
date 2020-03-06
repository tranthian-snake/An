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
public class testCylinder {
    public static void main(String[] args) {
        Cylinder cy1= new Cylinder();
        System.out.println("Radius is: "+cy1.getRadius()
        +", Height is: "+cy1.getHeight()
        +", Color is: "+cy1.getColor()
        +", Area is: "+ cy1.getArea()
        +", Volume is: "+ cy1.getVolume());
    }

}
