package Parkhaus;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Parkhaus extends JPanel{
	
   private Etage[] etagen;
   
   private Utility ut;
	
	public Parkhaus()
	{
		super();
		
		
		setLayout(new GridLayout(0,4));
		setVisible(true);
		etagen= new Etage[4];
		for(int i=0;i<4;i++){
			etagen[i]=new Etage(i);
			add(etagen[i]);
		}
		
		
	}
	
	public void changeEtage(int i){
		for(int j=0;j<4;j++){
			if(j!=i){
				this.remove(etagen[j]);
			}
		}
		repaint();
		add(etagen[i]);
		repaint();
	}

}
