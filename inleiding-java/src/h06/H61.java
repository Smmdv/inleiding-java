package h06;
import java.awt.*;
import java.applet.*;

public class H61 extends Applet {
    int uitkomst;

    public void init(){
        uitkomst = 113/4;

    }

    public void paint(Graphics G){

        G.drawString("bedrag jan" + uitkomst,10,20);
        G.drawString("bedrag Ali" + uitkomst,10,30);
        G.drawString("bedrag Sem" + uitkomst,10,40);
        G.drawString("bedrag jean" + uitkomst,10,50);
    }










}


