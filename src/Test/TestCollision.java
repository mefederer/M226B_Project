package Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import model.Banane;
import model.Collision;
import model.Highscore;

public class TestCollision {

	/**
	 * Mockup Test
	 * Teste Kollision Banane mit Korb
	 */
	@Test
	
	public void testCheckCollisionBanane() {
		float xKorb = 10;
		float yKorb = 20;
		float xBanane = 10;
		float yBanane = 10;
		
		Collision c1 = new Collision();
		
		Banane b1 = new Banane(xBanane, yBanane);
		Highscore h1 = Mockito.mock(model.Highscore.class);
		when(h1.getScore()).thenReturn(2);
		
		c1.checkCollisionBanane(xKorb, yKorb, xBanane, yBanane, b1, h1);
		assertEquals(3,h1.getScore());
	}

}
