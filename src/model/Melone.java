package model;

import processing.core.PApplet;

public final class Melone extends Frucht {
	
	
	public Melone(float xFrucht, float yFrucht) {
		super (xFrucht, yFrucht);
	}
	/**
	 * Zeichne die Melone
	 * @param window
	 */
	public void drawMelone(PApplet window){
	  	
		  window.fill (0xFF11872D);
		  window.circle(getxFrucht(),getyFrucht(),45);
		  window.fill (0xFFF01465);
		  window.circle(getxFrucht(),getyFrucht(),35);
		  window.fill (0xFF000000);
		  window.circle(getxFrucht()-5,getyFrucht()-5,5);
		  window.circle(getxFrucht()+5,getyFrucht()+5,5);
		  window.circle(getxFrucht()+7,getyFrucht()-7,5);
		  window.circle(getxFrucht()-7,getyFrucht()+7,5);
		  
		}
}