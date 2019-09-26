package linesandshapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class two {
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
