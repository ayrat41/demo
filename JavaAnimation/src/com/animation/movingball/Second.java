package com.animation.movingball;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
public class Second extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	Timer t = new Timer (5, this);
	double x=0, y=0, velX = 2, velY=2;
	
public void paintComponent(Graphics g) {
	Graphics2D g2 = (Graphics2D)g;
	Ellipse2D circle = new Ellipse2D.Double(x,y,40,40);
    g2.fill(circle);
	t.start();
	repaint();
} 
public void update(Graphics g) {
    g.setColor(getBackground());
    g.fillRect(0, 0, 600, 400);
    g.setColor(getForeground());
    paint(g);
}
public void paintComponent1(Graphics g) {
	Graphics2D g2 = (Graphics2D)g;
	Ellipse2D circle = new Ellipse2D.Double(x,y,70,90);
    g2.fill(circle);
	t.start();
	repaint();
} 

public void actionPerformed (ActionEvent e) {
	
	if (x<0||x>540) {
		velX=-velX;
	}
	if (y<0||y>320) {
		velY=-velY;
	}
	x += velX;
	y += velY;
	repaint();
}

}
