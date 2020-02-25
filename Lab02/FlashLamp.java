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
public class FlashLamp {
    private boolean status;
    private Battery battery;
    
    public FlashLamp(){
        status=false;
    }
    public FlashLamp(Battery battery){
        this.battery=battery;
    }
    
    public void setBattery(Battery battery2){
        this.battery=battery2;
    }
    public int getBatteryInfo(){
        return battery.getEnergy();
    }
    public void light(){
        if(status==true&&battery!=null&&battery.getEnergy()>0){
            battery.descreaseEnergy();
        }
    }
    public void turnOn(){
        if(battery!=null&&battery.getEnergy()>0){
            status=true;
        }
        light();
    }
    public void turnOff(){
        status=false;
    }

    @Override
    public String toString() {
        return "FlashLamp{" + "status=" + status + ", battery=" + battery + '}';
    }
    
    
    
}
