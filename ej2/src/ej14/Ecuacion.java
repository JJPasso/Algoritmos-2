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
	private int Tiene2soluciones(){
		float a = getPrimero();
		float b = getSegundo();
		float c = getIndependiente();
		double i = Math.pow(b,2)-4*a*c;
		if (i > 0) {
			return 2;
		}else {
			if(i==0) {
				return 1;
			}else {
				return 0;
			}
		}
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
		if (n.Tiene2soluciones()== 2) {
			float a = n.getPrimero();
			float b = n.getSegundo();
			float c = n.getIndependiente();
			float p1 = a*2;
			float p3 = -b;
			double i = Math.pow(b,2)-4*a*c;
			float p2 = (float)Math.sqrt(i);
			r1 = (p3 + p2)/p1;
			r2 = (p3 - p2)/p1;
		}else {
			if(n.Tiene2soluciones()== 1) {
				float a = n.getPrimero();
				float b = n.getSegundo();
				float c = n.getIndependiente();
				float p1 = a*2;
				float p3 = -b;
				double i = Math.pow(b,2)-4*a*c;
				float p2 = (float)Math.sqrt(i);
				r1 = (p3 + p2)/p1;
				System.out.println("solucion doble");
			}else {
				System.out.println("error no existe solucion");
			}
		}
	}
}
