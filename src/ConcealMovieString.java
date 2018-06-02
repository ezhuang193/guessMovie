public class ConcealMovieString {
    public void concealMovieString(String chosenMovie){
        //receives movie title, replaces alphanumerics with underscores and preserves whitespace
//        String[] movieArray = chosenMovie.split(" ");
//        String movieString = "";
//
//        //concatenating by index would add an extra space at the end
//        for(int i=0; i < movieArray.length; i++){
//            System.out.println("movie space index " + i);
//            System.out.println(movieArray[i]);
//            movieString += movieArray[i] + " ";
//        }
//        String trimmedMovie = trim(movieString); // string with all chars replaced by underscore and whitespace
//        System.out.println("movieString: " +movieString);
//        System.out.println("Guessing string: " +trimmedMovie);

//        call Game.java and pass in both String trimmedMovie and char[] trimmedMovieChar
//
//        or dont need chars? loop through movieString to find userinput.equals(movieString[i])
//        use indices to change underscores to chars in trimmedMovie within that loop
//        strings immutable so have to use char array. char chosenMovie[]
        String hiddenMovie= "";
        chosenMovie = chosenMovie.replaceAll("[!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}]]", "");// remove symbols
        hiddenMovie = chosenMovie.replaceAll("\\s+$", ""); //removes whitespace at end
        hiddenMovie = hiddenMovie.replaceAll("[a-zA-Z0-9]", "_");
        System.out.println("Selected movie: "+ chosenMovie);
        System.out.println("Guess this movie!: "+ hiddenMovie);

        Game game = new Game();
        game.Game(chosenMovie, hiddenMovie);


    }
//    public String trim(String movieString){ //replace chars with underscore and preserve whitespace
//        movieString = movieString.replaceAll("\\s+$", ""); //removes whitespace at end
//        movieString = movieString.replaceAll("[a-zA-Z0-9]", "_");
//
//        return movieString;
//    }
}
