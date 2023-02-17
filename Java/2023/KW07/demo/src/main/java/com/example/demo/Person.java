package com.example.demo;

public class Person {
    private String firstName;
    private String lastName;
    private String age;
    private String favFood;

    public Person(String firstName, String lastName, String age, String favFood){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favFood = favFood;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getFavFood() {
        return favFood;
    }
}
