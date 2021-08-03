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

		lb[1] = new JLabel("����, ����");
		lb[1].setFont(new Font("", Font.BOLD, 25));
		lb[1].setLocation(50, 20);
		lb[1].setSize(150, 30);
		add(lb[1]);

		lb[2] = new JLabel("���� ����");
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
		lb[4] = new JLabel(format + "��");
		lb[4].setLocation(70, 90);
		lb[4].setSize(80, 80);
		add(lb[4]);

		lb[5] = new JLabel("���� ī��");
		lb[5].setLocation(70, 70);
		lb[5].setSize(80, 80);
		add(lb[5]);

		lb[6] = new JLabel("���� ���� ����Ʈ");
		lb[6].setLocation(160, 70);
		lb[6].setSize(120, 80);
		add(lb[6]);

		Controller.point += 3600;
		String format2 = String.format("%,d", Controller.point);
		lb[7] = new JLabel(format2 + "P");
		lb[7].setLocation(160, 90);
		lb[7].setSize(80, 80);
		add(lb[7]);

		lb[8] = new JLabel("�ֹ� ����");
		lb[8].setLocation(5, 130);
		lb[8].setSize(130, 60);
		lb[8].setFont(new Font("", Font.BOLD, 25));
		add(lb[8]);

		String menu[] = { "�Ƹ޸�ī��", "����ũƼ" };
		int price[] = { 3500, 4400 };
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.white);
		ta.setEditable(false);
		ta.setLocation(5, 190);
		ta.setSize(250, 80);
		ta.append(menu[1] + "(" + price[1] + "��)\n");
		ta.append("Large|ICED|Less|30%|��ũ��|���ڳ�\n");
		ta.append(menu[0] + "(" + price[0] + "��)\n");
		ta.append("Large|ICED|Less|30%|��ũ��|���ڳ�\n");
		add(ta);
		TextArea ta2 = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		ta2.setBackground(Color.white);
		ta2.setEditable(false);
		ta2.setLocation(5, 270);
		ta2.setSize(150, 60);
		Controller.order = (price[1] + price[0]);

		ta2.append("�ֹ� �ݾ� (" + Controller.order + "��)\n");
		ta2.append("���� �ݾ� (" + Controller.pointpay + "��)\n");
		ta2.append("���� ���� �ݾ� (" + (Controller.order - Controller.pointpay) + "��)");
		add(ta2);
		btn[0] = new JButton("����Ʈ ���");
		btn[0].setBackground(Color.red);
		btn[0].setLocation(160, 280);
		btn[0].setSize(130, 40);
		add(btn[0]);

		btn[1] = new JButton(Controller.order + "�� �����ϱ�");
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
					ta2.setText("�ֹ� �ݾ� (" + (price[1] + price[0]) + "��)\n");
					ta2.append("���� �ݾ� (" + Controller.pointpay + "��)\n");
					ta2.append("���� ���� �ݾ� (" + Controller.order2 + "��)");
					btn[1].setText(Controller.order2 + "�� �����ϱ�");
					btn[0].setEnabled(false);
					Controller.point = 0;
				}
			}
		});

	}
}
