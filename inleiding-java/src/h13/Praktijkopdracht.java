package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {

    public void paint(Graphics g) {
        boom(g,150,100);
    }

    void boom(Graphics g, int x, int y) {
        g.fillRect(x,y,10,100);
        g.setColor(Color.green);
        g.fillArc(x-45,y-70,100,100,0,360);

    }
}
