package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Cake extends JPanel {
	
	public Cake() {

		//���� panel ���� 
		setLayout(null);
		setBackground(Color.WHITE);

		// ���� ���� �ΰ� ����
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50, 0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		add(lbmain);

		// Cake title ����
		JLabel title = new JLabel("Cake");
		title.setLocation(104, -50);
		title.setSize(500, 150);
		title.setFont(new Font("", Font.BOLD, 20));
		add(title);

		// �޴� ��� ����
		String[] Cakes = {"ġ�� ����ũ", "���� ����ũ"};
		JComboBox<String> CakeList = new JComboBox(Cakes);
		CakeList.setBackground(Color.white);
		CakeList.setSelectedIndex(0);
		CakeList.setLocation(160, 10);
		CakeList.setSize(100, 30);
		add(CakeList);
		
		//Cake ���� ����
		JLabel label = new JLabel();
		Image Cakeimage = new ImageIcon("image/Cake/Cake_01.jpg").getImage().getScaledInstance(90,100,0);
		label.setIcon(new ImageIcon(Cakeimage));
		label.setLocation(90, 30);
		label.setSize(100, 150);
		add(label); // *��ư Ŭ�� �̺�Ʈ �߰��ؾ� ��

		

		

		// ���߱�1
		JButton line = new JButton();
		line.setLocation(20, 214);
		line.setSize(240, 1);
		line.setBackground(Color.LIGHT_GRAY);
		add(line);

	

		// ���߱�2
		JButton line2 = new JButton();
		line2.setLocation(20, 284);
		line2.setSize(240, 1);
		line2.setBackground(Color.LIGHT_GRAY);
		add(line2);

	

		// ���� text ����
		JLabel quantity = new JLabel("����");
		quantity.setLocation(100, 310);
		quantity.setSize(500, 150);
//	quantity.setFont(new Font("", Font.BOLD, 16));
		add(quantity);

		// ���� spinner ����
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 100, 1);
		JSpinner spinner = new JSpinner(numberModel);
		spinner.setLocation(135, 370);
		spinner.setSize(55, 30);
		add(spinner);

		// ���� text ����
		JLabel price = new JLabel(Controller.order+"��");
		price.setLocation(205, 310);
		price.setSize(500, 150);
		price.setFont(new Font("", Font.BOLD, 16));
		add(price);

		// �ڷΰ��� ��ư ����
		JButton back = new JButton("Back");
		back.setForeground(Color.white);
		back.setLocation(20, 410);
		back.setSize(65, 30);
		Color gongcha = new Color(184, 27, 46);
		back.setBackground(gongcha);
		add(back);

		// ��ٱ��� ��ư ����
		JButton choose = new JButton("��ٱ���");
		choose.setForeground(Color.white);
		choose.setLocation(180, 410);
		choose.setSize(86, 30);
		choose.setBackground(gongcha);
		add(choose);

	}
}