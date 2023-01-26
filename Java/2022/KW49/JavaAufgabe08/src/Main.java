import java.util.*;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Körpergrösse: ");
            int height = scan.nextInt();
            System.out.print("Brustumfang: ");
            int size = scan.nextInt();

            System.out.println("Konfektionsgrösse: " + computeGarmentSize(height, size));
        }
    }
    public static int computeGarmentSize(int height, int size){
        Scanner scan = new Scanner(System.in);
        int konfSize = 0;
        System.out.println("Mann oder Frau?");
        String gender = scan.nextLine();

        if(gender.equals("mann")){
            konfSize = size / 2;
        }else if (gender.equals("frau")){
            konfSize = size / 2 - 6;
            if (height < 164){
                konfSize = konfSize / 2;
            } else if (height > 170) {
                konfSize = konfSize * 2;
            }
        }
        return konfSize;
    }
}
