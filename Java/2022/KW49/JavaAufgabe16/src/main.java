import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
        System.out.print("Password:");
        String password = scan.nextLine();
        if (isStrong(password)) {
            System.out.println("safe");
        } else {
            System.out.println("no");
        }
    }

}

    public static boolean isStrong(String password) {
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean digit = false;
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch;
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digit = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                upperCase = true;
            }

        }
        if (!digit || !lowerCase || !upperCase) {
            return false;
        }
        if (!password.contains("*") && !password.contains("!")) {
            return false;
        }
        return true;
    }
}
