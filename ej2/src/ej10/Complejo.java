package ej10;

public class Complejo {
	private int r;
	private int i;
	public Complejo(int r,int i){
		this.r = r;
		this.i = i;
	}
	public void MultiC(int r1,int i1,int r2,int i2,int r,int i) {
		int rf1 = r1 * r2;
		int if1 = r1 * i2;
		int if2 = i1 * r2;
		int rf2 = i1 * i2;
		rf2 = rf2 * -1;
		r = rf1 + rf2;
		i = if1 + if2;
	}
	public int getReal() {
		return (this.r);
	}
	public int getImaginario() {
		return (this.i);
	}
	public void setReal(int r) {
		this.r = r;
	}
	public void setImaginario(int i) {
		this.i = i;
	}
	private int suma(int n,int m) {
		int r = n + m;
		return r;
	}
	private float suma(float n,float m) {
		float r = n + m;
		return r;
	}
	public void suma(int r1,int i1,int r2,int i2,int r,int i) {
		r = this.suma(r1, r2);
		i = this.suma(i1, i2);
	}	
	public void suma(float r1,float i1,float r2,float i2,float r,float i) {
		r = this.suma(r1, r2);
		i = this.suma(i1, i2);
	}
}
