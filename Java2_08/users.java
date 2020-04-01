package Java2_08;
import java.util.Scanner;
public class users {
    private static Scanner scanner = new Scanner(System.in);
    private static char role;
    private int id;
    private  String username;
    private String password;

    public users(int id){
        this.id=id;
    }
    public users(String username, String password){
        this.username= username;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void setRole(char role) {
        users.role = role;
    }

    public static char getRole() {
        return role;
    }
}
