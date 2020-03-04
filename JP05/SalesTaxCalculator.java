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
public class SalesTaxCalculator {
    public static void main(String[] args) {
        int price;
        double actualprice,salestax,totalprice,totalactual, totalsales;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price =scanner.nextInt();
        totalactual=0; 
        totalsales=0;
        totalprice=price;
        while(price!=-1){
            actualprice=price-price*0.07;
            salestax=price-actualprice;
            System.out.printf("Actual Price is: $%.00f%n", actualprice);
            System.out.printf("Sales Tax is: $%.00f%n", salestax);
            
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price =scanner.nextInt();
            totalprice=totalprice+price;
            totalactual=totalactual+actualprice; 
            totalsales=totalsales+salestax;
        }
        System.out.printf("Total Price is: $%.00f%n", totalprice+1);
        System.out.printf("Total Actual Price is: $%.00f%n", totalactual);
        System.out.printf("Total Sales Tax is: $%.00f%n", totalsales);
        System.out.println("End!");
    }
}
