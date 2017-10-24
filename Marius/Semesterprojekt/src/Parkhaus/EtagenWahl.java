package Parkhaus;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EtagenWahl extends JPanel{
	private Parkhaus prk;
	JButton[] etagenw;
	private JLabel preis;
	
	public EtagenWahl(Parkhaus prk,JLabel preis)
	{
		this.prk=prk;
		this.preis=preis;
		setLayout(new GridLayout(1,4));
		etagenw=new JButton[4];
		for(int i=0;i<4;i++){
			etagenw[i]=new JButton("Etage: "+i);
			etagenw[i].setPreferredSize(new Dimension(100,100));
			etagenw[i].addMouseListener(new EtageAuswahl(prk,i,preis));
			add(etagenw[i]);
		}
		
	}
	

}
