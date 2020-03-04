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
public class Add2Integer {
    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first integer: ");
        number1= scanner.nextInt();
        System.out.println("Enter second integer: ");
        number2= scanner.nextInt();
        sum=number1+number2;
        System.out.println("The sum is: "+sum);
        scanner.close();
    }
}
