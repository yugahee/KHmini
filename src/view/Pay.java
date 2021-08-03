package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pay extends JPanel {
	int money = 50000;
	String format = String.format("%,d", money);

	Pay() {
		setBackground(Color.WHITE);

		setLayout(null);

		JLabel lbMoney = new JLabel(format);
		lbMoney.setLocation(100, 110);
		lbMoney.setSize(150, 50);
		lbMoney.setFont(new Font("굵음", Font.BOLD, 30));
		add(lbMoney);

		ImageIcon icon2 = new ImageIcon("image/payimage.png");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(230, 120, Image.SCALE_SMOOTH);
		ImageIcon pay = new ImageIcon(changeImg2);

		JLabel lbmain6 = new JLabel(pay);
		lbmain6.setLocation(30, 70);
		lbmain6.setSize(230, 120);
		add(lbmain6);

		ImageIcon icon3 = new ImageIcon("image/barcode.png");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(130, 70, Image.SCALE_SMOOTH);
		ImageIcon barcode = new ImageIcon(changeImg3);

		JLabel lbmain7 = new JLabel(barcode);
		lbmain7.setLocation(85, 220);
		lbmain7.setSize(130, 70);
		add(lbmain7);

		JLabel lpay1 = new JLabel("공차페이");
		lpay1.setLocation(40, 20);
		lpay1.setSize(100, 20);
		lpay1.setFont(new Font("굴림", Font.BOLD, 20));
		add(lpay1);

		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		JLabel lbmain = new JLabel(mainImage);

		JLabel lpay2 = new JLabel(mainImage);
		lpay2.setLocation(5, 5);
		lpay2.setSize(40, 60);
		add(lpay2);

		JButton payButton1 = new JButton("Home");
		payButton1.setLocation(180, 5);
		payButton1.setSize(100, 50);
		add(payButton1);

		JButton btnpay1 = new JButton("결제 내역 확인");
		btnpay1.setLocation(75, 320);
		btnpay1.setSize(150, 50);
		add(btnpay1);

		JButton btnpay2 = new JButton("충전 하기");
		btnpay2.setLocation(75, 380);
		btnpay2.setSize(150, 50);
		add(btnpay2);

	}
}
