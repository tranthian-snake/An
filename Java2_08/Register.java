package Java2_08;

import java.sql.*;
import java.util.Scanner;
import Java2_08.users;

public class Register {
    private static Scanner scanner=new Scanner(System.in);
    public void register(users user) {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt= conn.createStatement();
        ){
            System.out.print("Sign up: \n"+"Enter username: ");
            String username= scanner.next();
            System.out.print("Enter password: ");
            String password= scanner.next();
            System.out.print("Enter role:");
            int role=scanner.nextInt();
            String sqlInsert= "insert into users(username, password, role) values (" +"'"+username+"'"+" ,'"+password+"', "+ role+")";
            System.out.println("The SQL statement is: "+ sqlInsert+ "\n");
            int countInserted =stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");

            String strSelect= "select * from users";
            System.out.println("The SQL statement is: "+ strSelect+ "\n");
            ResultSet rset =stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id")
                        +", "+ rset.getString("username")
                        +", "+ rset.getString("password")
                        + ", "+rset.getDouble("role"));
            }

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
