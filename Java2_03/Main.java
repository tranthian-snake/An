package Java2_03;
import Java2_03.ContactList;

import java.util.Scanner;

public class Main {
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
