package Java2_02;

import java.util.Scanner;
import  java.util.Arrays;

public class Temprature {
    public static void main(String[] args) {
        double sum, average;
        int n;
        System.out.print("Number of days to enter temperature: ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        int[] array = new int[n];
        Scanner fiveinteger = new Scanner(System.in);
        System.out.println("Enter "+n+" the temperature of n consecutive days");
        sum=0;
        for(int i=0;i<array.length;i++){
                array[i]=fiveinteger.nextInt();
                sum=sum+array[i];
            }
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+", types value was "+ array[i]);
        }

            average=sum/array.length;
            System.out.printf("Average is: %.2f%n", average);
            int y=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>average) {
                y++;
            }
        }
        System.out.println("Have "+y+" days higher than average");
    }

 }
