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
abstract public class SalaryPolicy {
    float baseSalary;
    
    public SalaryPolicy(float baseSalary){
        this.baseSalary=baseSalary;
    }
    
    abstract public float getSalary();

    @Override
    public String toString() {
        return "SalaryPolicy[" + "baseSalary=" + baseSalary + ']';
    }

}
