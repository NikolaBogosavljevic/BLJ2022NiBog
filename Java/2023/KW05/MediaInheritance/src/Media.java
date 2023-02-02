public class Media {
    private String title;
    private int releaseYear;
    private String creator;
    private String genre;

    public Media(){}

    public Media(String title, int releaseYear, String creator, String genre){
        this.title = title;
        this.releaseYear = releaseYear;
        this.creator = creator;
        this.genre = genre;
    }

    public void printInfo(){
        System.out.println("Title: "+title+"\nYear: "+releaseYear+"\nCreator: "+creator+"\nGenre: "+genre);
    }
}
