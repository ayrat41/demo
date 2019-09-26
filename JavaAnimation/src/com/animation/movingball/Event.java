package com.animation.movingball;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Event extends JPanel implements ActionListener   {

	public static void main(String[] args) {
	
	Second s = new Second();
	JFrame f = new JFrame();
	f.add(s);
	f.setVisible(true);
	f.setSize(600, 400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setTitle("moving ball");
    
	}
	private static final long serialVersionUID = 1L;
		Timer t = new Timer (5, this);
		double x=0, y=0, velX = 2, velY=2;
		
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D circle = new Ellipse2D.Double(x,y,40,40);
	    g2.fill(circle);
		t.start();
		
	} 

	
	public void actionPerformed (ActionEvent e) {
		JFrame f1 = new JFrame();
		
		if (x<0||x>540) {
			velX=-velX;
		}
		if (y<0||y>320) {
			velY=-velY;
		}
		x += velX;
		y += velY;
		f1.repaint();
		
	}

}