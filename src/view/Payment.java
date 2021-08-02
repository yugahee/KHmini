package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Payment extends JPanel {

	public Payment() {

		JLabel[] lb = new JLabel[15];
		JButton[] btn = new JButton[2];
		
		setBackground(Color.white);
		setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		lb[0] = new JLabel(mainImage);
		lb[0].setLocation(5, 5);
		lb[0].setSize(40, 60);
		add(lb[0]);

		lb[1] = new JLabel("적립, 결제");
		lb[1].setFont(new Font("", Font.BOLD, 25));
		lb[1].setLocation(50, 20);
		lb[1].setSize(150, 30);
		add(lb[1]);

		lb[2] = new JLabel("결제 수단");
		lb[2].setFont(new Font("", Font.BOLD, 25));
		lb[2].setLocation(5, 70);
		lb[2].setSize(130, 30);
		add(lb[2]);

		ImageIcon icon2 = new ImageIcon("image/payimage.png");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(60, 40, Image.SCALE_SMOOTH);
		ImageIcon pay = new ImageIcon(changeImg2);
		lb[3] = new JLabel(pay);
		lb[3].setLocation(5, 100);
		lb[3].setSize(60, 40);
		add(lb[3]);

		Controller.money -= 1000;
		String format = String.format("%,d", Controller.money);
		lb[4] = new JLabel(format + "원");
		lb[4].setLocation(70, 90);
		lb[4].setSize(80, 80);
		add(lb[4]);

		lb[5] = new JLabel("공차 카드");
		lb[5].setLocation(70, 70);
		lb[5].setSize(80, 80);
		add(lb[5]);

		lb[6] = new JLabel("보유 적립 포인트");
		lb[6].setLocation(160, 70);
		lb[6].setSize(120, 80);
		add(lb[6]);

		Controller.point += 3600;
		String format2 = String.format("%,d", Controller.point);
		lb[7] = new JLabel(format2 + "P");
		lb[7].setLocation(160, 90);
		lb[7].setSize(80, 80);
		add(lb[7]);

		lb[8] = new JLabel("주문 내역");
		lb[8].setLocation(5, 130);
		lb[8].setSize(130, 60);
		lb[8].setFont(new Font("", Font.BOLD, 25));
		add(lb[8]);

		String menu[] = { "아메리카노", "블랙밀크티" };
		int price[] = { 3500, 4400 };
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.white);
		ta.setEditable(false);
		ta.setLocation(5, 190);
		ta.setSize(250, 80);
		ta.append(menu[1] + "(" + price[1] + "원)\n");
		ta.append("Large|ICED|Less|30%|밀크폼|코코넛\n");
		ta.append(menu[0] + "(" + price[0] + "원)\n");
		ta.append("Large|ICED|Less|30%|밀크폼|코코넛\n");
		add(ta);
		TextArea ta2 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		ta2.setBackground(Color.white);
		ta2.setEditable(false);
		ta2.setLocation(5, 270);
		ta2.setSize(150, 60);
		Controller.order = (price[1] + price[0]);

		ta2.append("주문 금액 (" + Controller.order + "원)\n");
		ta2.append("할인 금액 (" + Controller.pointpay + "원)\n");
		ta2.append("최종 결제 금액 (" + (Controller.order - Controller.pointpay) + "원)");
		add(ta2);
		btn[0] = new JButton("포인트 사용");
		btn[0].setBackground(Color.red);
		btn[0].setLocation(160, 280);
		btn[0].setSize(130, 40);
		add(btn[0]);

		btn[1] = new JButton(Controller.order + "원 결제하기");
		btn[1].setBackground(Color.red);
		btn[1].setLocation(20, 350);
		btn[1].setSize(250, 30);
		add(btn[1]);

		btn[0].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Controller.pointpay == 0) {
					Controller.pointpay = Controller.point;
					Controller.order2 = (Controller.order - Controller.pointpay);
					ta2.setText("주문 금액 (" + (price[1] + price[0]) + "원)\n");
					ta2.append("할인 금액 (" + Controller.pointpay + "원)\n");
					ta2.append("최종 결제 금액 (" + Controller.order2 + "원)");
					btn[1].setText(Controller.order2 + "원 결제하기");
					btn[0].setEnabled(false);
					Controller.point = 0;
				}
			}
		});

	}
}
