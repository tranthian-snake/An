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
public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;
        int inDigit;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber=scanner.nextInt();
        inDigit=0;
        while(inNumber>0){
            int i=inNumber%10;
            inDigit=inDigit*10+i;
            inNumber/=10;
        }
        System.out.println("The reverse is: "+inDigit);
    }
}
