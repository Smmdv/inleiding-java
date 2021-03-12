package h06;
import java.awt.*;
import java.applet.*;

public class H63 extends Applet {

    int negatiefsom;

   public void init(){

        negatiefsom = 2147483647+ 1;

    }

    public void paint(Graphics g){

       g.drawString("Negatief antwoord:" + negatiefsom,10,20);
    }
}
