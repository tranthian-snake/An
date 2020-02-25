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
public class Car {
    private String plateNumber;
    private String speed;
    private String xLocation;
    private String yLocation;
    
    public Car(String plateNumber,String speed,String xLocation,String yLocation){
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        System.out.println("plateNumber="+plateNumber);
        System.out.println("Speed="+speed);
        System.out.println("xLocation="+xLocation);
        System.out.println("yLocation="+yLocation);
    }
   public void move(){};
   public void park(){};
   public void accelerate(){};
}
