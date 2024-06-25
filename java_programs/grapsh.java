package java_programs;

import java.awt.*;

public class grapsh extends Frame {

    public grapsh() {
        setSize(500, 500);
        setTitle("My Frame");
        setBackground(Color.PINK);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        g.drawString("Frame Java", 100, 100);
        g.fillRect(200, 200, 100, 100);
    }

    public static void main(String[] args) {
        grapsh s = new grapsh();
    }
}