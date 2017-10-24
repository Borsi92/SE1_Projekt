package Parkhaus;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Utility extends JPanel{
	private Parkhaus prk;
	private EtagenWahl ew;
	private JLabel preis;
	
	public Utility(Parkhaus prk){
		
		super();
		this.prk=prk;
		setLayout(new BorderLayout());
		preis=new JLabel("Etage Waehlen!");
		preis.setPreferredSize(new Dimension(140,100));
		ew=new EtagenWahl(prk,preis);
		add(preis,BorderLayout.EAST);
		add(ew,BorderLayout.CENTER);
		setVisible(true);
		repaint();
		
		
	}
	public Parkhaus getParkhaus(){
		return prk;
	}

}
