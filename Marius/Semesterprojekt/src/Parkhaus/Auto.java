package Parkhaus;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class Auto extends ImageIcon{
	
	static final private String[] autos= new String[]{"auto1.jpg","auto.jpg"};
	static private Random r=new Random();
	static private int p=r.nextInt(2);
	
	public Auto(){
		
		super (autos[p]);
		
		
		
	}
	
	

}
