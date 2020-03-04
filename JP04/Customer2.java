/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;

/**
 *
 * @author Tran Thi An
 */
public class Customer2 {
    private int ID;
    private String name;
    private char gender;
    
    public Customer2(int ID, String name, char gender){
        this.ID=ID;
        this.name=name;
        if(gender=='m'||gender=='f'){
        this.gender=gender;
        }else{
        System.out.println("Retype");
        }  
    }
    public int getID(){
        return ID;
    }
    public String getname(){
        return name;
    }
    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Customer2{" +name +'('+ ID +')'+ '}';
    }
    
}
