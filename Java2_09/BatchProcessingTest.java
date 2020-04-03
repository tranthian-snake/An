package Java2_09;

import java.sql.*;

public class BatchProcessingTest {
    public static void main(String[] args) {
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");

                //            xử lí hàng loạt với Statement
                Statement stmt= conn.createStatement();

                //            xử lí hàng loạt với  PreparedStatement
                PreparedStatement pstmt= conn.prepareStatement(
                        "insert into books values (?, ?, ?, ?, ?)");
        ) {
            //            xử lí hàng loạt với Statement
            conn.setAutoCommit(false);

            stmt.addBatch("insert into books values (8001, 'Java ABC','Kevin Jones', 1.1, 99)");
            stmt.addBatch("insert into books values (8002, 'Java XYZ','Kevin Jones', 1.1, 99)");
            stmt.addBatch("update books set price=11.11 where id= 8001 or id= 8002");
            int[] returnCodes= stmt.executeBatch();

            System.out.print("Return codes are: ");
            for(int code: returnCodes){
                System.out.printf(code+ ", ");
            }
            System.out.println();

            conn.commit();





//            xử lí hàng loạt với  PreparedStatement
            conn.setAutoCommit(false);

            pstmt.setInt(1, 8003);
            pstmt.setString(2, "Java 123");
            pstmt.setString(3, "Kevin Jones");
            pstmt.setDouble(4, 12.34);
            pstmt.setInt(5, 88);
            pstmt.addBatch();

            pstmt.setInt(1, 8004);
            pstmt.setString(2, "Java 456");
            pstmt.addBatch();

            int[] returnCode= pstmt.executeBatch();
            System.out.print("Return codes are: ");
            for(int code: returnCodes){
                System.out.printf(code+ ", ");
            }
            System.out.println();

            conn.commit();




        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}