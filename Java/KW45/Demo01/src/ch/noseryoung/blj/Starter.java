package ch.noseryoung.blj;

import java.util.*;

public class Starter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, favoritecolor, bestfriend;

        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Favorite color: ");
        favoritecolor = sc.nextLine();
        System.out.print("Bestfriend: ");
        bestfriend = sc.nextLine();

        while (true) {
            PersonManager person = new PersonManager(name);
            person.setBestfriend(bestfriend);
            person.setFavoriteColor(favoritecolor);

            System.out.println("\nWhat do you want to do?");
            System.out.println("1: View current information\t\t2: Change Information");

            String choice = sc.nextLine();

            if (choice.equals("1")) {
                person.presentYourself();
            } else if (choice.equals("2")) {

                System.out.println("Which info do you want to change?");
                System.out.println("|\tName\t|\tFavorite color\t|\tBestfriend\t|\tEverything\t|");
                choice = sc.nextLine();

                if (choice.equals("Name")) {

                    System.out.print("Name: ");
                    name = sc.nextLine();

                } else if (choice.equals("Favorite color")) {

                    System.out.print("Favorite color: ");
                    favoritecolor = sc.nextLine();

                } else if (choice.equals("Bestfriend")) {

                    System.out.print("Bestfriend: ");
                    bestfriend = sc.nextLine();

                } else if (choice.equals("Everything")) {

                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Favorite color: ");
                    favoritecolor = sc.nextLine();
                    System.out.print("Bestfriend: ");
                    bestfriend = sc.nextLine();
                }
            }
        }
    }

}
