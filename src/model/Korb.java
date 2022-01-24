package model;

import processing.core.PApplet;
public class Korb {

	
	private float xKorb = 0;
	private float yKorb = 500;

	/**
	 * Konstruktor der Apfel Klasse
	 * @param window
	 * @param x
	 * @param y
	 */
	public Korb(float xKorb, float yKorb) {
		this.xKorb = xKorb;
		this.yKorb = yKorb;
	}

	/**
	 * Getter für xKorb
	 * @return xKorb
	 */
	public float getxKorb() {
		return xKorb;
	}
	/**
	 * Setter für xKorb
	 * @param xKorb
	 */
	public void setxKorb(float xKorb) {
		this.xKorb = xKorb;
	}
	/**
	 * Getter für yKorb
	 * @return yKorb
	 */
	public float getyKorb() {
		return yKorb;
	}
	/**
	 * Setter für yKorb
	 * @param yKorb
	 */
	public void setyKorb(float yKorb) {
		this.yKorb = yKorb;
	}
	/**
	 * Draw Methode Korb
	 * @param window
	 */
	public void drawKorb(PApplet window){
	  	
		  window.fill (139,69,19);
		  window.rect(xKorb,yKorb,80,40);
		  
		}
	
	
}