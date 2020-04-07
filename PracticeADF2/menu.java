package PracticeADF2;

import PracticeADF2.Student;

import java.util.Scanner;

public class menu {
    private static Student student;

    public static void main(String[] args) {
        System.out.println(
                "1. Add student records" + "\n"+ "2. Display student records" + "\n"
                + "3. Save" + "\n"+ "4. Exit" + "\n"+
                "Choose your action:" + "\n");

        MainMethod list= new MainMethod();


        int number;
        do{
            do{
                System.out.println("Enter action: (4 to show available actions)");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();

            }while (number < 0 || number > 4);
            switch (number) {
                case 1:
                    list.addStudent();
                    break;
                case 2:
                    list.Display();
                    break;
                case 3:
                    list.Insert(student);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter action: (4 to show available actions)");
            }
        }while (number != 0);
    }
}
