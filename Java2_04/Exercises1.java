package Java2_04;

import java.sql.*;

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

            String fullSelect= "select * from books";
            System.out.println("\n"+"1.The SQL statement is: "+ fullSelect);
            ResultSet fset =stmt.executeQuery(fullSelect);
            System.out.println("The records selected are:");
            while(fset.next()){
                String author= fset.getString("author");
                String title= fset.getString("title");
                double price= fset.getDouble("price");
                int qty= fset.getInt("qty");
                System.out.println(title+", "+ author+ ", "+ price+ ", "+ qty);}

            /**
             * 2
             */

            String authorSelect= "select author, title, price, qty from books where author= 'CodeLean VN'";
            System.out.println("\n"+ "\n"+"2.The SQL statement is: "+ authorSelect);
            ResultSet aset =stmt.executeQuery(authorSelect);
            System.out.println("The records selected are:");
            while(aset.next()){
                String author= aset.getString("author");
                String title= aset.getString("title");
                double price= aset.getDouble("price");
                int qty= aset.getInt("qty");
                System.out.println(title+", "+ author+ ", "+ price+ ", "+ qty);}


            /**
             * 3
             */

            String orSelect= "select id,author, title, price, qty from books where author= 'CodeLean VN' or price>=30 order by price desc, id asc";
            System.out.println("\n"+ "\n"+"3.The SQL statement is: "+ orSelect);
            ResultSet orset =stmt.executeQuery(orSelect);
            System.out.println("The records selected are:");
            while(orset.next()){
                int id= orset.getInt("id");
                String author= orset.getString("author");
                String title= orset.getString("title");
                double price= orset.getDouble("price");
                int qty= orset.getInt("qty");
                System.out.println(id+", "+title+", "+ author+ ", "+ price+ ", "+ qty);}


        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}