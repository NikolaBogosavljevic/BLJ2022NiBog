package ch.noseryoung.blj;

public class PersonManager {
    private String name;
    private String favoriteColor;
    private String bestfriend;

    public PersonManager(String name) {
        this.name = name;
    }
    public void presentYourself() {
        System.out.println("Name: " + name + "\nFavorite color: " + favoriteColor + "\nBestfriend: " + bestfriend);
    }

    public void setBestfriend(String bestfriend) {
        this.bestfriend = bestfriend;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getBestfriend() {
        return bestfriend;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
