package model;

import processing.core.PApplet;

public class Highscore {
	public int score;
	
	
	public Highscore(int score) {
		this.score = 0;
	}

	/**
	 * Getter für Score
	 * @return score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Setter für Score
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * Drawmethode für den Highscore
	 * @param window
	 */
	public void drawHighscore(PApplet window) {
		window.fill(255);
		window.textSize(50);
		window.text("Gefangene Früchte: " + getScore(), 50, 600);
	}
	
	
	}
