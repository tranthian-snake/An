/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01;

/**
 *
 * @author Tran Thi An
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second){
        if(0<=hour&& hour<=23&& 0<=minute&& minute<=59&& 0<=second&& second<=59){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
        }
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    @Override
    public String toString() {
        return "Time{" + hour + ":" + minute + ":" + second + '}';
    }
    
    public int nextSecond(){
        return this.second=second+1;
    }
     public int previousSecond(){
        return this.second=second-1;
    }
}
