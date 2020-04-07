package PracticeADF2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import PracticeADF2.Student;


public class MainMethod {
    private static Scanner scanner= new Scanner(System.in);
    private static ArrayList<Student> students= new ArrayList<>();
    public void addStudent() {
        System.out.println("Enter student’s personal details: ");
        System.out.print("Enter Student ID: ");
        String id= scanner.next();
        System.out.print("Enter Name: ");
        String name= scanner.next();
        System.out.print("Enter Address: ");
        String address= scanner.next();
        System.out.print("Enter Phone: ");
        int phone= scanner.nextInt();
        Student student= new Student(id, name, address, phone);
        students.add(student);
        System.out.println("New Student add: "+ student.toString());
    }




    public void Display() {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");


                Statement stmt= conn.createStatement();
        ) {
            System.out.println(students);
            ResultSet rset = stmt.executeQuery("select * from Student");
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





    public void Insert(Student student) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");

                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into Student values ("  + "'" + student.getStudentID() + "'"  + "," + "'" + student.getName() + "'" + "," + "'" + student.getAddress() + "'" + "," + student.getPhone() + ")";
            System.out.println("The SQL statement is: "+ sqlInsert+ "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted+" records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }



}
