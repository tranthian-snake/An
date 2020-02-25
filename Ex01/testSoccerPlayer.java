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
public class testSoccerPlayer { 
    public static void main(String[] args) {
        SoccerPlayer sp1 = new SoccerPlayer();
        System.out.println(sp1.toString());
        
        SoccerPlayer sp2 = new SoccerPlayer("TH",12);
        System.out.println(sp2.toString());
        
        SoccerPlayer sp3 = new SoccerPlayer("ĐN","TPHCM","HD");
        System.out.println(sp3.toString());
        
        SoccerPlayer sp4 = new SoccerPlayer("Mobi");
        System.out.println(sp4.toString());
    }
}
