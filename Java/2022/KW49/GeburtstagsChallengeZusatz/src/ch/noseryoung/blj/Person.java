package ch.noseryoung.blj;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private int year;
    private int month;
    private int day;
    private String name;

    DecimalFormat formatter = new DecimalFormat();

    public Person() {
    }

    public Person(int year, int month, int day, String name) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
    }

    public void bubbleSortDay(ArrayList<Person> persArr) {
        int n = persArr.size();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (persArr.get(j - 1).getDay() > persArr.get(j).getDay()) {
                    Person temp = persArr.get(j - 1);
                    persArr.set(j - 1, persArr.get(j));
                    persArr.set(j, temp);
                }
            }
        }
    }


    public void printBirthdays(ArrayList<Person> persArr) {
        String[] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        LocalDate date = LocalDate.now();
        for (int j = 0; j < month.length; j++) {
            System.out.println(month[j]);
            bubbleSortDay(persArr);
            for (Person person : persArr) {
                if (person.getMonth() == (j + 1)) {
                    int age = date.getYear() - person.getYear();
                    System.out.println(String.format("%5s", formatter.format(person.getDay()))  + ". " + person.getName() + " (" + age + ")");
                }
            }
            bubbleSortDay(persArr);
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
}


