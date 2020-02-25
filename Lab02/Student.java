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
public class Student {
    private int id;
    private String name;
    private boolean gender; 
    
    public Student(){
        id=0;
        name="Null";
        gender= false;
    }
    
    public Student(int id, String name, boolean gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public Student(String name, boolean gender){
        this.name=name;
        this.gender=gender;
    }
    
    public int getId(){
        return id;
    } 
    public String getName(){
        return name;
    }
    public boolean isMale(){
        return gender;
    }
    public void printInfo(){
        System.out.println("Id="+id+", Name="+name+",Gender="+gender);
    }
    public void setId(int id2){
        this.id=id2;
    }
    public void setMale(boolean gender2){
        this.gender=gender2;
    }
    public void setName(String name2){
        this.name=name2;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + '}';
    }
    
    
}
