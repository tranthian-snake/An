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
public class SumOfDigitsInt {
    public static void main(String[] args) {
        int number, sum;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        number= scanner.nextInt();
        sum=0;
        while(number>0){
            int i= number%10;
            sum=sum+i;
            number/=10;
        }
        System.out.println("The sum of all digits is: "+sum);
    }
}
