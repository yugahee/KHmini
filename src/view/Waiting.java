package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Waiting extends JPanel{
	public Waiting() {
		JLabel[] lb = new JLabel[15];
		JButton btn = new JButton("확인");
		int ran = 1 + (int)(Math.random() * 100);
		
		
		setBackground(Color.white);
		setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		lb[0] = new JLabel(mainImage);
		lb[0].setLocation(5, 5);
		lb[0].setSize(40, 60);
		add(lb[0]);
		
		lb[1] = new JLabel("결제후 화면");
		lb[1].setFont(new Font("", Font.BOLD, 25));
		lb[1].setLocation(50, 20);
		lb[1].setSize(150, 30);
		add(lb[1]);
		
		lb[2] = new JLabel("대기 번호 : " + ran++ + "번");
		lb[2].setFont(new Font("", Font.BOLD, 30));
		lb[2].setLocation(40, 80);
		lb[2].setSize(250, 40);
		add(lb[2]);
		
		String menu[] = { "아메리카노", "블랙밀크티" };
		int price[] = { 3500, 4400 };
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.white);
		ta.setEditable(false);
		ta.setLocation(20, 170);
		ta.setSize(240, 70);
		ta.append(menu[1] + "(" + price[1] + "원)\n");
		ta.append("Large|ICED|Less|30%|밀크폼|코코넛\n");
		ta.append(menu[0] + "(" + price[0] + "원)\n");
		ta.append("Large|ICED|Less|30%|밀크폼|코코넛\n");
		add(ta);
		TextArea ta2 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		ta2.setBackground(Color.white);
		ta2.setEditable(false);
		ta2.setLocation(20, 240);
		ta2.setSize(150, 60);
		Controller.order = (price[1] + price[0]);
		Controller.order2 = 7900;
		ta2.append("주문 금액 (" + Controller.order + "원)\n");
		ta2.append("할인 금액 (" + Controller.pointpay + "원)\n");
		ta2.append("최종 결제 금액 (" + Controller.order2 + "원)");
		add(ta2);
		
		TextArea ta3 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		ta3.setBackground(Color.white);
		ta3.setEditable(false);
		ta3.setLocation(20, 300);
		ta3.setSize(150, 50);
		ta3.append("결제 후 잔액 (" + (Controller.money - Controller.order2) + "원)\n");
		ta3.append("포인트 적립 (" + (Controller.order2/10) + "P)\n");
		ta3.append("보유 포인트 (" + (Controller.point + Controller.order2/10) + "P)");
		
		add(ta3);
		
		btn.setBackground(Color.WHITE);
		btn.setLocation(100, 370);
		btn.setSize(90, 40);
		add(btn);
	}
}
