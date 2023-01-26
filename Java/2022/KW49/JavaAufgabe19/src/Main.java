import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("URL: ");
        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();
        System.out.println(urlEncode(url));
    }
    public static String urlEncode(String url){
        url = url.replace("/", "%2F"); url = url.replace(" ", "%20"); url = url.replace("*", "%2A");
        url = url.replace("+", "%2B"); url = url.replace(",", "%2C"); url = url.replace(":", "%3A");
        url = url.replace(";", "%3B"); url = url.replace("=", "%3D"); url = url.replace("?", "%3F");
        return url;
    }
}