package Parkhaus;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
public class Parken implements MouseListener {
	private Auto a;
	private Parkplatz b;
	public Parken(Auto a, Parkplatz b){
		this.a=a;
		this.b=b;
	}

	public void mouseClicked(MouseEvent arg0) {
		if(b.isEmpty()){
			b.setIcon(a);
			b.startParking();
			b.setfull();
		}
		else{
			b.setIcon(null);
			b.setEmpty();
		}
		
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
