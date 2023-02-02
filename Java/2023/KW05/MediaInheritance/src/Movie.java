public class Movie extends Media {
    private int movieLength;
    private int ageRating;


    public Movie(String title, int releaseYear, String creator, String genre, int movieLength, int ageRating) {
        super(title, releaseYear, creator, genre);
        this.movieLength = movieLength;
        this.ageRating = ageRating;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Movie length in min: " + movieLength + "\nFSK: " + ageRating);
    }
}
