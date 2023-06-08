public class Games implements Comparable<Games>{
    private String name;
    private boolean isGoat;
    private String bogRating;

    public Games(String name, boolean isGoat, String bogRating) {
        this.name = name;
        this.isGoat = isGoat;
        this.bogRating = bogRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGoat() {
        return isGoat;
    }

    public void setGoat(boolean goat) {
        isGoat = goat;
    }

    public String getBogRating() {
        return bogRating;
    }

    public void setBogRating(String bogRating) {
        this.bogRating = bogRating;
    }
}
