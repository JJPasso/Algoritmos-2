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
	private double getDenominador(){
		return denominador;
	}
	private double getNumerador() {
		return numerador;
	}
	public Fraccion suma(Fraccion n1,Fraccion n2) {
		double n;
		double d;
		if (n1.getDenominador()==n1.getDenominador()) {
			n = n1.getNumerador()+n2.getNumerador();
			d = n1.getDenominador();
		}else {
			d = n1.getDenominador()*n2.getDenominador();
			double q1 = n2.getDenominador()*n1.getNumerador();
			double q2 = n2.getNumerador()*n1.getDenominador();
			n = q1 + q2;
			}
		Fraccion f = new Fraccion(n,d);
		return f;
	}
	public Fraccion resta(Fraccion n1,Fraccion n2) {
		double n;
		double d;
		if (n1.getDenominador()==n1.getDenominador()) {
			n = n1.getNumerador()-n2.getNumerador();
			d = n1.getDenominador();
		}else {
			d = n1.getDenominador()*n2.getDenominador();
			double q1 = n2.getDenominador()*n1.getNumerador();
			double q2 = n2.getNumerador()*n1.getDenominador();
			n = q1 - q2;
			}
		Fraccion f = new Fraccion(n,d);
		return f;
	}
	public Fraccion Multiplicacion(Fraccion n1,Fraccion n2) {
		double n = n1.getNumerador()*n2.getNumerador();
		double d = n1.getDenominador()*n2.getDenominador();
		Fraccion f = new Fraccion(n,d);
		return f;
	}
	public Fraccion Division(Fraccion n1, Fraccion n2) {
		double n = n1.getDenominador()*n2.getNumerador();
		double d = n1.getNumerador()*n2.getDenominador();
		Fraccion f = new Fraccion(n,d);
		return f;
	}
}
