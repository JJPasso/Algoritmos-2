package ej14;
import java.lang.Math;
public class Ecuacion {
	private float cuadrado;
	private float medio;
	private float independiente;
	public Ecuacion(float c,float m,float i) {
		cuadrado = c;
		medio = m;
		independiente = i;
	}
	public void Modificar(float c,float m,float i) {
		cuadrado = c;
		medio = m;
		independiente = i;
	}
	public float getPrimero() {
		return cuadrado;
	}
	public float getSegundo() {
		return medio;
	}
	public float getIndependiente() {
		return independiente;
	}
	public void Raices(Ecuacion n,float r1,float r2) {
		if (n.Tiene2soluciones()) {
			float a = n.getPrimero();
			float b = n.getSegundo();
			float c = n.getIndependiente();
			float p1 = a*2;
			double i = Math.
			float p2 = (float)Math.sqrt(i);
		}
	}
}
