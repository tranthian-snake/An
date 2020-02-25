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
public class testSoccerPlayer {
     public static void main(String[] args) {
        SoccerPlayer soccerplayer = new SoccerPlayer("FPT",32,"HN","VN"); 
        
        soccerplayer.run();
        soccerplayer.jump();
        soccerplayer.kickBall();
    }
}
