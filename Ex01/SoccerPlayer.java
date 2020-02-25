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
    }
    public SoccerPlayer(String name, int number){
        this.name = name;
        this.number = number;
    }
    public SoccerPlayer(String name,String xLocation,String yLocation){
        this.name = name;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }
    public SoccerPlayer(String name){
        this.name = name;
    }
    
    public SoccerPlayer(){
        name  = "FPT";
        number = 23;
        xLocation = "HN";
        yLocation = "LC";
    }
    
   public void run(){};
   public void jump(){};
   public void kickBall(){};

    @Override
    public String toString() {
        return "SoccerPlayer{" + "name=" + name + ", number=" + number + ", xLocation=" + xLocation + ", yLocation=" + yLocation + '}';
    }
   
   
}
