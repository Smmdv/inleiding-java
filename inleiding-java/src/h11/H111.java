package h11;
import java.applet.*;
import java.awt.*;



public class H111 extends Applet {


    public void paint (Graphics g) {
        int y = 0;
        int teller;
        for(teller = 0; teller <= 15; teller++) {

        g.drawLine(50,y,150,y);
         y += 20;
        }
    }
}
