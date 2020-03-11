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
public class MovableCircle implements Movable{
    public int radius;
    public MovablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center= new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp(){
        center.y-=center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y+=center.ySpeed;
    }
    @Override
    public void moveLeft(){
        center.x-=center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x+=center.xSpeed;
    }
    
    @Override
    public String toString() {
        return "MovableCircle[" + "radius=" + radius + ", center=" + center + ']';
    }
    
    
}
