package AppletDemo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class simple_applet extends Applet{

	

          

        
           public void paint(Graphics g)
           {
        	   g.drawString("hello world", 40, 40);
        	   setBackground(Color.yellow);
        	   setSize(200, 200);
           }
	}


