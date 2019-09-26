package linesandshapes;
import java.awt.*;

import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;
import java.sql.Array;
import java.util.ArrayList;

class LinesAndShapes {

    public static void main(String[] args) {
    }
    
    	public void paint (Graphics g) {
		    Graphics2D g2 = (Graphics2D) g;
		   
			g2.setStroke(new BasicStroke(20));
		    g.drawLine(0, 300, 380, 80);   
			g.drawRect(20, 25, 150, 40);
		 RoundRectangle2D rd = new RoundRectangle2D.Float(20, 100, 150, 40, 15, 15);
		    g2.draw(rd);
		    g.drawOval(50, 50, 200, 200);
		    
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		    g2.fillRoundRect(20, 100, 150, 40, 15, 15);
		    for (int i = 0; i < 110; i++) {
		    g2.fillArc(i, 200, 155, 155, 45, 45);
	     	}
    }
    
}