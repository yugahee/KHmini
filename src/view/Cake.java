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

import roundedButton.RoundedButton;

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
		JLabel title = new JLabel("Bakery");
		title.setLocation(80, -50);
		title.setSize(500, 150);
		title.setFont(new Font("", Font.BOLD, 20));
		add(title);
		
		// Cake information ����
		String infor = "<html>��� ũ���� ��ŭ�԰� ���� ġ���� ���� ���ÿ� <br>���� �� �ִ� ����ũ �Դϴ�.</html>";
		JLabel infor2 = new JLabel(infor);
		infor2.setLocation(25, 98);
		infor2.setSize(300, 150);
		infor2.setFont(new Font("", Font.PLAIN, 11));
		add(infor2);
		
		
		// ���߱�1
		JButton line = new JButton();
		line.setLocation(20, 196);
		line.setSize(240, 1);
		line.setBackground(Color.LIGHT_GRAY);
		add(line);
		
		
		//��ǰ�������� text ����
		JLabel text = new JLabel("��ǰ ���� ����");
		text.setLocation(23, 136);
		text.setSize(500,150);
		text.setFont(new Font("", Font.BOLD, 13));
		add(text);
		
		
		//��ǰ ���� ���� ���� ����
		String explain = "<html>Į�θ�&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;550kcal"
				+ "<br>���&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 26g"
				+ "<br>��Ʈ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;435mg"
				+ "<br>�ܹ���&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7g<br>"
				+ "��ȭ����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;25g</html>";
		JLabel explain2 = new JLabel(explain);
		explain2.setLocation(25, 115);
		explain2.setSize(300, 300);
		explain2.setFont(new Font("", Font.PLAIN, 11));
		add(explain2);
		
		
		// ���߱�2
		JButton line2 = new JButton();
		line2.setLocation(20, 314);
		line2.setSize(240, 1);
		line2.setBackground(Color.LIGHT_GRAY);
		add(line2);
		
		//�˷����� ���� ���� text ����
		JLabel all = new JLabel("�˷����� ���� ����");
		all.setLocation(23, 256);
		all.setSize(500,150);
		all.setFont(new Font("", Font.BOLD, 13));
		add(all);
		
		//�˷����� ���� ���� ���� ����
		String alltext = "����, ����, ��, ��Ȳ���";
		JLabel alltext2 = new JLabel(alltext);
		alltext2.setLocation(25, 202);
		alltext2.setSize(300, 300);
		alltext2.setFont(new Font("", Font.PLAIN, 11));
		add(alltext2);

		

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
		Image Cakeimage = new ImageIcon("image/Bakery/Cake_01.jpg").getImage().getScaledInstance(90,100,0);
		label.setIcon(new ImageIcon(Cakeimage));
		label.setLocation(90, 30);
		label.setSize(100, 150);
		add(label); // *��ư Ŭ�� �̺�Ʈ �߰��ؾ� ��

		

		

		

	

		
	

		// ���� text ����
		JLabel quantity = new JLabel("����");
		quantity.setLocation(100, 310);
		quantity.setSize(500, 150);
//	quantity.setFont(new Font("", Font.BOLD, 16));
		add(quantity);

		
		// ���� spinner ����
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 100, 1);
		JSpinner spinner = new JSpinner(numberModel);
		spinner.setLocation(135, 375);
		spinner.setSize(55, 30);
		add(spinner);

		// ���� text ����
		JLabel price = new JLabel(Controller.order+"��");
		price.setLocation(205, 315);
		price.setSize(500, 150);
		price.setFont(new Font("", Font.BOLD, 16));
		add(price);

		// �ڷΰ��� ��ư ����
		JButton back = new RoundedButton("Back");
		back.setForeground(Color.white);
		back.setLocation(20, 415);
		back.setSize(65, 30);
		Color gongcha = new Color(184, 27, 46);
		back.setBackground(gongcha);
		add(back);

		// ��ٱ��� ��ư ����
		JButton choose = new RoundedButton("��ٱ���");
		choose.setForeground(Color.white);
		choose.setLocation(210, 415);
		choose.setSize(65, 30);
		choose.setBackground(gongcha);
		add(choose);

	}
}