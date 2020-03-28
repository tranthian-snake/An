package Java2_07;

import java.sql.*;
public class Exercises2 {
    public static void main(String[] args) {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt= conn.createStatement();
        ) {
            /**
             * 1
             */

            String strUpdate1 ="update categories set CategoryName='SeaFood VN' where CategoryName='Seafood'";
            System.out.println("1.The SQL statement is: "+ strUpdate1+ "\n");
            int countUpdated1 =stmt.executeUpdate(strUpdate1);
            System.out.println(countUpdated1+ " records affected.\n");

            String strSelect1= "select * from categories where CategoryName='SeaFood VN'";
            System.out.println("The SQL statement is: "+ strSelect1+ "\n");
            ResultSet rset1 =stmt.executeQuery(strSelect1);
            while(rset1.next()){
                System.out.println(rset1.getInt("CategoryID")
                        +", "+ rset1.getString("CategoryName")
                        +", "+ rset1.getString("Description")
                        +", "+ rset1.getString("Picture"));
            }

            /**
             * 2
             */

            String strUpdate2 ="update customers set Address='1A Yet Kieu - Ha Noi' where CustomerID='FRANK'";
            System.out.println("2.The SQL statement is: "+ strUpdate2+ "\n");
            int countUpdated2=stmt.executeUpdate(strUpdate2);
            System.out.println(countUpdated2+ " records affected.\n");

            String strSelect2= "select * from customers where CustomerID='FRANK'";
            System.out.println("The SQL statement is: "+ strSelect2+ "\n");
            ResultSet rset2 =stmt.executeQuery(strSelect2);
            while(rset2.next()){
                System.out.println(rset2.getString("CustomerID")
                +", "+ rset2.getString("CompanyName")
                +", "+ rset2.getString("ContactName")
                 +", "+ rset2.getString("ContactTitle")
                 +", "+ rset2.getString("Address")
              +", "+ rset2.getString("City")
              +", "+ rset2.getString("Region")
                  +", "+ rset2.getString("PostalCode")
                 +", "+ rset2.getString("Country")
                  +", "+ rset2.getString("Phone")
                 +", "+ rset2.getString("Fax"));
            }

            /**
             * 3
             */

            String strUpdate3 ="update products set UnitPrice= UnitPrice+ UnitPrice*0.1 where CategoryID=5 or CategoryID=7 or CategoryID=8";
            System.out.println("3.The SQL statement is: "+ strUpdate3+ "\n");
            int countUpdated3=stmt.executeUpdate(strUpdate3);
            System.out.println(countUpdated3+ " records affected.\n");

            String strSelect3= "select * from products where CategoryID=5 or CategoryID=5 or CategoryID=7 or CategoryID=8";
            System.out.println("The SQL statement is: "+ strSelect3+ "\n");
            ResultSet rset3=stmt.executeQuery(strSelect3);
            while(rset3.next()){
                System.out.println(rset3.getString( "ProductID")
                                +", "+ rset3.getString("ProductName")
                                +", "+ rset3.getString("SupplierID")
                                +", "+ rset3.getString("CategoryID")
                                +", "+ rset3.getString("QuantityPerUnit")
                                +", "+ rset3.getString("UnitPrice")
                                +", "+ rset3.getString("UnitsInStock")
                                +", "+ rset3.getString("UnitsOnOrder")
                                +", "+ rset3.getString("ReorderLevel")
                        +", "+ rset3.getString("Discontinued"));
            }

            /**
             * 4
             */

            String strUpdate4 ="update orders set ShipVia=3 where OrderID =10313";
            System.out.println("4.The SQL statement is: "+ strUpdate4+ "\n");
            int countUpdated4=stmt.executeUpdate(strUpdate4);
            System.out.println(countUpdated4+ " records affected.\n");

            String strSelect4= "select * from orders where OrderID =10313";
            System.out.println("The SQL statement is: "+ strSelect4+ "\n");
            ResultSet rset4=stmt.executeQuery(strSelect4);
            while(rset4.next()){
                System.out.println(rset4.getInt( "OrderID")
                +", "+ rset4.getString("CustomerID")
                +", "+ rset4.getInt("EmployeeID")
                +", "+ rset4.getDate("OrderDate")
                +", "+ rset4.getDate("RequiredDate")
                +", "+ rset4.getDate("ShippedDate")
                +", "+ rset4.getInt("ShipVia")
                +", "+ rset4.getDouble("Freight")
                +", "+ rset4.getString("ShipName")
                +", "+ rset4.getString("ShipAddress")
                +", "+ rset4.getString("ShipCity")
                +", "+ rset4.getString("ShipRegion")
                +", "+ rset4.getString("ShipPostalCode")
                +", "+ rset4.getString("ShipCountry"));

            }



        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
