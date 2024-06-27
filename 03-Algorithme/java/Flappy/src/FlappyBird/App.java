package FlappyBird;

import javax.swing.*;

public class App {

	public static void main(String[] args) throws Exception {

		int boardWidth = 360;
		int boardHeight = 640;

		JFrame frame = new JFrame("AllanBird");
		frame.setSize(boardWidth, boardHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlappyBirde flappyBird = new FlappyBirde();
		frame.add(flappyBird);
		frame.pack();
		flappyBird.requestFocus();
		frame.setVisible(true);
	}
}
 