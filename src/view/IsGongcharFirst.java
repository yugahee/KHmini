package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class IsGongcharFirst {
	private IsGongcharFirst IsGongcharFirst;
	
	public IsGongcharFirst() {
		JFrame frame = new JFrame("HOW TO ORDER");
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		
		try {
			frame.setIconImage(ImageIO.read(new File("image/mainTitle.jpg")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		frame.setBounds(450, 200, 360, 600);//(360, 600);
		
		JLabel label = new JLabel();
		
		label.setHorizontalAlignment(JLabel.CENTER);
		Image img = new ImageIcon("image/isgongcharfirst.png").getImage();
		label.setIcon(new ImageIcon(img));

		panel.add(label);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					frame.setVisible(false);
				}}
		});
		
	}
	
	public static void main(String[] args) {
		new IsGongcharFirst();
	}
	

	
}
