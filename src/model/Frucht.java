package model;

public abstract class Frucht {
	
	private float xFrucht;
	private float yFrucht;
	
	public Frucht(float xFrucht, float yFrucht){
		this.xFrucht = xFrucht;
		this.yFrucht = yFrucht;
	}
	
	/**
	 * Getter für xFrucht
	 * @return xFrucht
	 */
	public float getxFrucht() {
		return xFrucht;
	}
	/**
	 * Setter für xFrucht
	 * @param xFrucht
	 */
	public void setxFrucht(float xFrucht) {
		this.xFrucht = xFrucht;
	}
	
	/**
	 * Getter für yFrucht
	 * @return yFrucht
	 */
	public float getyFrucht() {
		return yFrucht;
	}
	/**
	 * Setter für yFrucht
	 * @param yFrucht
	 */
	public void setyFrucht(float yFrucht) {
		this.yFrucht = yFrucht;
	}
}
