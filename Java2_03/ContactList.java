package Java2_03;

import JP04.MyPoint;

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


    public static void main(String[] args) {
        System.out.println("Starting phone..." + "\n" + "Available actions: " + "\n" + "0 - to shutdown" + "\n"
                + "1 - to print contact" + "\n" + "2 - to add a new contact" + "\n"
                + "3 - to update existing an existing contact" + "\n" + "4 - to remove an existing contact" + "\n"
                + "5 - query if an existing contact exist" + "\n" + "6 - to print a list of available actions."
                + "\n" + "Choose your action:" + "\n");

        ContactList list = new ContactList();


         int number;
     do{
        do{
            System.out.println("Enter action: (6 to show available actions)");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

        }while (number < 0 || number > 6);
        switch (number) {
            case 0:
                System.out.println("Shutting down...");
                break;
            case 1:
                list.displayContact();
                break;
            case 2:
                list.addContact();
                break;
            case 3:
                list.updateContact();
                break;
            case 4:
                list.removeContact();
                break;
            case 5:
                list.searchContact();
                break;
            case 6:
                System.out.println("Starting phone..." + "\n" + "Available actions: " + "\n" + "0 - to shutdown" + "\n"
                        + "1 - to print contact" + "\n" + "2 - to add a new contact" + "\n"
                        + "3 - to update existing an existing contact" + "\n" + "4 - to remove an existing contact" + "\n"
                        + "5 - query if an existing contact exist" + "\n" + "6 - to print a list of available actions."
                        + "\n" + "Choose your action:" + "\n");

                System.out.println("Enter action: (6 to show available actions)");
                break;
            // Các trường hợp còn lại
            default:
                System.out.println("Enter action: (6 to show available actions)");
        }
     }while (number != 0);
    }
}
