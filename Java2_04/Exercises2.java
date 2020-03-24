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

            String cusSelect= "select * from customers";
            System.out.println("\n"+"1.The SQL statement is: "+ cusSelect);
            ResultSet cset =stmt.executeQuery(cusSelect);
            System.out.println("The records selected are:");
            while(cset.next()){
                String id= cset.getString("CustomerID");
                String company= cset.getString("CompanyName");
                String name= cset.getString("ContactName");
                String title= cset.getString("ContactTitle");
                String address= cset.getString("Address");
                String city=cset.getString("City");
                String region= cset.getString("Region");
                String postal= cset.getString("PostalCode");
                String country= cset.getString("Country");
                String phone= cset.getString("Phone");
                String fax= cset.getString("Fax");
                System.out.println(id+", "+company+", "+name+", "+title+", "+address+", "+city+", "+region+", "+postal+", "+country+", "+phone+", "+fax);}

            /**
             * 2
             */

            String nameSelect= "select * from customers where ContactName= 'Laurence Lebihan'";
            System.out.println("\n"+"2.The SQL statement is: "+ nameSelect);
            ResultSet nset =stmt.executeQuery(nameSelect);
            System.out.println("The records selected are:");
            while(nset.next()){
                String id= nset.getString("CustomerID");
                String company= nset.getString("CompanyName");
                String name= nset.getString("ContactName");
                String title= nset.getString("ContactTitle");
                String address= nset.getString("Address");
                String city= nset.getString("City");
                String region= nset.getString("Region");
                String postal= nset.getString("PostalCode");
                String country= nset.getString("Country");
                String phone= nset.getString("Phone");
                String fax= nset.getString("Fax");
                System.out.println(id+", "+company+", "+name+", "+title+", "+address+", "+city+", "+region+", "+postal+", "+country+", "+phone+", "+fax);}

            /**
             * 3
             */

            String proSelect= "select * from  products";
            System.out.println("\n"+"3.The SQL statement is: "+ proSelect);
            ResultSet pset =stmt.executeQuery(proSelect);
            System.out.println("The records selected are:");
            while(pset.next()){
                String proid= pset.getString( "ProductID");
                String name= pset.getString("ProductName");
                String supid= pset.getString("SupplierID");
                String cateid= pset.getString("CategoryID");
                String qpu= pset.getString("QuantityPerUnit");
                String up= pset.getString("UnitPrice");
                String uis= pset.getString("UnitsInStock");
                String uoo= pset.getString("UnitsOnOrder");
                String rl= pset.getString("ReorderLevel");
                String dis= pset.getString("Discontinued");
                System.out.println(proid+", "+name+", "+supid+", "+ cateid+", "+qpu+", "+up+", "+uis+", "+uoo+", "+rl+", "+dis);}

            /**
             * 4
             */

            String priceSelect= "select * from  products where UnitPrice=6.0000";
            System.out.println("\n"+"3.The SQL statement is: "+ priceSelect);
            ResultSet prset =stmt.executeQuery(priceSelect);
            System.out.println("The records selected are:");
            while(prset.next()){
                String proid= prset.getString( "ProductID");
                String name= prset.getString("ProductName");
                String supid= prset.getString("SupplierID");
                String cateid= prset.getString("CategoryID");
                String qpu= prset.getString("QuantityPerUnit");
                double up= prset.getDouble("UnitPrice");
                int uis= prset.getInt("UnitsInStock");
                int uoo= prset.getInt("UnitsOnOrder");
                int rl= prset.getInt("ReorderLevel");
                int dis= prset.getInt("Discontinued");
                System.out.println(proid+", "+name+", "+supid+", "+ cateid+", "+qpu+", "+up+", "+uis+", "+uoo+", "+rl+", "+dis);}

            /**
             * 5
             */

            String orderSelect= "select * from  orders";
            System.out.println("\n"+"3.The SQL statement is: "+ orderSelect);
            ResultSet oset =stmt.executeQuery(orderSelect);
            System.out.println("The records selected are:");
            if(oset.next()){
                int oid= oset.getInt( "OrderID");
                String cid= oset.getString("CustomerID");
                int eid= oset.getInt("EmployeeID");
                Date odate= oset.getDate("OrderDate");
                Date redate= oset.getDate("RequiredDate");
                Date shidate= oset.getDate("ShippedDate");
                int sv= oset.getInt("ShipVia");
                double fre= oset.getDouble("Freight");
                String sn= oset.getString("ShipName");
                String sa= oset.getString("ShipAddress");
                String sci= oset.getString("ShipCity");
                String sr= oset.getString("ShipRegion");
                String spc= oset.getString("ShipPostalCode");
                String sco= oset.getString("ShipCountry");
                System.out.println(oid+", "+cid+", "+eid+", "+ odate+", "+redate+", "+shidate+", "+sv+", "+fre+", "+sn+", "+sa+", "+sci+", "+sr+", "+spc+", "+sco);}

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
