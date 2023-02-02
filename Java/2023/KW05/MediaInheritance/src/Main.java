import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", 1997, "J.K. Rowling", "Fantasy", 223, 17);
        Movie movie1 = new Movie("One Piece Film: Red", 2022, "Gorō Taniguchi", "Adventure", 115, 13);
        Game game1 = new Game("The Elder Scrolls: Skyrim", 2011, "Bethesda", "RPG", 232, Game.multiOrSingle.Singleplayer);
        Music music1 = new Music("Swimming Pools", 2012, "Kendrick Lamar", "Rap", "3:51", "T-Minus");

        ArrayList<Media> media = new ArrayList<>();
        media.add(book1);
        media.add(movie1);
        media.add(game1);
        media.add(music1);


        while(true){
            System.out.println("What info do you want to see?");
            System.out.println("1: Book    2: Movie    3: Game   4: Music    5: All");
            int chooseMedia = InputHandler.intHandler(1, 5);
            if (chooseMedia == 1){
                System.out.println("**************************");
                book1.printInfo();
                System.out.println("**************************\n");
            } else if (chooseMedia == 2) {
                System.out.println("**************************");
                movie1.printInfo();
                System.out.println("**************************\n");
            } else if (chooseMedia == 3) {
                System.out.println("**************************");
                game1.printInfo();
                System.out.println("**************************\n");
            }else if (chooseMedia == 4){
                System.out.println("**************************");
                music1.printInfo();
                System.out.println("**************************\n");
            } else if (chooseMedia == 5) {
                for (Media m : media){
                    System.out.println("**************************");
                    m.printInfo();
                    System.out.println("**************************\n");
                }
            }

        }
    }


}