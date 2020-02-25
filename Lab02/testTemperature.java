/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author Tran Thi An
 */
public class testTemperature {
    public static void main(String[] args) {
        Temperature t1=new Temperature();
        System.out.println(t1.toString()+"ºC");
        
        System.out.println(t1.getFTemp()+"ºF");
        System.out.println(t1.getKTemp()+"ºK");
    }
}
