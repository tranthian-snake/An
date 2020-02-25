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
public class Battery {
    private int energy;
    
    public Battery(){
        energy=100;
    }
    
    public void setEnergy(int energy2){
        this.energy=energy2;
    }
    public int getEnergy(){
        return energy;
    }
    public void descreaseEnergy(){
        energy--;
        /**
         * energy--  : energy=energy-1
         */
    }

    @Override
    public String toString() {
        return "Battery{" + "energy=" + energy + '}';
    }
    
    
    
}
