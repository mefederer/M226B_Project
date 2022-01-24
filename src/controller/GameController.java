package controller;

import model.Apfel;
import model.Banane;
import model.Ananas;
import model.Melone;

import model.Bombe;

import model.Collision;
import model.Highscore;
import model.Korb;
import model.Move;

import processing.core.PApplet;
import processing.core.PImage;


public class GameController extends PApplet{
	
	float xMouse;
	float oldx, oldy;
	float easing = 1;
	public static float speed = 5;
	

/**
 * Spielzustände initialisieren	
 * @author Melissa
 *
 */
	enum Spielzustand{
		Start, Spielen, Spielende
	}
	Spielzustand state = Spielzustand.Start;
	
		Apfel a1;
		Apfel a2;
		Ananas p1;
		Banane b1;
		Melone w1;
		public static Bombe x1;
		
		Move m1;
		Move m2;
		Move m3;
		Move m4;
		Move m5;
		
		Korb k1;
		Collision c1;
		Collision c2;
		Collision c3;
		Collision c4;
		public static Collision c5;
		
		Highscore h1;
	
	public static void main(String[] args) {
	//startet das Fenster
		PApplet.main("controller.GameController");
		}
	
	/**
	 * Erstellt sämtliche Objekte
	 */
	public void setup() {
		a1 = new Apfel(random(width),800);
		a2 = new Apfel(random(width),800);
		m1 = new Move();
		
		p1 = new Ananas(random(width),800);
		m2 = new Move();
		
		b1 = new Banane(random(width),800);
		m3 = new Move();
		
		w1 = new Melone(random(width),800);
		m4 = new Move();
		
		x1 = new Bombe(random(width),800);
		m5 = new Move();
		
		k1 = new Korb(0,500);
		
		c1 = new Collision();
		c2 = new Collision();
		c3 = new Collision();
		c4 = new Collision();
		c5 = new Collision();
		
		h1 = new Highscore(0);
	}
	
	//Switch Case Spielzustand
		public void keyPressed() {
			switch(state) {
	        case Start: keyPressedStartScreen(); break;
	        case Spielen: keyPressedInGame(); break;
	        case Spielende: keyPressedEndScreen(); 
	        }
		}
		
		 public void keyPressedStartScreen() {
		        if (key == 's') {
		        state = Spielzustand.Spielen;
		        }
		    }	
		
		 	/**
			 * Maus steuerung Korb
			 */
		 public void keyPressedInGame() {
			 xMouse = (1-easing) * oldx + easing * mouseX;
			 oldx = xMouse;  
		 }
		
		 public void keyPressedEndScreen() {
			 
		        if (key =='n') {
		            state = Spielzustand.Spielen;
		            System.out.println(state);     
		        }	
		 }
	/**
	 * Draw Methode für Früchte und Hintergründe
	 */
		public void draw() {

			if(state == Spielzustand.Start) {
				noStroke();
				
				PImage img;
				  img = loadImage("Images/Start.png");
				  image(img, 0, 0);  
			}
			
			if(state == Spielzustand.Spielen) {
				
				noStroke();
		/**
		 * Hintergrundbild  
		 */
		  PImage img;
		  img = loadImage("Images/Forest.png");
		  image(img, 0, 0);

		  keyPressedInGame();
		  
		  /**
		   * Zeichne Alle Spiel-Objekte
		   */
			 k1.setxKorb(xMouse - 40);
			 
			 a1.setyFrucht(m1.moveApfel(a1.getyFrucht(),a1.getxFrucht(), speed));
			 a1.drawApfel(this);
			 a2.setyFrucht(m1.moveApfel(a2.getyFrucht(),a2.getxFrucht(), speed));
			 a2.drawApfel(this);
			  
			 p1.setyFrucht(m2.moveAnanas(p1.getyFrucht(),speed));
			 p1.drawAnanas(this);
			 
			 b1.setyFrucht(m3.moveBanane(b1.getyFrucht(),speed));
			 b1.drawBanane(this);
			 
			 w1.setyFrucht(m4.moveMelone(w1.getyFrucht(),speed));
			 w1.drawMelone(this);
			 
			 x1.setYBombe(m5.moveBombe(x1.getYBombe(), speed));
			 x1.drawBombe(this);
	
			 k1.drawKorb(this);
			 
			/**
			 * Kollision 
			 */
			 c1.checkCollisionApfel(k1.getxKorb(), k1.getyKorb() ,a1.getxFrucht(),a1.getyFrucht(), a1, a1, h1);
			 c1.checkCollisionApfel(k1.getxKorb(), k1.getyKorb() ,a2.getxFrucht(),a2.getyFrucht(), a2, a1, h1);
			 c2.checkCollisionBanane(k1.getxKorb(), k1.getyKorb() ,b1.getxFrucht(),b1.getyFrucht(), b1, h1);
			 c3.checkCollisionAnanas(k1.getxKorb(), k1.getyKorb(), p1.getxFrucht(), p1.getyFrucht(), p1, h1);
			 c4.checkCollisionMelone(k1.getxKorb(), k1.getyKorb(), w1.getxFrucht(), w1.getyFrucht(), w1, h1);
			 
			
			 h1.drawHighscore(this);

		}
		/**
		 * Gehe zu EndScreen, sobald Bombe getroffen
		 */
		if(c5.checkCollisionBombe(k1.getxKorb(), k1.getyKorb(), x1.getXBombe(), x1.getYBombe(), x1)) {
			state = Spielzustand.Spielende;
		}
		if(state == Spielzustand.Spielende) {

			 PImage img;
			  img = loadImage("Images/End.png");
			  image(img, 0, 0);
			  
			  /**
			   * Setze Score und Speed zurück
			   */
			  h1.score = 0;
			  speed = 5;
			}		
	}
		/**
		 * Fenstergrösse
		 */
		public void settings() {
			size(600, 800);
			smooth();
		}
	}



