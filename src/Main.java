import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String [] args) throws Exception {
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        int movieCount = 0;
        String chosenMovie = "";
        //random # gen to select an index associated with a movie
        //scan through txt file until i = randNumber - 1

        // Get number of movies in txt
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            movieCount += line.split( "\n").length;
        }

        //generate random number between 1-movieCount
        int randNumber = (int) (Math.random() * movieCount) + 1;
//        System.out.println("Randomly chosen number: "+ randNumber);

        //parse through txt file randNumber times to get chosen movie
        Scanner scanner2 = new Scanner(file);
        for(int i=0; i < randNumber; i++){
            chosenMovie = scanner2.nextLine();
        }
//        System.out.println("Randomly chosen movie: " + chosenMovie);
        ConcealMovieString concealMovieString = new ConcealMovieString();
        concealMovieString.concealMovieString(chosenMovie);

    }

}
