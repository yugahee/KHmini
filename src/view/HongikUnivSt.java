package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HongikUnivSt extends JPanel{
	
	HongikUnivSt(){
		setBackground(Color.WHITE);
		
		setLayout(null);
		
		JLabel lk1 = new JLabel("ȫ����");
		lk1.setLocation(30, 22);
		lk1.setSize(100, 20);
		lk1.setFont(new Font("����", Font.BOLD, 20));
		add(lk1);
		
		ImageIcon icon1 = new ImageIcon("image/store/hongikUnivSt.jpg");
		Image img1 = icon1.getImage();
		Image changeImg1 = img1.getScaledInstance(230, 120, Image.SCALE_SMOOTH);
		ImageIcon hongikUnivSt = new ImageIcon(changeImg1);

		JLabel ik1 = new JLabel(hongikUnivSt);
		ik1.setLocation(27, 50);
		ik1.setSize(245, 150);
		add(ik1);
		
		JLabel lk2 = new JLabel("���� ������ ������ 345-13");
		lk2.setLocation(30, 190);
		lk2.setSize(300, 25);
		lk2.setFont(new Font("����", Font.BOLD, 13));
		add(lk2);
		
		JLabel lk3 = new JLabel("���ô±�");
		lk3.setLocation(30, 220);
		lk3.setSize(300, 25);
		lk3.setFont(new Font("����", Font.BOLD, 11));
		add(lk3);
		
		JLabel lk4 = new JLabel("ȫ���Ա��� 9�� �ⱸ, ���� 5��");
		lk4.setLocation(80, 220);
		lk4.setSize(300, 25);
		lk4.setFont(new Font("����", Font.PLAIN, 10));
		add(lk4);
		
		JLabel lk5 = new JLabel("�����ð�");
		lk5.setLocation(30, 250);
		lk5.setSize(300, 25);
		lk5.setFont(new Font("����", Font.BOLD, 11));
		add(lk5);
		
		JLabel lk6 = new JLabel("���� 10 : 00 ~  23 : 00");
		lk6.setLocation(80, 250);
		lk6.setSize(300, 25);
		lk6.setFont(new Font("����", Font.PLAIN, 10));
		add(lk6);
		
		JLabel lk7 = new JLabel("���� ����");
		lk7.setLocation(30, 275);
		lk7.setSize(300, 25);
		lk7.setFont(new Font("����", Font.BOLD, 11));
		add(lk7);
		
		JLabel lk8 = new JLabel("T�����, īī������, ������, ��ȭ��ǰ��");
		lk8.setLocation(100, 275);
		lk8.setSize(300, 25);
		lk8.setFont(new Font("����", Font.PLAIN, 10));
		add(lk8);
		
		ImageIcon pickupIcon = new ImageIcon("image/pickupbutton2.png");
		Image img2 = pickupIcon.getImage();
		Image changeImg2 = img2.getScaledInstance(220, 40, Image.SCALE_SMOOTH);
		ImageIcon pickupbutton = new ImageIcon(changeImg2);
		
		JButton btnpickup = new JButton(pickupbutton);
		btnpickup.setBorder(new EmptyBorder(20, 20, 20, 20));
		btnpickup.setBackground(Color.WHITE);
		
		btnpickup.setLocation(37, 350);
		btnpickup.setSize(220, 40);
		add(btnpickup);
	}
	
}


