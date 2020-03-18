package Java2_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> movie = new ArrayList<>();
        System.out.print("Enter the number of favorite movies: ");
        int size;
        size=scanner.nextInt();
        System.out.println("Enter the list of favorite movies:");
        String[]  array = new String[size];
        Scanner scanners = new Scanner(System.in);
        for(int i=0;i<size;i++){
            array[i]=scanners.nextLine();
            String movies= array[i];
            movie.add(movies);
        }
        System.out.println("List of favorite movies: "+ movie);

        movie.add("Blachki");
        System.out.println("Add new movies to the list: "+ movie);

        movie.set(2,"Try or hetr");
        System.out.println("Edit existing movie name: "+ movie);

        movie.remove(3);
        System.out.println("Delete a movie from favorites: "+ movie);

        System.out.println("Is the movie on the list? "+movie.contains("Math") );

    }
}
