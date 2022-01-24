package model;

public abstract class Frucht {
	
	private float xFrucht;
	private float yFrucht;
	
	public Frucht(float xFrucht, float yFrucht){
		this.xFrucht = xFrucht;
		this.yFrucht = yFrucht;
	}
	
	/**
	 * Getter f�r xFrucht
	 * @return xFrucht
	 */
	public float getxFrucht() {
		return xFrucht;
	}
	/**
	 * Setter f�r xFrucht
	 * @param xFrucht
	 */
	public void setxFrucht(float xFrucht) {
		this.xFrucht = xFrucht;
	}
	
	/**
	 * Getter f�r yFrucht
	 * @return yFrucht
	 */
	public float getyFrucht() {
		return yFrucht;
	}
	/**
	 * Setter f�r yFrucht
	 * @param yFrucht
	 */
	public void setyFrucht(float yFrucht) {
		this.yFrucht = yFrucht;
	}
}
