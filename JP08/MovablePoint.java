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
public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){
        super();
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    MovablePoint(double d, double d0, double d1, double d2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] Speed= new float[2];
        Speed[0]= this.xSpeed;
        Speed[1]= this.ySpeed;
        return Speed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()+ ", " + "speed=(" + xSpeed + ", " + ySpeed + ')';
    }
    public MovablePoint move(){
        x+= xSpeed;
        y+= ySpeed;
        return this;
    }
    
    
}
