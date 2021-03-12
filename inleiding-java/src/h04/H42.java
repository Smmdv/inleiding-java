package h04;

import java.awt.*;
import java.applet.*;

public class H42 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.drawLine(50,60,10,100);
        g.setColor(Color.black);
        g.drawLine(50,60,90,100);
        g.setColor(Color.black);
        g.drawLine(90,150,90,100);
        g.setColor(Color.black);
        g.drawLine(10,150,10,100);
        g.setColor(Color.black);
        g.drawLine(10,150,90,150);
        g.setColor(Color.black);
        g.drawLine(90,150,90,100);
        g.drawRect(20,130,10,20);
        g.drawRect(70,130,10,10);
        g.drawLine(75,140,75,130);
        g.drawLine(70,135,80,135);
    }

}
