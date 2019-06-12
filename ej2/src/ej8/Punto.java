package ej8;

public class Punto {
	private float x;
	private float y;
	public Punto() {
		x = 0;
		y = 0;
	}
	public Punto(float i,float j) {
		this.x = i;
		this.y = j;
	}

	public void setPunto(float i,float j) {
		this.x = i;
		this.y = j;
	}
	public float getPuntoX() {
		return (this.x);
	}
	public float getPuntoY() {
		return (this.y);
	}
	public boolean esigual(float x1,float y1,float x2,float y2) {
		return (x1 == x2) && (y1 == y2);
	}
}
