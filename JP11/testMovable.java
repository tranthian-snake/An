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
public class testMovable {
    public static void main(String[] args) {
        Movable m1= new MovablePoint(1, 5, 7, -3);
        System.out.println(m1.toString());
        m1.moveDown();
        m1.moveLeft();
        System.out.println("Move down & move left :"+ m1.toString());
        m1.moveUp();
        m1.moveRight();
        System.out.println("Move up & move right :"+ m1.toString());
        
        System.out.println("");
        
        Movable m2= new MovableCircle(3, -8, 4, -1, 5);
        System.out.println(m2.toString());
        m2.moveUp();
        m2.moveLeft();
        System.out.println("Move up & move left :"+ m2.toString());
        m2.moveDown();
        m2.moveRight();
        System.out.println("Move down & move right :"+ m2.toString());
        
    }
}
