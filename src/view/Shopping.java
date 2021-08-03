package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import roundedButton.RoundedButton;

public class Shopping extends JPanel {
	
	public Shopping() {

		//���� panel ����� 
		setLayout(null);
		setBackground(Color.WHITE);

		//���� ���� �ΰ� �ֱ�
		JLabel lbmain = new JLabel();
		Image mainImage = new ImageIcon("image/mainTitle.jpg").getImage().getScaledInstance(40, 50,0);
		lbmain.setIcon(new ImageIcon(mainImage));
		lbmain.setLocation(5, -2);
		lbmain.setSize(40, 60);
		add(lbmain);
		
		//��ٱ��� title ����
		JLabel title = new JLabel("��ٱ���");
		title.setLocation(55, -47);
		title.setSize(500,150);
		title.setFont(new Font("", Font.BOLD, 22));
		add(title);
		
		//���� �˻� ��ư ����
		String text = "�ֹ��� ������ ������ �ּ���";
		JButton button = new JButton(text);
		button.setFont(new Font("", Font.BOLD, 15));
		button.setSize(270, 33);
		button.setLocation(12, 65);
		Color gongcha = new Color(184, 27, 46);
		button.setBackground(new Color(240,240,240));
		add(button);
		
		
		//��ǰ ���� ����
		JLabel label = new JLabel();
		Image MilkTeaimage = new ImageIcon("image/MilkTea/MilkTea_01.jpg").getImage().getScaledInstance(80,90,0);
		label.setIcon(new ImageIcon(MilkTeaimage));
		label.setLocation(20, 90);
		label.setSize(100, 150);
		add(label); 
		

		//��ǰ �̸�
		JLabel name = new JLabel("�� ��ũƼ");
		name.setLocation(106, 55);
		name.setSize(500,150);
		name.setFont(new Font("", Font.BOLD, 13));
		add(name);
		
		//�ֹ� ����
		String order = "ICED | Less | 30% | ��ũ�� | ���ڳ�";
		JLabel order2 = new JLabel(order);
		order2.setLocation(108, 0);
		order2.setSize(300, 300);
		order2.setFont(new Font("", Font.PLAIN, 11));
		add(order2);
		
		//����
		String price = "4,400��";
		JLabel price2 = new JLabel(price);
		price2.setLocation(108, 18);
		price2.setSize(300, 300);
		price2.setFont(new Font("", Font.PLAIN, 11));
		add(price2);
		
		
		// ���� spinner ����
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 100, 1);
		JSpinner spinner = new JSpinner(numberModel);
		spinner.setLocation(106, 181);
		spinner.setSize(55, 22);
		add(spinner);
		
		// ���߱�
		JButton line = new JButton();
		line.setLocation(18, 214);
		line.setSize(254, 1);
		line.setBackground(Color.LIGHT_GRAY);
		add(line);
		
		
		//pink �ϴ� �г�
		JPanel pink = new JPanel();
		pink.setLayout(null);
		Color light = new Color(244,230,230);
		pink.setBackground(light);
		pink.setSize(300, 88);
		pink.setLocation(0, 379);
		add(pink);
		
		
		// ���� text ����
		JLabel all = new JLabel(Controller.order+"��");
		all.setLocation(240, 2);
		all.setSize(50, 50);
		all.setFont(new Font("", Font.BOLD, 20));
		pink.add(all);
		
		// �� �Ǽ� ����
		JLabel cases = new JLabel("�� 2��");
		cases.setLocation(17,1);
		cases.setSize(50, 50);
		cases.setFont(new Font("", Font.BOLD, 14));
		pink.add(cases);
		
		
		// �ֹ��ϱ� ��ư ����
		JButton choose = new RoundedButton("�ֹ��ϱ�");
		choose.setForeground(Color.white);
		choose.setLocation(90, 50);
		choose.setSize(100, 24);
		choose.setFont(new Font("", Font.BOLD, 13));
		choose.setBackground(gongcha);
		pink.add(choose);
		
		
				
				
		
	}
}
