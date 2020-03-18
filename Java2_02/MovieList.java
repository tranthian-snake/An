package Java2_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> movie = new ArrayList<>();
        System.out.println("Enter the number of favorite movies");
        int size;
        size=scanner.nextInt();
        for(int i=0;i<size;i++){
            movie=scanner.next();
        }

        System.out.println("Enter the list of favorite movies");
    }
}
