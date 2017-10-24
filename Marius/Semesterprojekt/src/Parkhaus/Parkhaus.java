package Parkhaus;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Parkhaus extends JPanel{
	
   private Etage[] etagen;
   private GUI gui;
   private Utility ut;
	
	public Parkhaus(GUI gui)
	{
		super();
		setLayout(new GridLayout(0,1));
		this.gui=gui;
		setVisible(true);
		etagen= new Etage[4];
		for(int i=0;i<4;i++){
			etagen[i]=new Etage(i,gui);
			
		}
		add(etagen[0]);
		//gui.pack();
		
		
		
	}
	
	public void changeEtage(int i){
		remove(this.getComponents()[0]);
		add(etagen[i]);
		repaint();
		//gui.pack();

	}
}
