package Java2_08;


import java.util.Scanner;

public class eBookStore {
    private static Scanner scanner = new Scanner(System.in);
    private static users user;

    public static void main(String[] args) {
        System.out.println("0 - to shutdown" +
                "\n 1 - to sign up" +
                "\n 2 - to log in" +
                "\n 3 - to print a list of available actions."+
                "\n Choose your action:\n"
        );
        Register register= new Register();
        Login login= new Login();
        BookManager book= new BookManager();
        CustomerManager customerManager= new CustomerManager();



        int number;

        do {
            do {
                System.out.print("Enter action: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();

            } while (number < 0 || number > 3);
            switch (number) {
                case 0:
                    break;
                case 1:
                    register.register(user);
                    break;

                case 2:
                    login.login(user);
                    if(login.loginnext= true){
                        System.out.println("0 - to shutdown" +
                                "\n 1 - book management" +
                                "\n 2 - customer management" +
                                "\n 3 - to print a list of available actions."+
                                "\n Choose your action:\n"
                        );
                        int n;

                        do {
                            do {
                                System.out.print("Enter action: ");
                                Scanner scanner = new Scanner(System.in);
                                n = scanner.nextInt();

                            } while (n < 0 || n > 3);
                            switch (n) {
                                case 0:
                                    break;
                                case 1:
                                    book.bookManager();
                                    break;

                                case 2:
                                    customerManager.customerManager();
                                    break;
                                case 3:
                                    System.out.println("0 - to shutdown" +
                                            "\n 1 - book management" +
                                            "\n 2 - customer management" +
                                            "\n 3 - to print a list of available actions."+
                                            "\n Choose your action:\n"
                                    );
                                    break;
                                default:
                                    System.out.println("Enter action: (3 to show available actions)");
                            }
                        }while (n != 0);

                    }else{
                        System.out.println(".................................................");
                    }
                    break;
                case 3:
                    System.out.println("0 - to shutdown" +
                            "\n 1 - to sign up" +
                            "\n 2 - to log in" +
                            "\n 3 - to print a list of available actions."+
                            "\n Choose your action:\n"
                    );
                    break;
                default:
                    System.out.println("Enter action: (3 to show available actions)");
            }
        }while (number != 0);

    }
}











