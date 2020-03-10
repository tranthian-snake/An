/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP10;

/**
 *
 * @author Tran Thi An
 */
abstract public class Shape {
    private String color;
    
    public Shape(String color){
        this.color=color;
    }
    abstract public double getArea();

    @Override
    public String toString() {
        return "Shape[" + "color=" + color + ']';
    }
    
}
