package h04;
import java.applet.*;
import java.awt.*;

public class vlag extends Applet{

    public void paint (Graphics g){
        g.drawLine(50,50,50,400);
        g.drawRect(50,45,180,100);
        g.setColor(Color.RED);
        g.fillArc(95,50,50,50,0,360);
    }
}
