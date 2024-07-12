package main;
import java.awt.Color;

import javax.swing.*;
public class App {
	 
	public static FramePanel framePanel;

	public static void main(String[] args) {
		
		int boardWidth = 640;
		int boardHeight = 640;
		
		JFrame frame = new JFrame("Luffy est la viande");
		frame.setSize(boardWidth, boardHeight);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBackground(Color.black);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

}
