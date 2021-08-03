package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Title extends JPanel{
	
	Title(){
		setBackground(Color.WHITE);
		ImageIcon titleImage = new ImageIcon("image/orderimg/gongchar.png");
		add(new JLabel(titleImage));
	}
}
