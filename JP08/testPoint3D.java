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
public class testPoint3D {
     public static void main(String[] args) {
        Point3D p1=new Point3D();
        System.out.println(p1.toString());
        Point3D p2=new Point3D();
        p2.setX(4);
        p2.setY(3);
        p2.setZ(-6);
        System.out.println(p2.toString());
        Point3D p3=new Point3D(-3,4,9);
        System.out.println(p3.toString());
    }
}
