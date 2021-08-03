package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Store extends JPanel {
	
	Store(){
		setBackground(Color.WHITE);
		
		setLayout(null);
		JLabel lbstore1 = new JLabel("매장 찾기");
		lbstore1.setLocation(100, 20);
		lbstore1.setSize(100, 20);
		lbstore1.setFont(new Font("굴림", Font.BOLD, 20));
		add(lbstore1);
		
		setLayout(null);
		JTextField jf = new JTextField();
		jf.setLocation(15, 60);
		jf.setSize(200, 30);
		add(jf);
		
		JButton payButton1 = new JButton("찾기");
		payButton1.setLocation(220, 60);
		payButton1.setSize(60, 30);
		add(payButton1);
		
		
		
	}
	
}
