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
public class Swap2Integers {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("The first integer: ");
        number1=scanner.nextInt();
        System.out.println("The second integer: ");
        number2= scanner.nextInt();
        int i=number1;
        number1=number2;
        number2=i;
        System.out.println("After the swap"+" ,first integer is: "+number1+" ,second integer is: "+number2);
    }
    
}
