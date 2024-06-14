package bureau;
import java.awt.Color;

import javax.swing.JFrame;
public class App {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("BureauErgo");
		window.setSize(1000, 800);
		window.setVisible(true);
		window.setLocation(140, 70);
		window.setLocationRelativeTo(null);
		window.setBackground(Color.blue);
		
		//BureauPanel bureauPanel = new BureauPanel();
		
		BureauErgo bureauErg1 = new BureauErgo();
		
		BureauErgo bureauErg2 = new BureauErgo(1.0f, 1.30f, 0.60f, false, 0.80f, 1.00f, 1.20f);
		
		System.out.println(bureauErg2.branchement());

		System.out.println(bureauErg2.moreheight(0.30));
		
		
	}

}
