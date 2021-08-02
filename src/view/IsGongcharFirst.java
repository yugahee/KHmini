package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class IsGongcharFirst {
	private IsGongcharFirst IsGongcharFirst;
	
	public IsGongcharFirst() {
		JFrame frame = new JFrame("공차가 처음이신가요?");
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		
		frame.setBounds(450, 200, 360, 600);//(360, 600);
		
		JLabel label = new JLabel();
		
		label.setHorizontalAlignment(JLabel.CENTER);
		Image img = new ImageIcon("image/isgongcharfirst.png").getImage();
		label.setIcon(new ImageIcon(img));

		panel.add(label);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}
	
	public static void main(String[] args) {
		new IsGongcharFirst();
	}
	

	
}
