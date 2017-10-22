import javax.swing.JPanel;

public class Parkhaus extends JPanel {

	private Etage[] etagen;
	
	public Parkhaus(){
		etagen = new Etage[4];
		etagen[0] = new Etage(1);
		etagen[1] = new Etage(2);
		etagen[2] = new Etage(3);
		etagen[3] = new Etage(4);
		
		this.add(etagen[0]);
	}
	
	public Etage[] getEtagen(){
		return this.etagen;
	}
	
}
