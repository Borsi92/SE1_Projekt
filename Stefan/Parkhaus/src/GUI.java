import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args){
		
		ImageIcon car = scaleImage(new ImageIcon("auto.png"), 100, 80);
		JButton carBtn = new JButton(car);
		carBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("AUTO GEKLICKT!");
			}			
		});
		JButton carBtn2 = new JButton(car);
		
		JFrame frame = new JFrame();
		frame.setTitle("Parkhaus by BorsiTech");
		frame.setSize(840, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6,3));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(6,3));
		
		panel.add(new JButton());
		panel.add(new JLabel());
		panel.add(new JButton());
		panel.add(new JButton());
		panel.add(new JLabel());
		panel.add(new JButton());
		panel.add(new JButton());
		panel.add(new JLabel());
		panel.add(carBtn);
		panel.add(new JButton());
		panel.add(new JLabel());
		panel.add(new JButton());
		panel.add(new JButton());
		panel.add(new JLabel());
		panel.add(new JButton());
		panel.add(new JButton());
		panel.add(new JLabel());
		panel.add(new JButton());		
		
		panel2.add(new JButton());
		panel2.add(new JLabel());
		panel2.add(new JButton());
		panel2.add(new JButton());
		panel2.add(new JLabel());
		panel2.add(new JButton());
		panel2.add(new JButton());
		panel2.add(new JLabel());
		panel2.add(new JButton());
		panel2.add(new JButton());
		panel2.add(new JLabel());
		panel2.add(new JButton());
		panel2.add(new JButton());
		panel2.add(new JLabel());
		panel2.add(new JButton());
		panel2.add(new JButton());
		panel2.add(new JLabel());
		panel2.add(carBtn2);
		
		frame.add(panel);
		frame.add(panel2);
		panel2.setVisible(false);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
	}
	
	private static ImageIcon scaleImage(ImageIcon imgIcon, int w, int h){
		Image newImg = imgIcon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return new ImageIcon(newImg);
	}
	
}
