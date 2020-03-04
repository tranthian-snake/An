/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP05;

import java.util.Scanner;

/**
 *
 * @author Tran Thi An
 */
public class IncomeTaxCaculatorWithSentinel {
    public static void main(String[] args) {
        int taxableincome;
        double taxpayable ;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the taxable income(or -1 to end): $");
        taxableincome= scanner.nextInt();
        
        while(taxableincome!=-1){
        if(taxableincome<=20000){
            taxpayable=taxableincome*0.0;
            System.out.printf("The income tax payable is: $%.2f%n", taxpayable);
        }else if(taxableincome<=40000){
            taxpayable=(taxableincome-20000)*0.1;
            System.out.printf("The income tax payable is: $%.2f%n", taxpayable);
        }else if(taxableincome<=60000){
            taxpayable=20000*0.1+(taxableincome-40000)*0.2;
            System.out.printf("The income tax payable is: $%.2f%n", taxpayable);
        }else if(taxableincome>60000){
            taxpayable=20000*0.1+20000*0.2+(taxableincome-60000)*0.3;
            System.out.printf("The income tax payable is: $%.2f%n", taxpayable);
        }
        
        System.out.print("Enter the taxable income(or -1 to end): $");
        taxableincome= scanner.nextInt();
    }
        System.out.println("End!");
    }
}
