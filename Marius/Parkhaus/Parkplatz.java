package Parkhaus;

import java.awt.Dimension;

import javax.swing.JButton;

public class Parkplatz extends JButton{
	
	private boolean isempty;
	public boolean isEmpty(){
		return isempty;
	}
	public Parkplatz(String s){
		super(s);
		this.setPreferredSize(new Dimension(200,100));
	}

}
