package Parkhaus;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Etage extends JPanel{
	private int etage;
	private GUI gui;
	
	public Etage(int a,GUI gui)
	{
		super();
		setLayout(new GridLayout(4,3,0,0));
		int j=1;
		etage=a;
		for(int i=0;i<12;i++){
			if(i%3==0||i%3==2){
				add(new Parkplatz(""+j++,gui));
			}
			else{
				JLabel b=new JLabel();
				b.setIcon(new ImageIcon("strasse.jpg"));
				b.setPreferredSize(new Dimension(180,100));
				
				b.repaint();
				add(b);
			}
		}
		this.gui=gui;
		
		
		
	}
	
	public int getEtage(){
		return etage;
	}
	
	public GUI getGUI(){
		return gui;
	}

}
