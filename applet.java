import java.applet.Applet;
import java.awt;
public class applet graphics demo extends Applet{
    public void paint(Graphics g){
        g.setcolor(color.red);
        g.drawstring("welcome",50,50);
        g.drawline(20,30,20,300);
        g.drawreet(70,100,30,30);
        g.fillreet(170,100,30,30);
        g.drawoval(70,200,30,30);
        g.filloval(170,200,30,30);
        g.draware(90,150,30,30,30,270);
        g.fillare(270,150,30,30,0,180);
    }}
    /*
     * <html>
     * <body>
     * <applet code="graphics demo.class".width="300"height="300">
     * 
     */

    }
}