import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage img = ImageIO.read(new File("C:/Users/Nikola/Pictures/minhduy.jpg"));
        Random rand = new Random();
        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        for (int i = 0; i < img.getWidth(); i++){
            for (int j = 0; j < img.getHeight(); j++){
                if (rand.nextInt(3)==1){
                    if (rand.nextInt(2)==1){
                        img.setRGB(i, j, white.getRGB());
                    }else {
                        img.setRGB(i, j, black.getRGB());
                    }
                }
            }
        }
        File outputfile = new File("noisedPic.png");
        ImageIO.write(img, "png", outputfile);
        denoisePic(img, white, black);
    }

    public static void denoisePic(BufferedImage img, Color white, Color black){
        for (int i = 0; i < img.getHeight(); i++){
            for (int j = 0; j < img.getWidth(); j++){
                if (img.getRGB(i, j) == white.getRGB() ||img.getRGB(i, j) == black.getRGB()){
                    
                }
            }
        }
    }
}