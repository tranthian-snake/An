/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

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
       System.out.println("name="+name);
       System.out.println("gpa="+gpa);
   }
   public String getName(){
       return name;
   }
   public double getGpa(){
       return gpa;
   }
   public void setName(String name2){
       this.name=name2;
   }
   public void setGpa(double gpa2){
       this.gpa=gpa2;
   }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
   
    
    
}
