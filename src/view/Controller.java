package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Controller extends JFrame{
	
	JPanel title = new Title();
	JPanel home = new Home();
	JPanel pay = new Pay();
	
	
	
	public Controller() {
		super("Gong Cha App");
		setBounds(500, 100, 300, 500);
		
		int money = 50000;
		String format = String.format("%,d", money);
		
		try {
			setIconImage(ImageIO.read(new File("image/Title.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}

		title.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					title.setVisible(false);
					add(home);
				}
			}
		});
//		btnmain4.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				if (e.getButton() == MouseEvent.BUTTON1) {
//					home.setVisible(false);
//					add(panel3);
//				}
//			}
//		});
//		
//		payButton1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				panel2.setVisible(true);
//				remove(panel3);
//			}
//		});
//		
//		btnpay2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				panel3.setVisible(false);
//				add(panel4);
//			}
//		});
		
		add(title);
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(300, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
