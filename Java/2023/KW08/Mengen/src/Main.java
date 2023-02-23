import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Amount of Elements: ");
        int dimension1 = scan.nextInt();
        Set set1 = new Set(dimension1);
        System.out.print("Amount of Elements: ");
        int dimension2 = scan.nextInt();
        Set set2 = new Set(dimension2);
        while (true) {
            System.out.println("\n1: Add Element       2: Check Element       3: Get Num of Elements       4: Union       5: Intersection");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Set 1 or Set 2");
                int setChoice = scan.nextInt();
                if (setChoice == 1) {
                    System.out.print("Element: ");
                    int element = scan.nextInt();
                    set1.addElem(element);
                } else if (setChoice == 2) {
                    System.out.print("Element: ");
                    int element = scan.nextInt();
                    set2.addElem(element);
                }
            } else if (choice == 2) {
                System.out.println("Which element to check: ");
                int element = scan.nextInt();
                System.out.print("Set 1: ");
                set1.isElem(element);
                System.out.print("\nSet 2: ");
                set2.isElem(element);
            } else if (choice == 3) {
                System.out.println("Set 1: " + set1.getNumberOfElem());
                System.out.println("Set 2: " + set2.getNumberOfElem());
            } else if (choice == 4) {
                set1.union(set2);
            } else if (choice == 5) {
                set1.intersection(set2);
            }
        }
    }
}