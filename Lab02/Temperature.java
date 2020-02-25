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
public class Temperature {
    public double cTemp;
    
    public Temperature(){
        cTemp=25;
    }
    public Temperature(double c){
        this.cTemp=c;
    }
    public double getCTemp(){
        return cTemp;
    }
    public void setCTemp(double c){
        this.cTemp=c;
    }
    public double getFTemp(){
        return (cTemp*1.8)+32;
    }
    public double getKTemp(){
        return cTemp+ 273.15;
    }

    @Override
    public String toString() {
        return "Temperature{" + "cTemp=" + cTemp + '}';
    }
    
    
}
