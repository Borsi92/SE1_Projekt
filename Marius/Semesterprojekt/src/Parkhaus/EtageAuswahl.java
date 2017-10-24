package Parkhaus;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
public class EtageAuswahl implements MouseListener{
	private Parkhaus prk;
	private int etage;
	private JLabel preis;
	
	public EtageAuswahl(Parkhaus prk,int etage,JLabel preis){
		this.prk=prk;
		this.etage=etage;
		this.preis=preis;
	}

	public void mouseClicked(MouseEvent arg0) {
		prk.changeEtage(etage);
		preis.setText("Preis: " + (etage+1)*10+"\n"+"€/h");
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
