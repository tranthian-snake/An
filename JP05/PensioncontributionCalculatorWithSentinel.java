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
public class PensioncontributionCalculatorWithSentinel {
    public static void main(String[] args) {
        int salary, age;
        double employee, employer, total;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        salary= scanner.nextInt();
        
        while(salary!=-1){
            System.out.print("Enter the age: ");
            age= scanner.nextInt();
        if(age<=55){
            employee=salary*0.2;
            employer=salary*0.17;
            total=employee+employer;
            System.out.printf("The employee'contribution is: %.2f%n",employee);
            System.out.printf("The employer'contribution is: %.2f%n",employer);
            System.out.printf("The total contribution is: %.2f%n",total);
        }else if(age<=60){
            employee=salary*0.13;
            employer=salary*0.13;
            total=employee+employer;
            System.out.printf("The employee'contribution is: %.2f%n",employee);
            System.out.printf("The employer'contribution is: %.2f%n",employer);
            System.out.printf("The total contribution is: %.2f%n",total);
        }else if(age<=65){
            employee=salary*0.075;
            employer=salary*0.09;
            total=employee+employer;
            System.out.printf("The employee'contribution is: %.2f%n",employee);
            System.out.printf("The employer'contribution is: %.2f%n",employer);
            System.out.printf("The total contribution is: %.2f%n",total);
        }else if(age>=65){
            employee=salary*0.05;
            employer=salary*0.075;
            total=employee+employer;
            System.out.printf("The employee'contribution is: %.2f%n",employee);
            System.out.printf("The employer'contribution is: %.2f%n",employer);
            System.out.printf("The total contribution is: %.2f%n",total);
        }
        System.out.print("Enter the monthly salary: $");
        salary= scanner.nextInt();
        
        }
        System.out.println("End!");
    }
}
