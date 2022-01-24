package model;

import processing.core.PApplet;

public final class Ananas extends Frucht {

	
	public Ananas(float xFrucht, float yFrucht) {
		super (xFrucht, yFrucht);
		
	}
	/**
	 * Zeichne die Ananas
	 * @param window
	 */
	public void drawAnanas(PApplet window){
	  	
		  window.fill (0xFFFFFF00);
		  window.rect(getxFrucht(), getyFrucht(), 30, 50, 28);
		  window.fill(0xFF096B1C);
		  window.rect(getxFrucht()+8, getyFrucht()-20, 10, 20);
		  window.rect(getxFrucht()+2, getyFrucht()-15, 10, 15);
		  window.rect(getxFrucht()+12, getyFrucht()-15, 10, 15);
		}		
}