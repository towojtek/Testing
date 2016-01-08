/**
 * Created by Wojtek on 2016-01-05.
 */
import java.applet.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Appleto extends Applet{

    public Font f = new Font("Trebuchet MS", Font.BOLD ,25);
    public Color kolor = Color.BLACK;
    public Color[] kolory = {Color.RED,Color.ORANGE,Color.YELLOW};
    public int test=0;
    public Image bufor = new BufferedImage(400,200,BufferedImage.TYPE_INT_RGB);

//    @Override
//    public void update(Graphics g) {
//        paint(g);
//    }

    public void paint(Graphics g) {
        stare_paint(bufor.getGraphics());
        g.drawImage(bufor, 0, 0, null);
//        g.drawString("Welcome in Java Applet.",40,20);
    }
    public void stare_paint(Graphics g){
        int licznik = 0;
        test++;
        for(int i = 0; i <100;i+=3){
            g.setColor(kolory[licznik++ % kolory.length]);
            g.fillRoundRect(i,i,400 - i * 2,200 - i * 2,10,10);
        }
        g.setFont(f);
        g.setColor(kolor);
        g.drawString("Trebuchet MS jest " + test, 50, 100);
    }
}
