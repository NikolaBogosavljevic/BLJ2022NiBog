import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String str = scan.nextLine();
            System.out.println(checkBrackets(str));
        }
    }

    public static boolean checkBrackets(String str){
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ')' && temp == 0){
                return false;
            }
            if (str.charAt(i) == '('){
                temp++;
            }
            if (str.charAt(i) == ')'){
                temp1++;
            }

        }
        if(temp != temp1){
            return false;
        }
        return true;
    }
}
