public class Game extends Media {
    private int fullCompletionHours;
    private multiOrSingle multiOrSingle;

    enum multiOrSingle {
        Singleplayer,
        Multiplayer,
        Both
    }


    public Game(String title, int releaseYear, String creator, String genre, int fullCompletionHours, multiOrSingle multiOrSingle) {
        super(title, releaseYear, creator, genre);
        this.fullCompletionHours = fullCompletionHours;
        this.multiOrSingle = multiOrSingle;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Hours for 100%: " + fullCompletionHours + "\nMultiplayer or Singleplayer: " + multiOrSingle);
    }
}
