import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("URL: ");
        String url = scan.nextLine();
        System.out.println(urlEncode(url));

    }
    public static String urlEncode(String url){
        for (int i = 0; i < url.length(); i++){
            if (url.charAt(i)==' '){
                url.charAt(i)= '%20';
            }
        }
        url.replace(" ", "%20"); url.replace("*", "%2A");url.replace("+", "%2B");
        url.replace(",", "%2C");url.replace("/", "%2F");url.replace(":", "%3A");
        url.replace(";", "%3B");url.replace("=", "%3D");url.replace("?", "%3F");
        return url;
    }

}
