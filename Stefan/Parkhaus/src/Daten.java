
public class Daten {

	private int id;
	private int von;
	private int bis;
	private int dauer;
	private int preis;
	
	public Daten(int id, int von, int bis, int dauer, int preis){
		this.id = id;
		this.von = von;
		this.bis = bis;
		this.dauer = dauer;
		this.preis = preis;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVon() {
		return von;
	}
	public void setVon(int von) {
		this.von = von;
	}
	public int getBis() {
		return bis;
	}
	public void setBis(int bis) {
		this.bis = bis;
	}
	public int getDauer() {
		return dauer;
	}
	public void setDauer(int dauer) {
		this.dauer = dauer;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}	
}
