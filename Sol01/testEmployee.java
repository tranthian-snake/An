/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01;

/**
 *
 * @author Tran Thi An
 */
public class testEmployee {
    public static void main(String[] args) {
        Sol01.Employee e1=new Sol01.Employee(1, "Tiêu Cảnh", "Đình", 20000);
        System.out.println(e1.toString());
        System.out.println("Name= "+e1.getName());
        System.out.println("Annual Salary= "+e1.getAnnualSalary());
        System.out.println("Raise Salary= "+e1.raiseSalary(30));
        
        
    }
}
