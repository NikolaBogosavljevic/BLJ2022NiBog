public class Music extends Media {
    private String songLength;
    private String producer;


    public Music(String title, int releaseYear, String creator, String genre, String songLength, String producer) {
        super(title, releaseYear, creator, genre);
        this.songLength = songLength;
        this.producer = producer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Song length: " + songLength + "\nProducer: " + producer);
    }
}
