/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author Tran Thi An
 */
public class testCar {
      public static void main(String[] args) {
        Car car = new Car("36FUGDT643","40km/h","HN","VN"); 
        
        car.move();
        car.park();
        car.accelerate();
    }
}
