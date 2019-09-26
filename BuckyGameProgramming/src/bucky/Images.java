package bucky;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Images extends JFrame{

	public static void main(String[] args) {
		
				
				DisplayMode dm = new DisplayMode (1360,768,8, DisplayMode.REFRESH_RATE_UNKNOWN);
			    Images i = new Images();
				i.run(dm);
					}
	
	        private CompilatorWindow s;
	        private Image bg;
	        private Image pic;
	        private boolean loaded;
	        
	        
		    public void run(DisplayMode dm) {
		    	setBackground(Color.BLUE);
		    	setForeground(Color.RED);
		    	setFont(new Font ("Arial", Font.PLAIN, 24));
		    	loaded = false;
		    	
		    	CompilatorWindow s = new CompilatorWindow();
		    	
		    	try {
		    		s.setFullScreen(dm, this);
		    		loadpics ();
		    		
		    	
					try {
				    Thread.sleep(5000);
		    	} catch (Exception ex) {}   	
		    } finally {
		    	s.restoreScreen();
			}
		}
		    
		    //loads pictures 
		    
		    public void loadpics() {
		    	bg= new ImageIcon ("C:\\Test\\Back.jpg").getImage();
		    	pic= new ImageIcon ("C:\\Test\\MySmile.PNG").getImage();
		    	loaded = true;
		    	repaint();
		    	
		    	
		    }
		public void paint (Graphics g) {
			if (g instanceof Graphics2D) {
				Graphics2D g2 = (Graphics2D)g;
				g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
				}
			if (loaded) {
		g.drawImage(bg, 0, 0, null);	
		g.drawImage(pic, 170, 180, null);
			} 
		}
		

	}


