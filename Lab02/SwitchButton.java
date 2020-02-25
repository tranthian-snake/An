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
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    
    public SwitchButton(){
        this.status=status;
    }
    public void connectToLamp(ElectricLamp lamp){
        this.lamp=lamp;
    }
    public void SwitchOff(){
        status=false;
    }
    public void SwitchOn(){
        status=true;
    }
}
