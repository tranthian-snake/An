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
public class Point {
    float x;
    float y;
    
    public Point(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public float[] getXY(){
        float[] xy= new float[2];
        xy[0]= this.x;
        xy[1]= this.y;
        return xy;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" + x + ","+ y + ")";
    }
    
}
