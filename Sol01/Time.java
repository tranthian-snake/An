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
        if(0<=hour&& hour<=23){
        this.hour=hour;
        }
    }
    public void setMinute(int minute){
        if(0<=minute&& minute<=59){
        this.minute=minute;
        }
    }
    public void setSecond(int second){
        if(0<=second&& second<=59){
        this.second=second;
        }
    }
    public void setTime(int hour, int minute, int second){
        if(0<=hour&& hour<=23&& 0<=minute&& minute<=59&& 0<=second&& second<=59){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%02d", hour, minute, second);
    }
    
    public Time nextSecond(){
        ++second;
        if(second==60){
            second=0;
            ++minute;
            if(second==60){
                minute=0;
                ++hour;
                if(hour==24){
                    hour=0;
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        --second;
        if(second==0){
            second=60;
            --minute;
            if(second==0){
                minute=60;
                --hour;
                if(hour==0){
                    hour=24;
                }
            }
        }
        return this;
    }
}
