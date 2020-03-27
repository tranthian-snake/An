package Java2_06;

import java.sql.*;
import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        try(
                Connection conn=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt= conn.createStatement();
        ){
            /**
             * 1
             */
            String sqlDelete= "delete from books where id>8000";
            System.out.println("1.The SQL statement is: "+ sqlDelete+ "\n");
            int countDeleted =stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted+" records deleted.\n");

            /**
             * 2
             */

            String sqlInsert= "insert into books values "+ "(8001, 'Java Code', 'Dang Kim Thi', 15.55, 55),"
                    + "(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("2.The SQL statement is: "+ sqlInsert+ "\n");
            int countInserted =stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");

            /**
             * 3
             */

            sqlInsert= "insert into books(id, title, author) values (2001, 'Java JDBC MySQL', 'ThiDK')";
            System.out.println("The SQL statement is: "+ sqlInsert+ "\n");
            countInserted =stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");

            /**
             * 4
             */
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter the id of the book you want to delete: ");
            int iddelete= scanner.nextInt();
            sqlDelete= "delete from books where id="+iddelete;
            System.out.println("1.The SQL statement is: "+ sqlDelete+ "\n");
            countDeleted =stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted+" records deleted.\n");

            /**
             * 5
             */
            System.out.println("Enter the information of the book: ");
            System.out.print("id: ");
            int id=scanner.nextInt();
            System.out.print("title: ");
            String title= scanner.next();
            System.out.print("author: ");
            String author=scanner.next();
            System.out.print("price: ");
            double price= scanner.nextDouble();
            System.out.print("qty: ");
            int qty=scanner.nextInt();
            sqlInsert= "insert into books values "+ "("+id+", "+ title+", "+ author+", "+price+", "+qty+ ")";
            System.out.println("2.The SQL statement is: "+ sqlInsert+ "\n");
            countInserted =stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");

            String strSelect= "select * from books";
            System.out.println("The SQL statement is: "+ strSelect+ "\n");
            ResultSet rset =stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id")
                        +", "+ rset.getString("author")
                        +", "+ rset.getString("title")
                        + ", "+rset.getDouble("price")
                        +", "+ rset.getInt("qty"));
            }

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

