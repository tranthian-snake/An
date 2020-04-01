package Java2_08;
import Java2_08.users;
import java.sql.*;
import java.util.Scanner;
import Java2_08.Login;

public class BookManager {
    private static Scanner scanner = new Scanner(System.in);

    public void Insert() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();
        ) {

            System.out.print("Enter id: ");
            String id = scanner.next();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter price: ");
            double price= scanner.nextDouble();
            System.out.print("Enter qty: ");
            int qty = scanner.nextInt();
            System.out.print("Enter author: ");
            String author = scanner.next();
            System.out.print("Add a new list:");
            String sqlInsert = "insert into books values ("  + "'" + id + "'"  + "," + "'" + name + "'" + "," + price + "," + qty + "," + "'" + author + "'" + ")";
            System.out.println("The SQL statement is: "+ sqlInsert+ "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void Update() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter id of book you want to update: ");
            String id = scanner.next();
            System.out.print("Enter new price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter new qty: ");
            int qty = scanner.nextInt();

            String sqlDelete = "update books set price="+ price+", qty="+ qty+ " where id = " + "'" + id+ "'";
            System.out.println("The SQL statement is: "+ sqlDelete+ "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println("The book has an id of: "+id+", was updated."+"\n"+"Successfully updated!");
            System.out.println(countDeleted+" records inserted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }



    public void Delete() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ){
            System.out.print("Enter id want to delete: ");
            int id = scanner.nextInt();
            String sqlDelete = "delete from books where id = " + "'" + id+ "'";
            System.out.println("The SQL statement is: "+ sqlDelete+ "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println("Id is: "+id+", was deleted."+"\n"+"Successfully deleted!");
            System.out.println(countDeleted+" records inserted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }


    public void Select() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from books limit 100";
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





    public void bookManager(){
        System.out.println("0 - to shutdown" +
                "\n 1 - to print books" +
                "\n 2 - to add a new book" +
                "\n 3 - to update an existing book" +
                "\n 4 - to remove an existing book" +
                "\n 5 - to print a list of available actions."+
                "\n Choose your action:\n"
        );
        BookManager book= new BookManager();
        int numbers;
        do {
            do {
                System.out.print("Enter action: ");
                Scanner scanner = new Scanner(System.in);
                numbers = scanner.nextInt();
            } while (numbers < 0 || numbers > 5);
            switch (numbers) {
                case 0:
                    break;
                case 1:
                    book.Select();
                    break;
                case 2:
                    book.Insert();
                    break;
                case 3:
                    book.Update();
                    break;
                case 4:
                    book.Delete();
                    break;
                case 5:
                    System.out.println("0 - to shutdown" +
                            "\n 1 - to print books" +
                            "\n 2 - to add a new book" +
                            "\n 3 - to update an existing book" +
                            "\n 4 - to remove an existing book" +
                            "\n 5 - to print a list of available actions."+
                            "\n Choose your action:\n"
                    );
                    break;
                default:
                    System.out.println("Enter action: (5 to show available actions)");
            }
        }while (numbers != 0);

    }


}

