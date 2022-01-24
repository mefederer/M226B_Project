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
	 * Getter f�r xBombe
	 * @return xBombe
	 */
	
	public float getXBombe() {
		return xBombe;
	}
	/**
	 * Setter f�r xBombe
	 * @param xBombe
	 */
	public void setXBombe(float xBombe) {
		this.xBombe = xBombe;
	}
	
	/**
	 * Getter f�r yBombe
	 * @return yBombe
	 */
	public float getYBombe() {
		return yBombe;
	}
	/**
	 * Setter f�r yBombe
	 * @param yBombe
	 */
	public void setYBombe(float yBombe) {
		this.yBombe = yBombe;
	}
	
	/**
	 * Draw Methode f�r Bombe
	 * @param window
	 */
	public void drawBombe(PApplet window){
	  	
		  window.fill (0xFF000000);
		  window.circle(xBombe,yBombe,35);
		}
}