package model;

import processing.core.PApplet;

public class Bombe {
	
	public float xBombe;
	public float yBombe;

	/**
	 * Konstruktoraufruf Bombe
	 * @param xBombe
	 * @param yBombe
	 */
	public Bombe(float xBombe, float yBombe) {
		this.xBombe = xBombe;
		this.yBombe = yBombe;
	}
	/**
	 * Getter für xBombe
	 * @return xBombe
	 */
	
	public float getXBombe() {
		return xBombe;
	}
	/**
	 * Setter für xBombe
	 * @param xBombe
	 */
	public void setXBombe(float xBombe) {
		this.xBombe = xBombe;
	}
	
	/**
	 * Getter für yBombe
	 * @return yBombe
	 */
	public float getYBombe() {
		return yBombe;
	}
	/**
	 * Setter für yBombe
	 * @param yBombe
	 */
	public void setYBombe(float yBombe) {
		this.yBombe = yBombe;
	}
	
	/**
	 * Draw Methode für Bombe
	 * @param window
	 */
	public void drawBombe(PApplet window){
	  	
		  window.fill (0xFF000000);
		  window.circle(xBombe,yBombe,35);
		}
}