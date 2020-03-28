package Java2_07;

import java.sql.*;
public class Exercises1 {
    public static void main(String[] args) {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt= conn.createStatement();
        ) {
            /**
             * 1
             */
            String strUpdate1 ="update books set price= price+price*0.5 where title ='A Cup of java'";
            System.out.println("The SQL statement is: "+ strUpdate1+ "\n");
            int countUpdated1 =stmt.executeUpdate(strUpdate1);
            System.out.println(countUpdated1+ " records affected.\n");

            String strSelect1= "select * from books where title ='A Cup of java'";
            System.out.println("The SQL statement is: "+ strSelect1+ "\n");
            ResultSet rset1 =stmt.executeQuery(strSelect1);
            while(rset1.next()){
                System.out.println(rset1.getInt("id")
                        +", "+ rset1.getString("author")
                        +", "+ rset1.getString("title")
                        + ", "+rset1.getDouble("price")
                        +", "+ rset1.getInt("qty"));
            }

            /**
             * 2
             */
            String strUpdate2 ="update books set qty=0 where title ='A Teaspoon of java'";
            System.out.println("The SQL statement is: "+ strUpdate2+ "\n");
            int countUpdated2 =stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2+ " records affected.\n");

            String strSelect2= "select * from books where title ='A Teaspoon of java'";
            System.out.println("The SQL statement is: "+ strSelect2+ "\n");
            ResultSet rset2 =stmt.executeQuery(strSelect2);
            while(rset2.next()){
                System.out.println(rset2.getInt("id")
                        +", "+ rset2.getString("author")
                        +", "+ rset2.getString("title")
                        + ", "+rset2.getDouble("price")
                        +", "+ rset2.getInt("qty"));
            }



        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
