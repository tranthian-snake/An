/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;

/**
 *
 * @author Tran Thi An
 */
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    public MyCircle(){
        center= new MyPoint(0,0);
        radius=1;
    }
    public MyCircle(int x, int y, int radius){
        center= new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.x=x;
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
       center.y=y;
    }
    public int[] getCenterXY(){
        int[] centerxy= new int[2];
        centerxy[0]= this.getCenterX();
        centerxy[1]= this.getCenterY();
        return centerxy;
    }
    
    public void setCenterXY(int x, int y){
        center.x=x;
        center.y=y;
    }

    @Override
    public String toString() {
        return "MyCircle[" + "center=" + center + ", radius=" + radius + ']';
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
    /**
     * public double distance(MyCircle another){
        
    }
     */
    
}
