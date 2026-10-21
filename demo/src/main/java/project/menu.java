package project;
import javax.imageio.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;

public class menu extends JPanel {

    MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println(e.getPoint().x + "  " + e.getPoint().y);
            if (e.getPoint().x > 644 && e.getPoint().x < 836 && e.getPoint().y > 509 && e.getPoint().y < 690)System.out.println(e.getPoint().x + "  " + e.getPoint().y);
            if (e.getPoint().x > 1185 && e.getPoint().x < 1374 && e.getPoint().y > 503 && e.getPoint().y < 687) System.out.println(e.getPoint().x + "  " + e.getPoint().y);
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Image sett = ImageIO.read(new File("H://project/settings.png")); //пути для картинок сделаю уже на уроке, потому что там другие компьютеры и пути будут отличаться            Image sett = ImageIO.read(new File(""));
            Image bg = ImageIO.read(new File("H://project/background.png"));
            Image play = ImageIO.read(new File("H://project/play.png"));
            Image menu = ImageIO.read(new File("H://project/menu.png"));
            g.drawImage(bg,0, 0, null);
            g.drawImage(menu,640, 500, null);
            g.drawImage(sett,910, 500, null);
            g.drawImage(play,1180, 500, null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        addMouseListener(ml);
    }
    public static void main(String[] args) {
        JFrame wind = new JFrame("");
        wind.add(new menu());
        wind.setSize(1920, 1080);
        wind.setVisible(true);
    }
}