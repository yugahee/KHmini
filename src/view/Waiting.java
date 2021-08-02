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
		JButton btn = new JButton("Ȯ��");
		int ran = 1 + (int)(Math.random() * 100);
		
		
		setBackground(Color.white);
		setLayout(null);
		ImageIcon mainImage = new ImageIcon("image/mainTitle.jpg");
		lb[0] = new JLabel(mainImage);
		lb[0].setLocation(5, 5);
		lb[0].setSize(40, 60);
		add(lb[0]);
		
		lb[1] = new JLabel("������ ȭ��");
		lb[1].setFont(new Font("", Font.BOLD, 25));
		lb[1].setLocation(50, 20);
		lb[1].setSize(150, 30);
		add(lb[1]);
		
		lb[2] = new JLabel("��� ��ȣ : " + ran++ + "��");
		lb[2].setFont(new Font("", Font.BOLD, 30));
		lb[2].setLocation(40, 80);
		lb[2].setSize(250, 40);
		add(lb[2]);
		
		String menu[] = { "�Ƹ޸�ī��", "����ũƼ" };
		int price[] = { 3500, 4400 };
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.white);
		ta.setEditable(false);
		ta.setLocation(20, 170);
		ta.setSize(240, 70);
		ta.append(menu[1] + "(" + price[1] + "��)\n");
		ta.append("Large|ICED|Less|30%|��ũ��|���ڳ�\n");
		ta.append(menu[0] + "(" + price[0] + "��)\n");
		ta.append("Large|ICED|Less|30%|��ũ��|���ڳ�\n");
		add(ta);
		TextArea ta2 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		ta2.setBackground(Color.white);
		ta2.setEditable(false);
		ta2.setLocation(20, 240);
		ta2.setSize(150, 60);
		Controller.order = (price[1] + price[0]);
		Controller.order2 = 7900;
		ta2.append("�ֹ� �ݾ� (" + Controller.order + "��)\n");
		ta2.append("���� �ݾ� (" + Controller.pointpay + "��)\n");
		ta2.append("���� ���� �ݾ� (" + Controller.order2 + "��)");
		add(ta2);
		
		TextArea ta3 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		ta3.setBackground(Color.white);
		ta3.setEditable(false);
		ta3.setLocation(20, 300);
		ta3.setSize(150, 50);
		ta3.append("���� �� �ܾ� (" + (Controller.money - Controller.order2) + "��)\n");
		ta3.append("����Ʈ ���� (" + (Controller.order2/10) + "P)\n");
		ta3.append("���� ����Ʈ (" + (Controller.point + Controller.order2/10) + "P)");
		
		add(ta3);
		
		btn.setBackground(Color.WHITE);
		btn.setLocation(100, 370);
		btn.setSize(90, 40);
		add(btn);
	}
}
