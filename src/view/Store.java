package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import roundedButton.RoundedButton;

public class Store extends JPanel {
	
	Store(){
		setBackground(Color.WHITE);
		
		setLayout(null);
		JLabel lbstore1 = new JLabel("���� ã��");
		lbstore1.setLocation(100, 20);
		lbstore1.setSize(100, 20);
		lbstore1.setFont(new Font("����", Font.BOLD, 20));
		add(lbstore1);
		
		setLayout(null);
		JTextField jf = new JTextField();
		jf.setLocation(15, 60);
		jf.setSize(200, 30);
		add(jf);
		
		JButton payButton1 = new RoundedButton("ã��");
		payButton1.setBackground(new Color(180,45,60));
		payButton1.setForeground(Color.white);
		payButton1.setLocation(220, 60);
		payButton1.setSize(60, 30);
		add(payButton1);
		
String[] storeinformation = {"������", "��ġ"};
		
		String[][] rowData = {
				{"��������", "���� ������ ���ﵿ 858 ���������ϻ� E-37"},
				{"�Ǵ���", "���� ������ ȭ�絿 5-43"},
				{"���￪��", "���� �߱� �Ѱ���� 405, ktx�� b1"},
				{"�ڿ�����", "���� ������ �Ｚ�� 159-1"},
				{"ȫ����", "���� ������ ������ 345-13"}
		};

		DefaultTableModel dtm = new DefaultTableModel(rowData, storeinformation);
		
		JTable jta = new JTable(dtm);
		jta.setRowHeight(30);
		jta.getColumnModel().getColumn(0).setPreferredWidth(20);
		
		
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("��������"));
		
		setLayout(null);
		add(jsp);
		jsp.setBounds(100, 150, 265, 250);
		jsp.setLocation(15, 120);


		
	}
	

	
}
