package Parkhaus;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class UntereLeiste extends JPanel{
	private AutoDisplay ad;
	public UntereLeiste(AutoDisplay ad){
		setLayout(new GridLayout(0,3));
		this.ad=ad;
		add(ad);
		add(new JLabel());
	}
	
	public AutoDisplay getAutoD(){
		return ad;
	}

}
