package h11;
import java.applet.*;
import java.awt.*;

public class H114 extends Applet{
    public void paint(Graphics g){
        int teller;
        int y=20;
        int uitkomst;
        for(teller=1; teller <= 10; teller++ ){
            uitkomst = 3 * teller;
            g.drawString(""+ uitkomst ,20,y);
            y += 20;
        }
    }
}
