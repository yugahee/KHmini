package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JoinComplete extends JPanel {
	public JoinComplete() {
		
		// �г� ����
		setBackground(Color.white);
		setLayout(null);
		
		ImageIcon mainImage = new ImageIcon("Image/main.PNG");
		Image img = mainImage.getImage();
		Image changeImg = img.getScaledInstance(120, 230, Image.SCALE_SMOOTH);
		ImageIcon main = new ImageIcon(changeImg);
		
		JLabel join = new JLabel(main);
		join.setLocation(80, 50);
		join.setSize(120, 230);
		add(join);
		
		// �ȳ��޽���
		JLabel lb = new JLabel("OO��");
		lb.setLocation(120, 280);
		lb.setSize(65, 20);
		lb.setFont(new Font("����", Font.BOLD, 20));
		add(lb);
		JLabel lb2 = new JLabel("ȸ�� ������ �Ϸ�Ǿ����ϴ�");
		lb2.setLocation(15, 300);
		lb2.setSize(400, 20);
		lb2.setFont(new Font("����", Font.BOLD, 20));
		add(lb2);
		JLabel lb3 = new JLabel("���� ���� ����Ͻð� �������� �޾ƺ�����");
		lb3.setLocation(20, 350);
		lb3.setSize(400, 15);
		add(lb3);
		
		// �α��� ��ư => ���� �޴�
		JButton bt = new JButton("�α���");
		bt.setBackground(new Color(184, 27, 46));
		bt.setLocation(100, 400);
		bt.setSize(80, 20);
		add(bt);
		
		this.setVisible(true);
	}

}
