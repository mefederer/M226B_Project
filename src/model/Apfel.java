package model;

import processing.core.PApplet;

public final class Apfel extends Frucht {

	
	public Apfel(float xFrucht, float yFrucht) {
		super (xFrucht, yFrucht);
		
	}
	/**
	 * Zeichne den Apfel
	 * @param window
	 */
	public void drawApfel(PApplet window){
	  	
		  window.fill (0xFFFF0000);
		  window.circle(getxFrucht(),getyFrucht(),25);
		  window.fill (0xFF0C6131);
		  window.rect(getxFrucht()-2,getyFrucht()-20,5,10);
		}
	
	
		
		
	
}