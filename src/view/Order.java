package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Order extends JFrame{

	public Order() {
		super("주문하기");
		this.setBounds(500, 100, 300, 500);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
		try {
			this.setIconImage(ImageIO.read(new File("image/mainTitle.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel label = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50,0);
		label.setIcon(new ImageIcon(mainImage));
		label.setLocation(5, -2);
		label.setSize(40, 60);
		panel.add(label);
		
		JLabel title = new JLabel("Order");
		title.setLocation(50, -50);
		title.setSize(500, 150);
		title.setFont(new Font("", Font.BOLD, 20));
		panel.add(title);
		
		/*
		JLabel title1 = new JLabel("아메리카노");
		title1.setLocation(40, 100);
		title1.setSize(500, 150);
		title1.setFont(new Font("", Font.BOLD, 15));
		// panel.add(title1);
		
		JLabel title2 = new JLabel("아메리카노");
		title2.setLocation(40, 230);
		title2.setSize(500, 150);
		title2.setFont(new Font("", Font.BOLD, 15));
		// panel.add(title2);
		
		JLabel title3 = new JLabel("아메리카노");
		title3.setLocation(40, 360);
		title3.setSize(500, 150);
		title3.setFont(new Font("", Font.BOLD, 15));
		// panel.add(title3);
		
		JLabel title4 = new JLabel("아메리카노");
		title4.setLocation(160, 100);
		title4.setSize(500, 150);
		title4.setFont(new Font("", Font.BOLD, 15));
		// panel.add(title4);

		JLabel title5 = new JLabel("아메리카노");
		title5.setLocation(160, 230);
		title5.setSize(500, 150);
		title5.setFont(new Font("", Font.BOLD, 15));
		// panel.add(title5);
		
		JLabel title6 = new JLabel("아메리카노");
		title6.setLocation(160, 360);
		title6.setSize(500, 150);
		title6.setFont(new Font("", Font.BOLD, 15));
		// panel.add(title6);
		*/
		
		ImageIcon icon1 = new ImageIcon("image/orderimg/americono1.png");
		ImageIcon icon2 = new ImageIcon("image/orderimg/milktea.png");
		ImageIcon icon3 = new ImageIcon("image/orderimg/tea.png");
		ImageIcon icon4 = new ImageIcon("image/orderimg/season.png");
		ImageIcon icon5 = new ImageIcon("image/orderimg/smoothie.png");
		ImageIcon icon6 = new ImageIcon("image/orderimg/bakery.png");
		JButton button1 = new JButton(icon1);
		JButton button2 = new JButton(icon5);
		JButton button3 = new JButton(icon4);
		JButton button4 = new JButton(icon2);
		JButton button5 = new JButton(icon3);
		JButton button6 = new JButton(icon6);
		
	
		
		
		button1.setSize(100, 120);
		button2.setSize(100, 120);
		button3.setSize(100, 120);
		button4.setSize(100, 120);
		button5.setSize(100, 120);
		button6.setSize(100, 120);
		
		button1.setLocation(30, 60);
		button2.setLocation(30, 190);
		button3.setLocation(30, 320);
		button4.setLocation(150, 60);
		button5.setLocation(150, 190);
		button6.setLocation(150, 320);
		

		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		
		
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Order();
	}
	
}
