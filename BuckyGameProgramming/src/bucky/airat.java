package bucky;

import java.awt.*;
import javax.swing.JFrame;


public class airat extends JFrame{

	public static void main(String[] args) {
		
		DisplayMode dm = new DisplayMode (1360,768,8, DisplayMode.REFRESH_RATE_UNKNOWN);
		airat b = new airat();
		b.run(dm);
			}
    public void run(DisplayMode dm) {
    	setBackground(Color.BLUE);
    	setForeground(Color.RED);
    	setFont(new Font ("Arial", Font.PLAIN, 24));
    	
    	CompilatorWindow s = new CompilatorWindow();
    	
    	try {
    		s.setFullScreen(dm, this);
			try {
		    Thread.sleep(5000);
    	} catch (Exception ex) {}   	
    } finally {
    	s.restoreScreen();
	}
}
public void paint (Graphics g) {
	if (g instanceof Graphics2D) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
	g.drawString("This is gona be awesome", 200, 200);
}
}
