/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;
import java.util.Arrays;
/**
 *
 * @author Tran Thi An
 */
public class MyPoint {
    int x;
    int y;
    
    public MyPoint(){
        x=0;
        y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
/**
 * public int[2] getXY(){
        
    }
 */
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
    public double distance(int x, int y){
        int x2=this.x-x;
        int y2=this.y-y;
        return Math.sqrt(x2*x2+y2*y2);
    }
    public double distance(MyPoint another){
        int x2=this.x-another.x;
        int y2=this.y-another.y;
        return Math.sqrt(x2*x2+y2*y2);
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    
    
    
}
