import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Utility extends JPanel implements ActionListener {

	private Parkhaus parkhaus;
	private Etage[] etagen;
	private JButton[] etagenAuswahl;
	private JFrame gui;
	
	public Utility(Parkhaus parkhaus, JFrame gui){
		
		this.parkhaus = parkhaus;
		this.etagen = parkhaus.getEtagen();
		this.gui = gui;
		
		// set layout
		this.setLayout(new GridLayout(4,1));
		
		this.add(new JLabel("AMPEL"));
		this.add(new JLabel("Auto"));
		this.add(new JLabel("Schranke oder so"));
		
		
		JPanel etagenAuswahlauswahl = new JPanel();
		etagenAuswahlauswahl.setLayout(new GridLayout(1,4));
		
		etagenAuswahl = new JButton[4];
		
		for(int i = 0; i < 4; i++){
			etagenAuswahl[i] = new JButton("Etage " + (i+1));
			etagenAuswahl[i].setPreferredSize(new Dimension(100,50));
			etagenAuswahl[i].addActionListener(this);
			etagenAuswahlauswahl.add(etagenAuswahl[i]);
		}

		this.add(etagenAuswahlauswahl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == etagenAuswahl[0]){
			parkhaus.remove(parkhaus.getComponents()[0]);
			parkhaus.add(etagen[0], BorderLayout.CENTER);
			parkhaus.revalidate();
			parkhaus.repaint();
			gui.pack();
			System.out.println(parkhaus.getComponents()[0]);
		}
		else if(e.getSource() == etagenAuswahl[1]){
			parkhaus.remove(parkhaus.getComponents()[0]);
			parkhaus.add(etagen[1], BorderLayout.CENTER);
			parkhaus.revalidate();
			parkhaus.repaint();
			gui.pack();
			System.out.println(parkhaus.getComponents()[0]);
		}
		else if(e.getSource() == etagenAuswahl[2]){
			parkhaus.remove(parkhaus.getComponents()[0]);
			parkhaus.add(etagen[2], BorderLayout.CENTER);
			parkhaus.revalidate();
			parkhaus.repaint();
			gui.pack();
			System.out.println(parkhaus.getComponents()[0]);
		}
		else if(e.getSource() == etagenAuswahl[3]){
			parkhaus.remove(parkhaus.getComponents()[0]);
			parkhaus.add(etagen[3], BorderLayout.CENTER);
			parkhaus.revalidate();
			parkhaus.repaint();
			gui.pack();
			System.out.println(parkhaus.getComponents()[0]);
		}
		
	}
	
	
}
