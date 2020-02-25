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
public class Student {
    private String name;
    private double gpa;
    
    public Student(String name, double gpa){
       this.name = name;
       this.gpa = gpa;
    }
    public Student(String name){
       this.name = name;
    }
    public Student(double gpa){
       this.gpa = gpa;
    }
    
    public Student(){
        name = "Paul Lee";
        gpa = 3.5;
    }
    
   public String getName(){
       return name;
   };
   public double setGpa(double gpa){
       return gpa;
   };

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
   
   
    
    
}
