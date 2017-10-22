package Parkhaus;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class EtageAuswahl implements MouseListener{
	private Parkhaus prk;
	private int etage;
	
	public EtageAuswahl(Parkhaus prk,int etage){
		this.prk=prk;
		this.etage=etage;
	}

	public void mouseClicked(MouseEvent arg0) {
		prk.changeEtage(etage);
		
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
