/*
package project;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;

public class Main extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Image menu = ImageIO.read(new File("")); //пути для картинок сделаю уже на уроке, потому что там другие компьютеры и пути будут отличаться
	    Image sett = ImageIO.read(new File(""));
	    Image bg = ImageIO.read(new File(""));
            g.drawImage(menu,940, 1000, null);
            g.drawImage(sett,980, 1000, null);
            g.drawImage(bg,0, 0, null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        JFrame wind = new JFrame("");
        wind.add(new Main());
        wind.setSize(1920, 1080);
        wind.setVisible(true);

    }
}
*/
package project;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;

public class Main extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Image solarPanel = ImageIO.read(new File("H://project/SolarPanel.png")); //пути для картинок сделаю уже на уроке, потому что там другие компьютеры и пути будут отличаться            Image sett = ImageIO.read(new File(""));
            g.drawImage(solarPanel,0, 0, null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void game(String[] args) {
        JFrame wind = new JFrame("");
        wind.add(new Main());
        wind.setSize(1920, 1080);
        wind.setVisible(true);
    }
}