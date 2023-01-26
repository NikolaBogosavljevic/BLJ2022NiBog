import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("E-Mail Adresse: ");
            String email = scan.nextLine();
            System.out.println(isEmail(email));
        }
    }

    public static boolean isEmail(String email) {
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < email.length(); i++) {
            email.charAt(i);
            if (email.charAt(i) == '@') {
                temp1++;
                if (i == 1) {
                    return false;
                } else if (temp1 == 2) {
                    return false;
                }
            }
            if (email.charAt(i) == '.') {
                temp2++;
                if (i != 0) {
                    if (email.charAt(i - 1) == '@') {
                        return false;
                    }
                } else if (temp2 == 2) {
                    return false;
                }
            }

            if (i >= 4) {
                if (email.charAt(i - 1) == '.' || email.charAt(i - 4) == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
