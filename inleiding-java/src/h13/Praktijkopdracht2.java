package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht2 extends Applet {

    public void paint(Graphics g) {
        boom(g,50,90);
    }

    void boom(Graphics g, int x, int y) {
        int teller;
        int xcopy = x;
        for(teller = 0; teller < 10; teller++) {
            g.fillRect(x,y,10,100);
            g.setColor(Color.green);
            g.fillArc(x-45,y-70,100,100,0,360);
            g.setColor(Color.black);
            x += 100;
            if (teller == 4) {
                y += 100;
                x = xcopy + 50;
            }
        }
    }
}