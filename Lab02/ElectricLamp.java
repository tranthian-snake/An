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
public class ElectricLamp {
    private boolean status;
    
    public ElectricLamp(){
        this.status=status;
    }
    public void turnOff(){
        status=false;
    }
    public void turnOn() {
        status=true;
    }

    @Override
    public String toString() {
        return "ElectricLamp{" + "status=" + status + '}';
    }
    
    
}
