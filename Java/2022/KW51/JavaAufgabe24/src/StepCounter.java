public class StepCounter {
    private String date;
    private int steps;

    public StepCounter(String date) {
        this.date = date;
    }

    public void incrementSteps(int step) {
        for (int i = 0; i < step; i++){
            steps++;
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
