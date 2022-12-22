public class Main {
    public static void main(String[] args) {
        StepCounter step = new StepCounter("1.9.2017");
        step.incrementSteps(10000);
        System.out.println("Am " + step.getDate() + " bin ich " + step.getSteps() + " Schritte gegangen");
    }
}
