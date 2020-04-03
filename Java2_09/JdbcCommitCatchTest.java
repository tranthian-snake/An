package Java2_09;

import java.sql.*;

public class JdbcCommitCatchTest {
    public static void main(String[] args) throws SQLException{
        try(
                Connection conn= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&userSSL=false&serverTimezone=UTC",
                        "root","");


                Statement stmt= conn.createStatement();
        ) {
            try {
//                vô hiệu hóa tự động cam kết
                conn.setAutoCommit(false);

//                phát hành hai câu lệnh chèn
                stmt.executeUpdate("insert into books values (4001, 'Paul Chan', 'Mahjong 101', 4.4, 4)");
//                trùng lặp khóa chính, kích hoạt một SQLException
                stmt.executeUpdate("insert into books values (4002, 'Peter Chan', 'Mahjong 102', 4.4, 4)");

                conn.commit();      // cam kết thay đổi chỉ khi tất cả các báo cáo thành công


            } catch (SQLException ex) {
                System.out.println("-- Rolling back changes --");
                conn.rollback();   // quay trở lại cam kết cuối cùng
                ex.printStackTrace();
            }
        }
    }
}