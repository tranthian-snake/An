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
public class testMovablePoint {
    public static void main(String[] args) {
        MovablePoint m1= new MovablePoint();
        System.out.println(m1.toString());
        MovablePoint m2= new MovablePoint(3.5f, 5.7f, 1.7f, 3.8f);
        System.out.println(m2.toString());
        System.out.println(m2.move());
        
        Point p1= new Point();
        System.out.println(p1.toString());
    }
    
}
