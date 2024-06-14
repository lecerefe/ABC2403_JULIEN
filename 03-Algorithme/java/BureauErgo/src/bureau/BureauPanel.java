package bureau;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import App.TileManager;






public class BureauPanel {

	
	public class BureauErgo extends JPanel implements Runnable{

		int FPS = 60;
		TileManager tileM = new TileManager(null);
		Thread gameThread;
		
		public void run() {
			double drawInterval = 1000000000/FPS;
			double delta = 0;
			long lastTime = System.nanoTime();
			long currentTime;
			long timer = 0;
			int drawCount = 0;
			
			
			while(gameThread != null) {
				
				currentTime = System.nanoTime();
				
				delta += (currentTime - lastTime) / drawInterval;
				timer += (currentTime - lastTime);
				lastTime = currentTime;
				
				if (delta >= 1) {
					update(null);
					repaint();
					delta--;
					drawCount++;
				}
				
				if (timer >= 1000000000) {
					System.out.println("FPS:"+ drawCount);
					drawCount = 0;
					timer = 0;
				}	
			}	
		}
	/*	public void update() {
			
			
		*/	
	}

		}
