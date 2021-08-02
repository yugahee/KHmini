package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Order {
	public Order() {
		JFrame frame = new JFrame();
		frame.setSize(300, 500);
		frame.setBackground(Color.WHITE);

		frame.setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel lbmain = new JLabel(mainImage);
		lbmain.setLocation(5, 5);
		lbmain.setSize(40, 60);
		frame.add(lbmain);

		JPanel panel = new JPanel();
		JLabel label = new JLabel();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Order();
	}

}
