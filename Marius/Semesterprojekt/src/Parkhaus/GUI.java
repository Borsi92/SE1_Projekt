package Parkhaus;

import java.applet.Applet;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GUI extends JFrame{
	Parkhaus prk;
	Utility ut;
	private UntereLeiste ul;
	public GUI()
	{
		super();
		setSize(600,540);
		prk=new Parkhaus(this);
		setVisible(true);
		ut=new Utility(prk);
		ul=new UntereLeiste(new AutoDisplay(new Auto()));
		setLayout(new BorderLayout());
		add(ut,BorderLayout.NORTH);
		add(prk,BorderLayout.CENTER);
		add(ul,BorderLayout.SOUTH);
		repaint();
		
		
	}
	
	public UntereLeiste getUntereLeiste(){
		return ul;
	}

}
