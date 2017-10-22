package Parkhaus;

import javax.swing.JButton;

public class Parkplatz extends JButton{
	
	private boolean isempty;
	public boolean isEmpty(){
		return isempty;
	}
	public Parkplatz(String s){
		super(s);
	}

}
