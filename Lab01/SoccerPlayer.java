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
public class SoccerPlayer {
    private String name;
    private int number;
    private String xLocation;
    private String yLocation;
    
    public SoccerPlayer(String name, int number,String xLocation,String yLocation){
        this.name = name;
        this.number = number;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        System.out.println("name="+name);
        System.out.println("number="+number);
        System.out.println("xLocation="+xLocation);
        System.out.println("yLocation="+yLocation);
    }
   public void run(){};
   public void jump(){};
   public void kickBall(){};
}
