/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author Tran Thi An
 */
public class testStudent {
    public static void main(String[] args) {
        Student student=new Student();
        Student studentA=new Student(1,"Nguyen Van A",false);
        Student studentB=new Student(2,"Nguyen Van B",true);
        
        studentA.printInfo();
        studentB.printInfo();
        studentB.setName("Nguyen Van B2");
        studentB.printInfo();
    }
}
