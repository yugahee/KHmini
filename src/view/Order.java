package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Order {
	public Order() {
		JFrame frame = new JFrame();
		frame.setSize(300,500);
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Order();
	}
	
}
