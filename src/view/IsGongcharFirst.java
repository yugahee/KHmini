package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class IsGongcharFirst extends JPanel{
	
	public IsGongcharFirst() {
		JFrame frame = new JFrame("������ ó���̽Ű���?");
		setBackground(Color.white);
		
		frame.setBounds(450, 200, 360, 600);//(360, 600);
		
		JLabel label = new JLabel();
		
		label.setHorizontalAlignment(JLabel.CENTER);
		Image img = new ImageIcon("image/isgongcharfirst.png").getImage();
		label.setIcon(new ImageIcon(img));

		add(label);
		frame.add(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}

}
