package h06;
import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {
  double cijfers;
  double berekening;
  int uitkomst;
 public void init(){

      cijfers = 5.9+6.3+6.9;
      berekening = (cijfers/3)*10;
      uitkomst = (int) berekening;

  }
public void paint(Graphics g){

     g.drawString("gemiddelde="+ uitkomst/10,10,20);

 }










}