/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP05;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Tran Thi An
 */
public class AverageWithInputValidation {
    public static void main(String[] args) {
        double sum, average;
        int[] array = new int[3];
        Scanner scanner= new Scanner(System.in);
        sum=0;
        for(int i=0;i<array.length;i++){
             for(int stt=1;stt<4;stt++){
            System.out.print("Enter the mark (0-100) for student "+stt+": ");
            array[i]=scanner.nextInt();
            while(array[i]<0||array[i]>100){
            System.out.println("Invalid input, try again...");
            System.out.print("Enter the mark (0-100) for student "+stt+": ");
            array[i]=scanner.nextInt();
            }
            sum=sum+array[i];
             }
             average=sum/array.length;
             System.out.printf("The average is: %.2f%n", average);
             break;
        }
    }
}
