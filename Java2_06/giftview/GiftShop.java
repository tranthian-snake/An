package Java2_06.giftview;

import Java2_06.giftcontroller.GiftController;
import Java2_06.giftmodel.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GiftShop {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       ArrayList<Gift> gift = new ArrayList<>();

        int n;
        System.out.println("0 - to shutdown" +
                "\n 1 - to print gift" +
                "\n 2 - to add a new gift" +
                "\n 3 - to remove an existing gift" +
                "\n 4 - to print a list of available actions."+
                "\n Choose your action:\n"
        );
        GiftController controller = new GiftController();


        int number;

        do {
            do {
                System.out.print("Enter action: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();

            } while (number < 0 || number > 4);
            switch (number) {
                case 0:
                    break;
                case 1:
                    controller.giftSelect();
                    break;

                case 2:
                    controller.giftInsert();
                    break;

                case 3:
                    controller.giftDelete();
                    break;

                case 4:
                    System.out.println("0 - to shutdown" +
                            "\n 1 - to print gift" +
                            "\n 2 - to add a new gift" +
                            "\n 3 - to remove an existing gift" +
                            "\n 4 - to print a list of available actions."+
                            "\n Choose your action:\n"
                    );
                    break;

            }
        }while (number != 0);
    }
}