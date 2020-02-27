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
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
        if(1<=day&& day<=31&& 1<=month&& month<=12&& 1900<=year&& year<=9999){
        this.day=day;
        this.month=month;
        this.year=year;
        }
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
         if(1<=day&& day<=31){
        this.day=day;
         }
    }
    public void setMonth(int month){
         if(1<=month&& month<=12){
        this.month=month;
         }
    }
    public void setYear(int year){
         if(1900<=year&& year<=9999){
        this.year=year;
         }
    }
    public void setDate(int day, int month, int year){
         if(1<=day&& day<=31&& 1<=month&& month<=12&& 1900<=year&& year<=9999){
        this.day=day;
        this.month=month;
        this.year=year;
         }
    }

    @Override
    public String toString() {
        return "Date{" + day + "/" + month + "/" + year + '}';
    }
    
}
