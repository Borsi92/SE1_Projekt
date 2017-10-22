import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Auto extends ImageIcon {

	private String autotyp;
	private int id;	
	
	private static int autoCnt;
	private static int width = 100;
	private static int height = 80;
	
	public Auto(){
		super(scaleImage("auto.png", width, height));
		
		autoCnt++;
		this.id = autoCnt;
		this.autotyp = "auto.png";
		
		
	}
	
	@Override
	public String toString(){
		return "Auto mit ID " + id;
	}
	
	// Methode, um Bildgröße zu skalieren
	private static Image scaleImage(String img, int w, int h){
		Image newImg = null;
		try {
			newImg = ImageIO.read(new File(img));
			newImg = newImg.getScaledInstance(w, h, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return newImg;
	}
	
}
