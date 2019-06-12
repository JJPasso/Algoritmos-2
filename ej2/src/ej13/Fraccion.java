package ej13;

public class Fraccion {
	private double numerador;
	private double denominador;
	public Fraccion(double n, double d) {
		numerador = n;
		denominador = d;
	}
	public Fraccion (int n,int d) {
		numerador = (double)n;
		denominador = (double)d;
	}
	public void setFraccion(double n, double d) {
		numerador = n;
		denominador = d;
	}
	public void MostrarFraccion() {
		System.out.println(numerador+"/"+denominador);
	}
	
}
