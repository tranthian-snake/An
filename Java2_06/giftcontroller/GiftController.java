package Java2_06.giftcontroller;

import Java2_06.giftmodel.Gift;

import java.sql.*;
import java.util.Scanner;

public class GiftController {
    private static Scanner scanner = new Scanner(System.in);

    public void giftInsert() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();
        ) {
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter qty: ");
            int qty = scanner.nextInt();

            System.out.print("New list add: :");
            Gift gift= new Gift(id, name, price, qty);
            String sqlInsert = "insert into books values ("  + "'" + id + "'"  + "," + "'" + name + "'" + "," + price + "," + qty + ")";
            System.out.println("2.The SQL statement is: "+ sqlInsert+ "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void giftDelete() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter id want to delete: ");
            int id = scanner.nextInt();
            String sqlDelete = "delete from books where id = " + id;
            System.out.println("2.The SQL statement is: "+ sqlDelete+ "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println("Id is: "+id+", was deleted."+"\n"+"Successfully deleted!");
            System.out.println(countDeleted+" records inserted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }


    public void giftSelect() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from books";
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}

