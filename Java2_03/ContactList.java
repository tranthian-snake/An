package Java2_03;

import Java2_03.Contact;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList{
    private ArrayList<String> name= new ArrayList<>();
    private ArrayList<String> phone= new ArrayList<>();
    Scanner scanner= new Scanner(System.in);

    public void addContact() {
        System.out.println("Enter new contact name: ");
        String newname= scanner.next();
        System.out.println("Enter phone number: ");
        String newphone= scanner.next();
        name.add(newname);
        phone.add(newphone);
        System.out.println("New contact add: "+ newname+ " -> " + newphone);
    }
    public void updateContact() {
        System.out.println("Enter old contact name: ");
        String oldname= scanner.next();
        System.out.println("Enter new contact name: ");
        String newname= scanner.next();
        name.set(name.indexOf(oldname), newname);
        int index=name.indexOf(oldname)+1;
        if(index>=0){
            index=name.indexOf(oldname)+1;
        }if(index == name.size()){
            index=name.indexOf(oldname)-1;
        }
        System.out.println("Update: Contact " +oldname+" -> "+ phone.get(index)+" : "+ newname+" -> "+ phone.get(index));
    }

    public void removeContact() {
        System.out.println("Enter contact name want to delete: ");
        String deletename= scanner.next();
        name.remove(deletename);
        int index=name.indexOf(deletename);
        if(index<0){
            index=name.indexOf(deletename)+1;
        }
        phone.remove(index);
        System.out.println(deletename+", was deleted."+"\n"+"Successfully deleted!");
    }

    public void searchContact() {
        System.out.println("Enter exiting contact name: ");
        String searchname= scanner.next();
        System.out.println("Name: "+searchname+" phone number is "+ phone.get(name.indexOf(searchname)));
    }

    public void displayContact() {
        for(int i = 0;i<name.size();i++){
            System.out.println((i+1) + "." + name.get(i) + " -> " + phone.get(i));
        }
    }
}
