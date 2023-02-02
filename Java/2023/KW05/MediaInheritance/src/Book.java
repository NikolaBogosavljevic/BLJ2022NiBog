public class Book extends Media {
    private int pagesNum;
    private int chapterNum;


    public Book(String title, int releaseYear, String creator, String genre, int pagesNum, int chapterNum) {
        super(title, releaseYear, creator, genre);
        this.pagesNum = pagesNum;
        this.chapterNum = chapterNum;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of Pages: " + pagesNum + "\nNumber of Chapters: " + chapterNum);
    }
}
