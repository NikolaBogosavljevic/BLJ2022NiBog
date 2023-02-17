import  java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Word:");
        String word = scan.nextLine();
        mra(word.toUpperCase());
    }

    public static boolean isVovel(char ch) {
        if (ch =='A' || ch =='E'|| ch =='I' || ch =='O' || ch =='U'){
            return true;
        }
        return false;
    }

    public static void mra(String word) {
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if (i == 0){
                System.out.print(ch);
            }
            if (!isVovel(ch)){
                if (i != 0 && word.charAt(i - 1) != ch){
                    System.out.print(ch);
                }
            }
        }
    }
}
