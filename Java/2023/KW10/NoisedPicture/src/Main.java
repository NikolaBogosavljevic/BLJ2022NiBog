import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage img = ImageIO.read(new File("C:/Users/Nikola/Pictures/gengur.png"));
        Random rand = new Random();
        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                if (rand.nextInt(2) == 1) {
                    if (rand.nextInt(2) == 1) {
                        img.setRGB(i, j, white.getRGB());
                    } else {
                        img.setRGB(i, j, black.getRGB());
                    }
                }
            }
        }
        File outputfile = new File("noisedPic.png");
        ImageIO.write(img, "png", outputfile);
        denoisePic(img, white, black);
    }

    public static void denoisePic(BufferedImage img, Color white, Color black) throws IOException {
        Color px1 = null;
        Color px2 = null;
        Color px3 = null;
        Color px4 = null;
        Color px6 = null;
        Color px5 = null;
        Color px7 = null;
        Color px8 = null;
        int count = 0;
        for (int i = 1; i < img.getHeight() - 1; i++) {
            for (int j = 1; j < img.getWidth() - 1; j++) {
                if (img.getRGB(i, j) == white.getRGB() || img.getRGB(i, j) == black.getRGB()) {
                    if (img.getRGB(i - 1, j - 1) != white.getRGB()) {
                        if (img.getRGB(i - 1, j - 1) != black.getRGB())
                            px1 = new Color(img.getRGB(i - 1, j - 1));
                        count++;
                    }
                }
                if (img.getRGB(i - 1, j) != white.getRGB()) {
                    if (img.getRGB(i - 1, j) != black.getRGB()) {
                        px2 = new Color(img.getRGB(i - 1, j));
                        count++;
                    }
                }
                if (img.getRGB(i - 1, j + 1) != white.getRGB()) {
                    if (img.getRGB(i - 1, j + 1) != black.getRGB()) {
                        px3 = new Color(img.getRGB(i - 1, j + 1));
                        count++;
                    }
                }
                if (img.getRGB(i, j - 1) != white.getRGB()) {
                    if (img.getRGB(i, j - 1) != black.getRGB()) {
                        px4 = new Color(img.getRGB(i, j - 1));
                        count++;
                    }
                }
                if (img.getRGB(i + 1, j - 1) != white.getRGB()) {
                    if (img.getRGB(i + 1, j - 1) != black.getRGB()) {
                        px6 = new Color(img.getRGB(i + 1, j - 1));
                        count++;
                    }
                }
                if (img.getRGB(i, j + 1) != white.getRGB()) {
                    if (img.getRGB(i, j + 1) != black.getRGB()) {
                        px5 = new Color(img.getRGB(i, j + 1));
                        count++;
                    }
                }
                if (img.getRGB(i + 1, j) != white.getRGB()) {
                    if (img.getRGB(i + 1, j) != black.getRGB()) {
                        px7 = new Color(img.getRGB(i + 1, j));
                        count++;
                    }
                }
                if (img.getRGB(i + 1, j + 1) != white.getRGB()) {
                    if (img.getRGB(i + 1, j + 1) != black.getRGB()) {
                        px8 = new Color(img.getRGB(i + 1, j + 1));
                        count++;
                    }
                }

                int red = (px1.getRed() + px2.getRed() + px3.getRed() + px4.getRed()
                        + px5.getRed() + px6.getRed() + px7.getRed() + px8.getRed()) / count;
                int blue = (px1.getBlue() + px2.getBlue() + px3.getBlue() + px4.getBlue()
                        + px5.getBlue() + px6.getBlue() + px7.getBlue() + px8.getBlue()) / count;
                int green = (px1.getGreen() + px2.getGreen() + px3.getGreen() + px4.getGreen()
                        + px5.getGreen() + px6.getGreen() + px7.getGreen() + px8.getGreen()) / count;
                Color denoisePx = new Color(red, blue, green);

                img.setRGB(i, j, denoisePx.getRGB());
            }
        }
        File outputfile = new File("denoisedPic.png");
        ImageIO.write(img,"png",outputfile);
    }

}


