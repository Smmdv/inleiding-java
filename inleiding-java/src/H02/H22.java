import java.awt.*;
import java.applet.*;

public class H22 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sem", 50, 50);
        g.setColor(Color.red);
        g.drawString("de Vries", 50, 60);
    }
}