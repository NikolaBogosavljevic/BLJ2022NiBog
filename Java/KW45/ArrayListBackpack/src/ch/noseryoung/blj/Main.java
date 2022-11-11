package ch.noseryoung.blj;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> items = new ArrayList();

        while(true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Was möchtest du mitnehmen?\t\t\t\t0 to quit");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            String item = scan.nextLine();
            if (item.equals("0")){
                break;
            }
            for (int i = 0; i < items.size(); i++){
                if(item.equals(items.get(i))){
                    items.remove(i);
                }
            }
            items.add(item);
            System.out.println("Ich nehme mit:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println("-" + items.get(i));
            }
        }
    }
}

