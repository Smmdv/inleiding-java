package h11;
import java.applet.*;
import java.awt.*;

public class H118 extends Applet {
    public void paint(Graphics g){
        int teller;
        int y=935;
        int x=1000;
        int height = 10;
        int width = 10;
        for(teller = 0; teller < 50; teller++) {
            g.drawOval(x,y,width,height);
            height +=20;
            width += 20;
            x-=20;
            y-=20;

        }
    }
}
