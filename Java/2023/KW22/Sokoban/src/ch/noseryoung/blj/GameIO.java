package ch.noseryoung.blj;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameIO extends JFrame {

    private Game game;
    private BufferedImage displayArea;

    private int scale;
    private double cellMargin;

    private final Map<Integer, Runnable> inputMap;
    private final Map<Integer, ImageIcon> imageMap;

    private int imageSize;

    public GameIO(Game game, int scale, int imageSize) {
        this.game = game;
        this.scale = scale;
        this.imageSize = imageSize;

        inputMap = Map.of(KeyEvent.VK_UP, game::moveUp, KeyEvent.VK_DOWN, game::moveDown,
                KeyEvent.VK_LEFT, game::moveLeft, KeyEvent.VK_RIGHT, game::moveRight, KeyEvent.VK_ESCAPE,
                game::escAction);

        imageMap = new HashMap<>();
        imageMap.put(0, loadImageIconFromURL("https://t4.ftcdn.net/jpg/01/07/76/85/360_F_107768523_jtL7cY9ajSRuTJmCfj4SAhTF8cebX317.jpg"));
        imageMap.put(1, loadImageIconFromURL("https://s42814.pcdn.co/wp-content/uploads/2022/06/Running_Bond.jpg.optimal.jpg"));
        imageMap.put(2, loadImageIconFromURL("https://noseryoung.ch/wp-content/uploads/2022/09/DSC_9279.jpg"));
        imageMap.put(3, loadImageIconFromURL("https://pixelartmaker-data-78746291193.nyc3.digitaloceanspaces.com/image/e7798ecd6eeb0cc.png"));
        imageMap.put(4, loadImageIconFromURL("https://htmlcolorcodes.com/assets/images/colors/dark-red-color-solid-background-1920x1080.png"));
        imageMap.put(5, loadImageIconFromURL("https://www.solidbackgrounds.com/images/1920x1080/1920x1080-bright-green-solid-color-background.jpg"));

        initInput();
        initOutput();
        updateOutput();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int secondsPassed = 0;
            final int totalSeconds = 10;

            public void run() {
                secondsPassed++;
                System.out.println("Seconds passed: " + secondsPassed);

                if (secondsPassed == totalSeconds) {
                    System.out.println("YOU LOSSDSST!!");
                    System.exit(0);
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }

    private ImageIcon loadImageIconFromURL(String url) {
        try {
            BufferedImage image = ImageIO.read(new URL(url));
            Image resizedImage = image.getScaledInstance(imageSize, imageSize, Image.SCALE_SMOOTH);
            return new ImageIcon(resizedImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void initOutput() {
        displayArea = new BufferedImage(game.getRowCount() * scale, game.getColCount() * scale,
                BufferedImage.TYPE_INT_ARGB);

        this.getContentPane().add(new JLabel(new ImageIcon(displayArea)));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Sokoban");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initInput() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (inputMap.containsKey(e.getKeyCode())) {
                    inputMap.get(e.getKeyCode()).run();
                    updateOutput();
                }
            }
        });
    }

    private void updateOutput() {
        Graphics2D g2d = (Graphics2D) displayArea.getGraphics();
        g2d.setStroke(new BasicStroke((float) (scale * cellMargin)));
        for (int x = 0; x < game.getRowCount(); x++) {
            for (int y = 0; y < game.getColCount(); y++) {
                int scaledX = x * scale + scale / 2;
                int scaledY = y * scale + scale / 2;
                ImageIcon image = imageMap.get(game.getField()[y][x]);
                if (image != null) {
                    image.paintIcon(this, g2d, scaledX - imageSize / 2, scaledY - imageSize / 2);
                }
            }
        }
        repaint();
    }
}
