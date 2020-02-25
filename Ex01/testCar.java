/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author Tran Thi An
 */
public class testCar { 
      public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.toString());
        
        Car c2 = new Car("36FUGDT643","40km/h");
        System.out.println(c2.toString());
        
        Car c3 = new Car("88HYTF54","BN","CT");
        System.out.println(c3.toString());
        
        Car c4 = new Car("HYTF5543VG5");
        System.out.println(c4.toString());
    }
}
