package Java2_04;

import java.sql.*;

public class Exercises2 {
    public static void main(String[] args) {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt= conn.createStatement();
        ){
            /**
             * 1
             */

            String fullSelect= "select * from customers";
            System.out.println("\n"+"1.The SQL statement is: "+ fullSelect);
            ResultSet fset =stmt.executeQuery(fullSelect);
            System.out.println("The records selected are:");
            while(fset.next()){
                String id= fset.getString("CustomerID");
                String company= fset.getString("CompanyName");
                String name= fset.getString("ContactName");
                String title= fset.getString("ContactTitle");
                String address= fset.getString("Address");
                String city= fset.getString("City");
                String region= fset.getString("Region");
                String postal= fset.getString("PostalCode");
                String country= fset.getString("Country");
                String phone= fset.getString("Phone");
                String fax= fset.getString("Fax");
                System.out.println(id+", "+company+", "+name+", "+title+", "+address+", "+city+", "+region+", "+postal+", "+country+", "+phone+", "+fax);}

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
