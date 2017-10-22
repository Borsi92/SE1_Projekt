import javax.swing.JButton;

public class Parkplatz extends JButton {

	private boolean empty;
	private Etage etage;
	private Auto auto;
	private long von;
	private long bis;
	
	public Parkplatz(Etage etage){
		this.etage = etage;
		this.empty = true;
	}
	
	public void addAuto(){
		this.auto = new Auto();
		this.empty = false;
		this.setIcon(auto);
	}
	
	public void removeAuto(){
		this.auto = null;
		this.empty = true;
		this.setIcon(null);
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public Auto getAuto(){
		return this.auto;
	}
	
}
