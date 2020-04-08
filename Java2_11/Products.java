package Java2_11;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import Ex01.Product;
import Java2_11.Item;
import PracticeADF2.Student;

public class Products {
    private static Scanner scanner= new Scanner(System.in);
    private static ArrayList<Item> products= new ArrayList<>();

    public void getProducts() {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");


                Statement stmt= conn.createStatement();
        ) {
            ResultSet rset = stmt.executeQuery("select * from books");
            ResultSetMetaData rsetMD=  rset.getMetaData();

            int numColumns= rsetMD.getColumnCount();

            for(int i=1; i<=numColumns; ++i){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for(int i=1; i<=numColumns; ++i){
                System.out.printf("%-30s", "("+rsetMD.getColumnClassName(i)+")");
            }
            System.out.println();

            while(rset.next()){
                for(int i=1; i<=numColumns; ++i){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void addCart() {
        System.out.print("Nhập mã của sản phẩm muốn thêm vào giỏ hàng: ");
        String product_id= scanner.next();
        try(
                Connection conn=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt= conn.createStatement();
        ){
            String strSelect= "select * from books where product_id="+ product_id;
            System.out.println("The SQL statement is: "+ strSelect+ "\n");
            ResultSet rset =stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            while(rset.next()){
                String proid= rset.getString("product_id");
                String name= rset.getString("product_name");
                double price= rset.getDouble("price");
                int qty= rset.getInt("qty");
                int discount= rset.getInt("discount");
                System.out.println(proid+", "+ name+ ", "+ price+", "+ qty+ ", "+ discount);
                Item product= new Item(proid, name, price, qty, discount);
                products.add(product);
                System.out.println("Sản phẩm đã được thêm vào giỏ hàng: \n"+ products );

            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
