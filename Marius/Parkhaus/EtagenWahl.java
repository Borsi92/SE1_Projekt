package Parkhaus;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class EtagenWahl extends JPanel{
	private Parkhaus prk;
	JButton[] etagenw;
	
	public EtagenWahl(Parkhaus prk)
	{
		this.prk=prk;
		setLayout(new GridLayout(0,4));
		etagenw=new JButton[4];
		for(int i=0;i<4;i++){
			etagenw[i]=new JButton("Etage: "+i);
			etagenw[i].addMouseListener(new EtageAuswahl(prk,i));
			add(etagenw[i]);
		}
		
	}
	

}
