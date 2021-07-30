package view;

import java.awt.Color;
import java.awt.Dimension;
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

public class Title extends JFrame {
	
	public Title() {
		super("Gong Cha App");
		setBounds(500, 100, 300, 500); 
		
		try {
			setIconImage(ImageIO.read(new File("image/Title.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JPanel panel1 = new JPanel();	// 타이틀
		JPanel panel2 = new JPanel();	// 메인
		JPanel panel3 = new JPanel();	// pay
		JPanel panel4 = new JPanel();	// 충전
		
		panel1.setBackground(Color.WHITE);
		panel2.setBackground(Color.WHITE);
		panel3.setBackground(Color.WHITE);
		
		ImageIcon titleImage = new ImageIcon("image/Title.jpg");
		panel1.add(new JLabel(titleImage));
		
		
		panel2.setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel lbmain = new JLabel(mainImage);
		lbmain.setLocation(5, 5);
		lbmain.setSize(40, 60);
		panel2.add(lbmain);
		JLabel lbmain2 = new JLabel("안녕하세요.");
		lbmain2.setLocation(50, 15);
		lbmain2.setSize(300, 20);
		panel2.add(lbmain2);
		JLabel lbmain3 = new JLabel("공차입니다.");
		lbmain3.setLocation(50, 35);
		lbmain3.setSize(300, 20);
		panel2.add(lbmain3);
		
		JButton btnmain1 = new JButton("처음 오신 분들에게 추천 메뉴 ~~!!");
		btnmain1.setLocation(20, 80);
		btnmain1.setSize(250, 50);
		panel2.add(btnmain1);
		
		JButton btnmain2 = new JButton("멤버십 가입해서 혜택받기!");
		btnmain2.setLocation(20, 150);
		btnmain2.setSize(250, 50);
		panel2.add(btnmain2);
		
		JLabel lbmain4 = new JLabel("- 이전에 주문한 메뉴 -");
		lbmain4.setLocation(20, 210);
		lbmain4.setSize(300, 30);
		panel2.add(lbmain4);
		
		ImageIcon icon = new ImageIcon("image/smoothie/smoothie_01.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon beforeMenu = new ImageIcon(changeImg);
		
		JLabel lbmain5 = new JLabel(beforeMenu);
		lbmain5.setLocation(20, 240);
		lbmain5.setSize(120, 120);
		panel2.add(lbmain5);
		
		JButton btnmain3 = new JButton("HOME");
		btnmain3.setBackground(Color.RED);
		btnmain3.setLocation(1, 400);
		btnmain3.setSize(70, 50);
		panel2.add(btnmain3);
		
		JButton btnmain4 = new JButton("PAY");
		btnmain4.setBackground(Color.RED);
		btnmain4.setLocation(73, 400);
		btnmain4.setSize(60, 50);
		panel2.add(btnmain4);
		
		JButton btnmain5 = new JButton("ORDER");
		btnmain5.setBackground(Color.RED);
		btnmain5.setLocation(135, 400);
		btnmain5.setSize(75, 50);
		panel2.add(btnmain5);
		
		JButton btnmain6 = new JButton("내 정보");
		btnmain6.setBackground(Color.RED);
		btnmain6.setLocation(212, 400);
		btnmain6.setSize(80, 50);
		panel2.add(btnmain6);

		panel3.setLayout(null);
		ImageIcon icon2 = new ImageIcon("image/payimage.png");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(240, 150, Image.SCALE_SMOOTH);
		ImageIcon pay = new ImageIcon(changeImg2);
		
		JLabel lbmain6 = new JLabel(pay);
		lbmain6.setLocation(30, 50);
		lbmain6.setSize(240, 150);
		panel3.add(lbmain6);
		
		ImageIcon icon3 = new ImageIcon("image/barcode.png");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(130, 70, Image.SCALE_SMOOTH);
		ImageIcon barcode = new ImageIcon(changeImg3);
		
		JLabel lbmain7 = new JLabel(barcode);
		lbmain7.setLocation(85, 220);
		lbmain7.setSize(130, 70);
		panel3.add(lbmain7);
		
		JButton btnpay1 = new JButton("결제 내역 확인");
		btnpay1.setLocation(75, 320);
		btnpay1.setSize(150, 50);
		panel3.add(btnpay1);
		
		JButton btnpay2 = new JButton("충전 하기");
		btnpay2.setLocation(75, 380);
		btnpay2.setSize(150, 50);
		panel3.add(btnpay2);
		
		
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					panel1.setVisible(false);
					add(panel2);
				}
			}
		});
		btnmain4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					panel2.setVisible(false);
					add(panel3);
				}
			}
		});
		
		add(panel1);
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(300, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
