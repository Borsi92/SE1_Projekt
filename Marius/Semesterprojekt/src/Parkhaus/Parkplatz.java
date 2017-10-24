package Parkhaus;

import java.awt.Dimension;

import javax.swing.JButton;

public class Parkplatz extends JButton{
	
	private boolean isempty;
	private long parkbeginn;
	private long parkende;
	private Parken park;
	private UntereLeiste ul;
	private GUI gui;
	public Parkplatz(String s,GUI gui){
		super(s);
		this.setPreferredSize(new Dimension(180,100));
		this.gui=gui;
		this.ul=gui.getUntereLeiste();
		isempty=true;
		park = new Parken(new Auto(),this);
		this.addMouseListener(park);
	}
	
	public void setfull()
	{
		this.isempty=false;
	}
	public boolean isEmpty()
	{
		return isempty;
	}
	public void startParking(){
		parkbeginn=System.currentTimeMillis();
	}
	public void setEmpty(){
		isempty=true;
		gui.repaint();
	}

}
