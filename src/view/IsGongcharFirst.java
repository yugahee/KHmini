package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class IsGongcharFirst extends JPanel {
	private Home home;
	private JPanel IsGongcharFirst;
	
	public IsGongcharFirst(Home home) {
		this.home = home;
		this.IsGongcharFirst = this;
		
		this.setBackground(Color.white);
		JLabel label = new JLabel();
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		Image img = new ImageIcon("image/isgoncharfirst.PNG").getImage();
		label.setIcon(new ImageIcon(img));
		
		this.add(label);
		
		this.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		}
		});
		
		
		
	}

	
}
