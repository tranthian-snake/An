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
public class testDate {
    public static void main(String[] args) {
        Sol01.Date d1=new Sol01.Date(13, 9, 2019);
        System.out.println(d1.toString());
        d1.setDay(4);
        System.out.println(d1.toString());
        d1.setDate(5, 10, 2020);
        System.out.println(d1.toString());
    }
    
}
