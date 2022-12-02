public class Person {
    private int year;
    private int month;
    private int day;
    private String name;

    public Person(int year, int month, int day, String name){
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
    }

    public void bubbleSortDay(Person[] persArr){
        int temp;
        int n = persArr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < (n-1); j++){
                if(persArr[j-1].getDay() > persArr[j].getDay()){
                    temp = persArr[j-1].getDay();
                    persArr[j-1].setDay(persArr[j].getDay());;
                    persArr[j].setDay(temp);
                }
            }
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setName(String name) {
        this.name = name;
    }
}
