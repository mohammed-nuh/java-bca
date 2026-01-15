import java.applet.*; 
import java.awt.Graphics;

public class A1_BasicApplet extends Applet{
    public void paint (Graphics g){
        g.drawString("Welcome to Applet Programming",300,150);
}
}
/*
<applet code="A1_BasicApplet.class" width="700" height="700">
</applet>
*/