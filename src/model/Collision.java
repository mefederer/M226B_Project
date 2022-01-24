package model;


import controller.GameController;
import processing.core.PApplet;
public class Collision extends PApplet {
	
	
	
/**
 * Schwierigkeitsgrad 
 * Erhöht den Speed der fallenden Objekte um 2 immer dann, wenn 10 Punkte dazu gekommen sind	
 * @param score
 */
	public void difficulty(int score) {
		if((score) % 10 == 0 ) {
			GameController.speed = GameController.speed + 2;
		} 		
	}

	/**
	 * Kollision Apfel
	 * @param xKorb
	 * @param yKorb
	 * @param xApfel
	 * @param yApfel
	 * @param a1
	 * @param a2
	 * @param h1
	 */
	public void checkCollisionApfel(float xKorb, float yKorb, float xApfel, float yApfel, Apfel a1, Apfel a2, Highscore h1 ) {
	
		if(xKorb + 80 > xApfel && xKorb  < xApfel 
				&& yKorb + 20 > yApfel && yKorb - 20 < yApfel) {
			
			
		
		a1.setyFrucht(randomY());
		a1.setxFrucht(randomX());
		h1.score ++;
		difficulty(h1.getScore());
		
		}
	}
	
	/**
	 * Kollision Banane
	 * @param xKorb
	 * @param yKorb
	 * @param xBanane
	 * @param yBanane
	 * @param b1
	 * @param h1
	 */
	public void checkCollisionBanane(float xKorb, float yKorb, float xBanane, float yBanane, Banane b1, Highscore h1) {
		
		if(xKorb + 80 > xBanane && xKorb  < xBanane 
				&& yKorb + 20 > yBanane && yKorb - 20 < yBanane) {
			
		
		b1.setyFrucht(randomY());
		b1.setxFrucht(randomX());
		h1.score ++;
		difficulty(h1.getScore());
		}
	}
	/**
	 * Kollision Ananas
	 * @param xKorb
	 * @param yKorb
	 * @param xAnanas
	 * @param yAnanas
	 * @param p1
	 * @param h1
	 */
	public void checkCollisionAnanas(float xKorb, float yKorb, float xAnanas, float yAnanas, Ananas p1, Highscore h1) {
		
		if(xKorb + 80 > xAnanas && xKorb  < xAnanas 
				&& yKorb + 20 > yAnanas && yKorb - 20 < yAnanas) {			
		
		p1.setyFrucht(randomY());
		p1.setxFrucht(randomX());
		h1.score ++;
		difficulty(h1.getScore());
		}
	}
	/**
	 * Kollision Melone
	 * @param xKorb
	 * @param yKorb
	 * @param xMelone
	 * @param yMelone
	 * @param w1
	 * @param h1
	 */
	public void checkCollisionMelone(float xKorb, float yKorb, float xMelone, float yMelone, Melone w1, Highscore h1) {
	
	if(xKorb + 80 > xMelone && xKorb  < xMelone 
			&& yKorb + 20 > yMelone && yKorb - 20 < yMelone) {
		
	
	w1.setyFrucht(randomY());
	w1.setxFrucht(randomX());
	h1.score ++;
	difficulty(h1.getScore());
	}
}
	/**
	 * Kollision Bombe
	 * @param xKorb
	 * @param yKorb
	 * @param xBombe
	 * @param yBombe
	 * @param x1
	 * @return
	 */
	public boolean checkCollisionBombe(float xKorb, float yKorb, float xBombe, float yBombe, Bombe x1) {
	
	return(xKorb + 80 > xBombe && xKorb  < xBombe 
			&& yKorb + 20 > yBombe && yKorb - 20 < yBombe);
		
	}

	/**
	 * RandomZahl für x Position
	 */

	public float minX = 10;
	public float maxX = 590;
	public float randomZahlX ;
	
	
	public float randomX() {
			for(float i = minX; i <= maxX; i++){
				randomZahlX = (float) (Math.random()*(maxX-minX) + minX);
		}
		return randomZahlX;
	} 
	
	/**
	 * Random Zahl für y Position
	 */

	public float minY = -5000;
	public float maxY = 0;
	public float randomZahlY ;
		
		
	public float randomY() {
			for(float i = minY; i <= maxY; i++){
				randomZahlY = (float) (Math.random()*(maxY-minY) + minY);
			}
			return randomZahlY;
		}
		
	}
	