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
public class InputValidation {
    public static void main(String[] args) {
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number between 0-10 or 90-100: ");
        number=scanner.nextInt();
        while(number<0 ||number>10&& number<90||number>100){
            System.out.println("Invalid input, try again...");
            System.out.print("Enter a number between 0-10 or 90-100: ");
            number=scanner.nextInt();
        }
        System.out.println("You have enterd: "+number);
    }
}
