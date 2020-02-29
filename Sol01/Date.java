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
        System.out.println("Retype");
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
         System.out.println("Retype");
    }
    public void setMonth(int month){
         if(1<=month&& month<=12){
        this.month=month;
         }
         System.out.println("Retype");
    }
    public void setYear(int year){
         if(1900<=year&& year<=9999){
        this.year=year;
         }
         System.out.println("Retype");
    }
    public void setDate(int day, int month, int year){
         if(1<=day&& day<=31&& 1<=month&& month<=12&& 1900<=year&& year<=9999){
        this.day=day;
        this.month=month;
        this.year=year;
         }
         System.out.println("Retype");
    }

    @Override
    public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d/%02d/%4d", month, day, year);
              // Specifier "0" to print leading zeros
   }

    
}
