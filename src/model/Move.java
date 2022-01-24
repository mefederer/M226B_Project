package model;

import controller.GameController;

/**
 * Bewegung sämtlicher fallender Objekte
 * @author Melissa
 *
 */
public class Move {
	
	public float moveApfel(float yApfel, float xApfel, float speed){
		yApfel = yApfel + speed;
		if(yApfel >=800) {
		   yApfel = 0;

		}
			return yApfel;
		
		}
	public float moveAnanas(float yAnanas, float speed){
		yAnanas = yAnanas + speed;
		if(yAnanas >=850) {
			yAnanas = 0;

		}
			return yAnanas;
		
		}
	public float moveBanane(float yBanane, float speed){
		yBanane = yBanane + speed;
		if(yBanane >=910) {
			yBanane = 0;
		}
			return yBanane;
		
		}
	public float moveMelone(float yMelone, float speed){
		yMelone = yMelone + speed;
		if(yMelone >=920) {
			yMelone = 0;
		}
			return yMelone;
		
		}
	
	public float moveBombe(float yBombe, float speed){
		yBombe = yBombe + speed;
		if(yBombe >=900) {
			yBombe = 0;
			//Bombe fällt nie am gleichen Ort wie zuvor runter
			GameController.x1.setXBombe(GameController.c5.randomX());
		}
			return yBombe;
				}
		}
	