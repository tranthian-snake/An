/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;
/**
 *
 * @author Tran Thi An
 */
public class testStudent { 
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.toString());
        
        Student s2 = new Student("Peter Tan",3.9);
        System.out.println(s2.toString());
        
    }
    
    
}
