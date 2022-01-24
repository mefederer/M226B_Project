package Test;

import static org.junit.Assert.*;


import org.junit.Test;
import org.mockito.Mockito;

import model.Ananas;
import model.Banane;
//import model.Apfel;
import model.Bombe;
import model.Melone;
import model.Move;

public class TestMove {

	
	/**
	 * Prüft, ob Melone sich bewegt
	 */
	@Test
	public void testMoveMelone() {
		
		int xFrucht = 100;
		int yFrucht = 50;
		int speed = 5;
		
		Move m1 = new Move();
		Melone w1 = new Melone(xFrucht, yFrucht);
		
		w1.setxFrucht(m1.moveMelone(xFrucht, speed));
		assertEquals(105, w1.getxFrucht(),0);
	}
	
	/**
	 * Prüft, ob Bombe sich bewegt
	 */
	@Test
	public void testMoveBombe() {
		
		int xBombe = 40;
		int yBombe = 10;
		int speed = 20;
		
		Move m5 = new Move();
		Bombe x1 = new Bombe(xBombe, yBombe);
		
		x1.setXBombe(m5.moveBombe(xBombe, speed));
		assertEquals(60, x1.getXBombe(),0);
	}
	
	/**
	 * Prüft, ob Ananas  sich bewegt
	 */
	@Test
	public void testMoveAnanas() {
		
		int xFrucht = 100;
		int yFrucht = 50;
		int speed = 5;
		
		Move m1 = new Move();
		Ananas a1 = new Ananas(xFrucht, yFrucht);
		
		a1.setxFrucht(m1.moveAnanas(xFrucht, speed));
		assertEquals(105, a1.getxFrucht(),0);
	}
	
	
}
