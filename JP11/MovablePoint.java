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
public class MovablePoint implements Movable{
    public int x, y, xSpeed, ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public void moveUp(){
        y-=ySpeed;
    };

    @Override
    public void moveDown(){
        y+=ySpeed;
    };
    @Override
    public void moveLeft(){
        x-=xSpeed;
    };
    @Override
    public void moveRight(){
         x+=xSpeed;
    };

    @Override
    public String toString() {
        return "MovablePoint[" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ']';
    }
    
}
