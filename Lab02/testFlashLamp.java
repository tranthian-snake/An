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
public class testFlashLamp {
    private static Battery full;
    public static void main(String[] args) {
        FlashLamp flashlamp=new FlashLamp();
        System.out.println(flashlamp.toString());
        Battery battery=new Battery();
        System.out.println(battery.toString());
       
        for(int i=10;i>0;i--){
        flashlamp.turnOn();
        }
        for(int i=10;i>0;i--){
        flashlamp.turnOff();
        }
    }
}
