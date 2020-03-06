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
public class testSquare {
    public static void main(String[] args) {
        Square s1= new Square();
        System.out.println(s1.toString());
        Square s2= new Square(1.2, "blue", false);
        System.out.println(s2.toString());
    }
}
