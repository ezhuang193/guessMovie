import java.util.Scanner;

public class Game {
    public void Game(String chosenMovie, String hiddenMovie){
//        read user input, parse movie string, replace underscores with letters using index

//        strings immutable so have to use char array. char[] chosenMovie
//        loop through chosenMovieCharArray to find userinput.equals(chosenMovieCharArray[i])
//        use indices to change underscores to chars in hiddenMovie within that loop
//        char[] guessedLetters = new char[chosenMovie.length()+1];
        String guessedLetters = "";
        System.out.println("guessedletters length: "+guessedLetters.length());
        char[] chosenMovieCharArray =  chosenMovie.toCharArray(); // char array for comparing user input to chosenMovie
        char[] hiddenMovieCharArray =  hiddenMovie.toCharArray(); // string created for user guessing.

        System.out.println("chosenMovie: "+chosenMovie);
        System.out.println("hiddenMovie: "+hiddenMovie);

        Scanner scanner = new Scanner(System.in);
        for(int i=chosenMovie.length(); i>0; i--){
            System.out.println("Type one letter and press enter. You have " + i + " guesses left.");
            char guess = scanner.next(".").charAt(0); // turn both into chars to make it easier to compare? is it easier?
            System.out.println("user input: "+guess); // but add functionality to disallow repeat guesses. ie guessedLetters=sss
            for(int j=0; j< chosenMovieCharArray.length; j++){
//                System.out.println(chosenMovieCharArray[j]);
                if(guess == chosenMovieCharArray[j]){// consolidate these two if loops? updatedHiddenMovie needs to print regardless of correct guess or not
                    if(!guessedLetters.contains(Character.toString(guess))){// create guess rules. ie no duplicates in guessedLetters
                        guessedLetters += guess;
                    }
                    hiddenMovieCharArray[j] = guess; //replace underscore at j index with that char
//                    System.out.println("hiddenmoviechararray: "+hiddenMovieCharArray[j]);
                    String updatedHiddenMovie = CharArrayToString(hiddenMovieCharArray);
                    System.out.println(updatedHiddenMovie);
                }
                System.out.println("j index: "+j);
                System.out.println("guessed lettesr: "+guessedLetters);
            }
        }
    }
    //do you need a separate method to perform a one line operation? this takes more overhead probably
    private String CharArrayToString(char[] hiddenMovieCharArray){
        String updatedHiddenMovie = new String(hiddenMovieCharArray);

        return updatedHiddenMovie;
    }
}
