package com.example.demo;

import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> people = new ArrayList<>();
    private int index = 0;

    public void createPerson(String firstName, String lastName, String age, String favFood){
        people.add(new Person(firstName, lastName, age, favFood));
    }

    public void editPerson(String firstName, String lastName, String age, String favFood){
        people.get(index).setLastName(lastName);
        people.get(index).setFirstName(firstName);
        people.get(index).setAge(age);
        people.get(index).setFavFood(favFood);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
}
