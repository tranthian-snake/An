/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratice;

/**
 *
 * @author Tran Thi An
 */
public class testSalaryPolicy {
    public static void main(String[] args) {
        
        EmployeeFullTime e1= new  EmployeeFullTime(34.45f);
        System.out.println(e1.toString());
        System.out.println("Salary is: "+e1.getSalary());
        
        EmployeePartime e2= new  EmployeePartime(36.6f);
        System.out.println(e2.toString());
        System.out.println("Salary is: "+e2.getSalary());
    }
    
}
