import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GUI extends JFrame {

	public static void main(String[] args){
	
		new GUI();
		
	}
	
	public GUI(){
		this.setTitle("Parkhaus by BorsiTech");
		this.setSize(840, 680);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		Parkhaus parkhaus = new Parkhaus();
		
		Utility utility = new Utility(parkhaus, this);
		
		this.add(parkhaus, BorderLayout.CENTER);
		this.add(utility, BorderLayout.EAST);
		this.pack();
		this.setVisible(true);
	}
	
	
}
