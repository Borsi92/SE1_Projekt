import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Etage extends JPanel implements ActionListener {

	private int etage;
	private int preis;
	private Parkplatz[] parkplaetze;
	private JLabel[] leerePlaetze;
	
	// Konstruktor
	public Etage(int etage){
		this.etage = etage;
		
		// set layout
		this.setLayout(new GridLayout(6,3));
		
		// jede Etage hat 12 Parkplätze
		parkplaetze = new Parkplatz[12];
		for(int i = 0; i < 12; i++){
			parkplaetze[i] = new Parkplatz(this);
			parkplaetze[i].setPreferredSize(new Dimension(100,80));
			parkplaetze[i].addActionListener(this);
		}
		// und 6 leere Plätze
		leerePlaetze = new JLabel[6];
		for(int i = 0; i < 6; i++){
			leerePlaetze[i] = new JLabel();
		}
		
		// adde Parkplätze zur Etage
		for(int i = 0; i < 6; i++){
			this.add(parkplaetze[2*i]);
			this.add(leerePlaetze[i]);
			this.add(parkplaetze[2*i+1]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == parkplaetze[0]){
			checkParkplatz(0);
		}
		else if(e.getSource() == parkplaetze[1]){
			checkParkplatz(1);
		}
		else if(e.getSource() == parkplaetze[2]){
			checkParkplatz(2);
		}
		else if(e.getSource() == parkplaetze[3]){
			checkParkplatz(3);
		}
		else if(e.getSource() == parkplaetze[4]){
			checkParkplatz(4);
		}
		else if(e.getSource() == parkplaetze[5]){
			checkParkplatz(5);
		}
		else if(e.getSource() == parkplaetze[6]){
			checkParkplatz(6);
		}
		else if(e.getSource() == parkplaetze[7]){
			checkParkplatz(7);
		}
		else if(e.getSource() == parkplaetze[8]){
			checkParkplatz(8);
		}
		else if(e.getSource() == parkplaetze[9]){
			checkParkplatz(9);
		}
		else if(e.getSource() == parkplaetze[10]){
			checkParkplatz(10);
		}
		else if(e.getSource() == parkplaetze[11]){
			checkParkplatz(11);
		}		
	}
	
	private void checkParkplatz(int parkplatzNr){
		if(parkplaetze[parkplatzNr].isEmpty()){
			parkplaetze[parkplatzNr].addAuto();
			System.out.println("Parkplatz: " + (parkplatzNr + 1) + " Etage: " + this.etage);
		}
		else{
			int rausfahren = JOptionPane.showConfirmDialog(null, "Parkgebühren: \nSoll das Auto rausgefahren werden?");
			if(rausfahren == 0){
				System.out.println(parkplaetze[parkplatzNr].getAuto().toString() + " ist rausgefahren");
				parkplaetze[parkplatzNr].removeAuto();
			}			
		}
	}
	
	@Override
	public String toString(){
		return "Etage: " + etage;
	}
	
}
