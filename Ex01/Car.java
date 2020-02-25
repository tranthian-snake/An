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
    }
    public Car(String plateNumber,String speed){
        this.plateNumber = plateNumber;
        this.speed = speed;
    }
    public Car(String plateNumber,String xLocation,String yLocation){
        this.plateNumber = plateNumber;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }
    public Car(String plateNumber){
        this.plateNumber = plateNumber;
    }
    
    public Car(){
        plateNumber = "456DWS643D";
        speed = "30km/h";
        xLocation = "HN";
        yLocation = "TB";
    }
    
   public void move(){};
   public void park(){};
   public void accelerate(){};

    @Override
    public String toString() {
        return "Car{" + "plateNumber=" + plateNumber + ", speed=" + speed + ", xLocation=" + xLocation + ", yLocation=" + yLocation + '}';
    }
   
   
}
