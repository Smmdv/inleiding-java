package TEST;

import java.applet.*;
import java.awt.*;

public class hans extends Applet {
    public void paint (Graphics g){
        int teller;
        int y = 20;
        for (teller = 0; teller < 10; teller++){
            g.drawString("je moeder",20,y);
            y +=20;
            if (teller == 4){
                g.drawString("pog 5 x je moeder",20,y);
                y += 20;
            }
        }
    }
}

