package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Join extends JPanel {
	public Join() {
		
		setBackground(Color.WHITE);
		setLayout(null);
		
		// ���� �ΰ�
		ImageIcon mainImage = new ImageIcon("image/mainImage.JPG");
		JLabel main = new JLabel(mainImage);
		main.setLocation(5, 5);
		main.setSize(40, 60);
		add(main);
		
		// Title
		JLabel join = new JLabel("����� �����ϰ� ���� �ޱ�");
		join.setLocation(50, 35);
		join.setSize(370, 20);
		join.setFont(new Font("����", Font.BOLD, 18));
		add(join);
		
		// Sub Title
		JLabel join2 = new JLabel("ȸ�� ���� �Է�");
		join2.setLocation(10, 75);
		join2.setSize(280, 20);
		join2.setFont(new Font("����", Font.BOLD, 15));
		add(join2);
		
		// ID
		JLabel joinId = new JLabel("���̵� �Է����ּ���(�̸���)");
		joinId.setLocation(15, 100);
		joinId.setSize(300, 30);
		add(joinId);
		JTextField id = new JTextField(20); /*{
			@Override
			public void setBorder(Border border) {	// �ؽ�Ʈ �ʵ� �׵θ� ���ֱ�
			}
		};*/
		id.setLocation(20, 130);
		id.setSize(250, 30);
		add(id);
		
		// PassWard
		JLabel joinPw = new JLabel("��й�ȣ�� �Է����ּ���");
		joinPw.setLocation(15, 180);
		joinPw.setSize(300, 30);
		add(joinPw);
		JTextField pw = new JTextField(20);
		pw.setLocation(20, 210);
		pw.setSize(250, 30);
		add(pw);
		
		// PhoneNumber
		JLabel joinNum = new JLabel("�޴�����ȣ�� �Է����ּ���");
		joinNum.setLocation(15, 240);
		joinNum.setSize(300, 30);
		add(joinNum);
		String[] ms = {"SKT", "KT", "LGU+", "�˶�"};
		JComboBox<String> msList = new JComboBox<>(ms);
		msList.setLocation(20, 270);
		msList.setSize(60, 30);
		add(msList);
		JTextField num = new JTextField(20);
		num.setLocation(90, 270);
		num.setSize(180, 30);
		add(num);
		
		// Name
		JLabel joinName = new JLabel("�г����� �Է����ּ���");
		joinName.setLocation(15, 320);
		joinName.setSize(300, 30);
		add(joinName);
		JTextField name = new JTextField(20);
		name.setLocation(20, 350);
		name.setSize(250, 30);
		add(name);
		
		// Button
		JButton joinBt = new JButton("�Ϸ�");
		joinBt.setBackground(new Color(184, 27, 46));
		joinBt.setLocation(100, 400);
		joinBt.setSize(60, 40);
		add(joinBt);
		
		joinBt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				
				
				
				
				
				// ȸ�� ���� ���� �Է� �ޱ�
				// ���� ���� ����
				// ���� �ߺ� ���� Ȯ��
				// �ߺ��� ���ٸ� Complete ȭ�� �ѱ��
				
				// ��ư Ȱ��ȭ + ȭ�� ��ȯ ��Ű��
			}
		});
	}
	public static void main(String[] args) {
		new Join();
	}
}
