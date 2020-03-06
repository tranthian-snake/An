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
public class Square extends Rectangle{
    private double side;
    
    public Square(){
        super();
        this.side=1.0;
    }
    public Square(double side){
        super();
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        super();
        this.side=side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" +super.toString()+']';
    }
    
    
}
