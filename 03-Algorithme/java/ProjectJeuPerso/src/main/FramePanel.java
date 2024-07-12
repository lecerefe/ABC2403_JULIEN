package main;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


@SuppressWarnings("serial")
	public class FramePanel extends JPanel  implements ActionListener, KeyListener {

	int largeur = 640;
	int hauteur = 640;
	
	Image backgroundImg;
	Image joueurImg;
	Image viandeImg;
	
	
	int persoX = largeur / 8;
	int persoY = 0;
	int persoLargeur = 60;
	int persoHauteur = 90;
	
	class Joueur{
		int x = persoX;
		int y = persoY;
		int largeur = persoLargeur;
		int hauteur = persoHauteur;
		Image img;
		
		Joueur(Image img) {
			this.img = img;
		}
	}
	int objectX = largeur;
	int objectY = hauteur / 2;
	int objectLargeur = 40;
	int objectHauteur = 40;
	int graviter = 1;
	
	
	class Object {
		int x = objectX;
		int y = objectY;
		int largeur = objectLargeur;
		int hauteur = objectHauteur;
		Image img;
		
		Object(Image img) {
			this.img = img;
		}
	}
	
	Joueur joueur;
	int rapiditerX = -4;
	
	Timer boucleJeu;
	boolean gameOver = false;
	double score = 0;
	
	FramePanel() {
		setPreferredSize(new Dimension(largeur, hauteur));
		setFocusable(true);
		addKeyListener(this);
		
		backgroundImg = new ImageIcon(getClass().getResource("/image/GameBackGround.jpg")).getImage();
		joueurImg = new ImageIcon(getClass().getResource("/image/LuffyFace.PNG")).getImage();
		viandeImg = new ImageIcon(getClass().getResource("/image/NouritureLuffy.png")).getImage();
		
		joueur = new Joueur(joueurImg);
		
		boucleJeu = new Timer(1000 / 60, (ActionListener) this);
		boucleJeu.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
		g.drawImage(backgroundImg, 0, 0, this.largeur, this.hauteur, null);
		g.drawImage(joueurImg, joueur.x, joueur.y ,null);
		
		g.setFont(new Font("Arial", Font.PLAIN, 32));
		if(gameOver) {
			g.drawString(String.valueOf((int) score), 10, 35);
		}else {
			g.drawString(String.valueOf((int) score), 10, 35);
		}
	}
	public void move() {
		
	}
	public void actionPerformed(ActionEvent e) {
		repaint();
		if (gameOver) {
			boucleJeu.stop();
		}
	}
}
