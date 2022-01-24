package model;

import processing.core.PApplet;

public final class Banane extends Frucht {
	
	
	public Banane(float xFrucht, float yFrucht) {
		super (xFrucht, yFrucht);
	}

	/**
	 * Zeichne die Banane
	 * @param window
	 */
	
	public void drawBanane(PApplet window){
	  	
		  window.fill (0xFFF7E808);
		  window.rect(getxFrucht(),getyFrucht(),20,40);
		  window.fill (0xFF00FF00);
		  window.rect(getxFrucht()+7,getyFrucht()-15,5,15);
		  window.fill (0xFF5C3E1C);
		  window.rect(getxFrucht()+7,getyFrucht()+40,5,5);
		}
	
	
		
		
	
}