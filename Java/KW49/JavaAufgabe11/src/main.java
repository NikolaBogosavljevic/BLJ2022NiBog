import java.util.*;

public class main {
    public static void computeDay(int day, int month, int year){

        int[] Monate = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        int[] Jahrhundert = {2, 0, 6, 4};

        int y12 = year / 100;
        int y34 = year % 100;
        int first = y34 / 4 + y34;

        int second = first + Monate[month-1];

        int third = second + day;

        int fourth = third + Jahrhundert[y12-18];

        int fifth = 0;
        if(year % 400 == 0 && month == 1 || year % 400 == 0 && month == 2){

            fifth = fourth - 1;

        }else if (year % 4 == 0 && month == 1 && year % 100 != 0 || year % 4 == 0 && month == 2 && year% 100 != 0){

            fifth = fourth - 1;

        } else {
            fifth = fourth;
        }


        int sixth = fifth % 7;

        System.out.print(day + "." + month + "." + year + ": ");

        if (sixth == 2){
            System.out.println("Montag");
        } else if (sixth == 3){
            System.out.println("Dienstag");
        } else if (sixth == 4){
            System.out.println("Mittwoch");
        } else if (sixth == 5){
            System.out.println("Donnerstag");
        } else if (sixth == 6){
            System.out.println("Freitag");
        } else if (sixth == 0){
            System.out.println("Samstag");
        } else if (sixth == 1){
            System.out.println("Sonntag");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Day: ");
        int day = scan.nextInt();
        System.out.print("Month: ");
        int month = scan.nextInt();
        System.out.print("Year: ");
        int year = scan.nextInt();
        computeDay(day, month, year);

    }

}


