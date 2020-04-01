package Java2_08;

import java.sql.*;
import java.util.Scanner;
import Java2_08.users;

public class Login {
    private static Scanner scanner=new Scanner(System.in);
    boolean loginnext;
    public void login(users user) {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt= conn.createStatement();
        ){
            System.out.print("Log in: \n"+"Enter username: ");
            String username= scanner.next();
            System.out.print("Enter password: ");
            String password= scanner.next();
            String login= "select * from users where username= "+"'"+ user.getUsername()+"',"+"password= "+"'"+ user.getPassword()+"'";
            ResultSet rset =stmt.executeQuery(login);
            if(rset.next()){
                System.out.println("Logged in successfully!");
                loginnext=true;
            }else {
                System.out.println("Login failed!");
            }



        } catch (
                SQLException ex){
            ex.printStackTrace();
        }
    }
}
