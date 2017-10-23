package Parkhaus;

import java.applet.Applet;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GUI extends JFrame{
	Parkhaus prk;
	Utility ut;
	public GUI()
	{
		super();
		setSize(680,400);
		prk=new Parkhaus(this);
		setVisible(true);
		ut=new Utility(prk);
		setLayout(new BorderLayout());
		add(ut,BorderLayout.NORTH);
		add(prk,BorderLayout.CENTER);
		repaint();
		
		
	}

}
