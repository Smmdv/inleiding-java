package h11;
import java.applet.*;
import java.awt.*;

public class H1167 extends Applet {

    public void paint(Graphics g) {

        int teller;
        int height = 10;
        int width = 10;
        int x = 300;
        int y = 300;

        for(teller = 0; teller <= 50; teller++) {

            g.drawOval(x,y, width, height);
            height += 10;
            width += 10;
            x -= 5;
            y -= 5;


        }

    }

}



