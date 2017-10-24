package Parkhaus;

import javax.swing.JLabel;

public class AutoDisplay extends JLabel{
	
	private Auto auto;
	public AutoDisplay(Auto auto){
		super(auto);
		this.auto=auto;
	}
	
	public Auto getAuto(){
		return auto;
	}

}
