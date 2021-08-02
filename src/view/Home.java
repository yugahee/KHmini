package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel{
	
	public Home() {
		setBackground(Color.WHITE);
		
		setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel lbmain = new JLabel(mainImage);
		lbmain.setLocation(5, 5);
		lbmain.setSize(40, 60);
		add(lbmain);
		JLabel lbmain2 = new JLabel("�ȳ��ϼ���.");
		lbmain2.setLocation(50, 15);
		lbmain2.setSize(300, 20);
		add(lbmain2);
		JLabel lbmain3 = new JLabel("�����Դϴ�.");
		lbmain3.setLocation(50, 35);
		lbmain3.setSize(300, 20);
		add(lbmain3);
		
		JLabel lbmain4 = new JLabel("- ������ �ֹ��� �޴� -");
		lbmain4.setLocation(20, 210);
		lbmain4.setSize(300, 30);
		add(lbmain4);
		
		JButton btnmain1 = new JButton("ó�� ���� �е鿡�� ��õ �޴� ~~!!");
		btnmain1.setLocation(20, 80);
		btnmain1.setSize(250, 50);
		add(btnmain1);
		
		JButton btnmain2 = new JButton("����� �����ؼ� ���ùޱ�!");
		btnmain2.setLocation(20, 150);
		btnmain2.setSize(250, 50);
		add(btnmain2);
		
		
		ImageIcon icon = new ImageIcon("image/smoothie/smoothie_01.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon beforeMenu = new ImageIcon(changeImg);
		
		JLabel lbmain5 = new JLabel(beforeMenu);
		lbmain5.setLocation(20, 240);
		lbmain5.setSize(120, 120);
		add(lbmain5);
		
		JButton btnmain3 = new JButton("HOME");
		btnmain3.setBackground(Color.RED);
		btnmain3.setLocation(1, 400);
		btnmain3.setSize(70, 50);
		add(btnmain3);
		
		
		JButton btnmain4 = new JButton("PAY");
		btnmain4.setBackground(Color.RED);
		btnmain4.setLocation(73, 400);
		btnmain4.setSize(60, 50);
		add(btnmain4);
		
		JButton btnmain5 = new JButton("ORDER");
		btnmain5.setBackground(Color.RED);
		btnmain5.setLocation(135, 400);
		btnmain5.setSize(75, 50);
		add(btnmain5);
		
		JButton btnmain6 = new JButton("�� ����");
		btnmain6.setBackground(Color.RED);
		btnmain6.setLocation(212, 400);
		btnmain6.setSize(80, 50);
		add(btnmain6);
		
		
	}
	
}