import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://zenquotes.io/api/random"))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        String quote = response.body().substring(8);
        int num = quote.indexOf("\"");
        quote = quote.substring(0, num).replaceAll(" ", "%20").replaceAll("'", "%27");
        StringBuilder builder = new StringBuilder(quote);
        int count = 0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '%') {
                count++;
            }
            if (count == 5) {
                System.out.println(builder);
                builder = builder.replace(builder.charAt(i), builder.charAt(i + 3), "%0A");
                System.out.println(builder);
                count = 0;
            }
        }
        URL url = new URL("https://cataas.com/cat/says/" + builder);
        BufferedImage image = ImageIO.read(url);
        JFrame frame = new JFrame();
        frame.setSize(image.getWidth(), image.getHeight());
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }
}
