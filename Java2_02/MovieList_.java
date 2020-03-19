package Java2_02;

import java.util.ArrayList;
public class MovieList_ {
    private ArrayList<String> movieList=new ArrayList<>();

    public static void main(String[] args) {
        MovieList_ list =new MovieList_();
        list.addMovie("Dyqgwa");
        list.addMovie("Truan");
        list.addMovie("Manud");
        list.addMovie("Draew");
        list.addMovie("Etrysd");

        list.displayList();
        list.updateMovie(2,"Try of");
        list.removeMovie(4);
        list.findMovie("Dres");

    }

    public void addMovie(String movie) {
        movieList.add(movie);
    }

    public void displayList() {
        System.out.println("The list of favorite movies:");
        System.out.println(movieList);
    }

    public void updateMovie(int index, String movie) {
        movieList.set(index, movie);
        System.out.println("Update: Movie "+(index+1)+": "+movie);
    }

    public void removeMovie(int index) {
        String movie=movieList.get(index);
        movieList.remove(index);
        System.out.println("Remove : Movie "+(index+1));
    }

    public String findMovie(String search) {
       int position= movieList.indexOf(search);
       if(position>0){
           return movieList.get(position);
       }
       return null;
    }
}
