package Java2_03;
import java.util.Scanner;
public class Main extends ContactList{
    public void main(String[] args) {
        System.out.println("Starting phone..."+ "\n"+"Available actions: "+ "\n"+"0 - to shutdown"+ "\n"
                +"1 - to print contact"+ "\n"+"2 - to add a new contact"+ "\n"
                +"3 - to update existing an existing contact"+ "\n"+"4 - to remove an existing contact"+ "\n"
                +"5 - query if an existing contact exist"+ "\n"+"6 - to print a list of available actions."
                + "\n"+ "Choose your action:"+ "\n");

        System.out.println("Enter action: (6 to show available actions)");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();

        switch (number) {
            case 0:
                break;
            case 1:
                super.displayList();
                System.out.println();
                break;
            case 20:
                System.out.println("You are 20 year old");
                break;
            // Các trường hợp còn lại
            default:
                System.out.println("You are not 18 or 20 year old");
        }

    }
}
