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
		JLabel lbstore1 = new JLabel("매장 찾기");
		lbstore1.setLocation(100, 20);
		lbstore1.setSize(100, 20);
		lbstore1.setFont(new Font("굴림", Font.BOLD, 20));
		add(lbstore1);
		
		setLayout(null);
		JTextField jf = new JTextField();
		jf.setLocation(15, 60);
		jf.setSize(200, 30);
		add(jf);
		
		JButton payButton1 = new RoundedButton("찾기");
		payButton1.setBackground(new Color(180,45,60));
		payButton1.setForeground(Color.white);
		payButton1.setLocation(220, 60);
		payButton1.setSize(60, 30);
		add(payButton1);
		
String[] storeinformation = {"지점명", "위치"};
		
		String[][] rowData = {
				{"강남역점", "서울 강남구 역삼동 858 강남역지하상가 E-37"},
				{"건대점", "서울 광진구 화양동 5-43"},
				{"서울역점", "서울 중구 한강대로 405, ktx역 b1"},
				{"코엑스점", "서울 강남구 삼성동 159-1"},
				{"홍대점", "서울 마포구 서교동 345-13"}
		};

		DefaultTableModel dtm = new DefaultTableModel(rowData, storeinformation);
		
		JTable jta = new JTable(dtm);
		jta.setRowHeight(30);
		jta.getColumnModel().getColumn(0).setPreferredWidth(20);
		
		
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBorder(new TitledBorder("지점정보"));
		
		setLayout(null);
		add(jsp);
		jsp.setBounds(100, 150, 265, 250);
		jsp.setLocation(15, 120);


		
	}
	

	
}
