package Parkhaus;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Etage extends JPanel{
	private int etage;
	
	public Etage(int a)
	{
		super();
		setLayout(new GridLayout(4,3));
		int j=1;
		etage=a;
		for(int i=0;i<12;i++){
			if(i%3==0||i%3==2){
				add(new Parkplatz(""+j++));
			}
			else{
				add(new JLabel("         "+etage));
			}
		}
		
		
	}
	
	public int getEtage(){
		return etage;
	}

}
