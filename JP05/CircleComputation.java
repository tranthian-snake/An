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
public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, area, circumference;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius= scanner.nextDouble();
        diameter=2.0*radius;
        System.out.printf("Diameter is: %.2f%n",diameter);
        area= radius*radius*Math.PI;
        System.out.printf("Area is: %.2f%n", area);
        circumference=2*radius*Math.PI;
        System.out.printf("Circumference is: %.2f%n", circumference);
    }
}
