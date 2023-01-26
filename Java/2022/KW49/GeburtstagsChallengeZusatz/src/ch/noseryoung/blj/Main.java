package ch.noseryoung.blj;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {
    public static final String delimiter = ";";

    public static ArrayList<Person> read(String csvFile) {

        ArrayList <Person> personList = new ArrayList<>();

        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;
            while ((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                Person person = initPerson(tempArr);
                personList.add(person);
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        return personList;
    }

    public static Person initPerson(String[] tempArr){
        int year = 0;
        int month = 0;
        int day = 0;
        String name = "";
        try {
            name = tempArr[0];
            day = Integer.parseInt(tempArr[3]);
            month = Integer.parseInt(tempArr[2]);
            year = Integer.parseInt(tempArr[1]);
        }catch (NumberFormatException nfe){
            System.out.println("no");
        }
        return new Person(year, month, day, name);
    }

    public static void main(String[] args) {
        String csvFile = "Personen_Aufgabe_2022-2023 (1).csv";
        ArrayList<Person> persArr = read(csvFile);
        Person person = new Person();
        person.printBirthdays(persArr);
    }
}