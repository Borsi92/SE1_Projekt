package Parkhaus;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Utility extends JPanel{
	private Parkhaus prk;
	private EtagenWahl ew;
	
	public Utility(Parkhaus prk){
		
		super();
		this.prk=prk;
		setLayout(new BorderLayout());
		ew=new EtagenWahl(prk);
		add(ew,BorderLayout.CENTER);
		setVisible(true);
		repaint();
		
		
	}
	public Parkhaus getParkhaus(){
		return prk;
	}

}
