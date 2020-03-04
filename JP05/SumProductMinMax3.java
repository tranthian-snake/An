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
public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3,sum,product,min,max;
        Scanner scanner= new Scanner(System .in);
        System.out.println("Enter 1st integer: ");
        number1= scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        number2= scanner.nextInt();
        System.out.println("Enter 3rd integer: ");
        number3= scanner.nextInt();
        sum=number1+number2+number3;
        System.out.println("The sum is: "+sum);
        product=number1*number2*number3;
        System.out.println("The product is: "+product);
        min=number1;
        if(number2<min){
            min=number2;
        }
        if(number3<min){
            min=number3;
        }
        System.out.println("The min is: "+min);
        max=number1;
        if(number2>max){
            max=number2;
        }
        if(number3>max){
            max=number3;
        }
        System.out.println("The min is: "+max);
        
    }
}
