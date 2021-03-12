package h06;
import java.awt.*;
import java.applet.*;

public class H62 extends Applet {

    int jaar;
    int dag;
    int uur;
    int minuut;

    public void init(){

        minuut = 60;
        uur = minuut*60;
        dag = uur*24;
        jaar = dag*365;

    }


    public void paint(Graphics g){
        g.drawString("seconden in een minuut " + minuut,10,10);
        g.drawString("seconden in een uur " + uur,10,20 );
        g.drawString("seconden in een dag " + dag,10, 30);
        g.drawString("seconden in een jaar " + jaar,10,40 );



    }







}