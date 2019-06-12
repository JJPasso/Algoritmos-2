package ej8;
import java.lang.Math;

public class Polar {
	private double radio;
	private double angulo;
	public Polar() {
		
	}
	public double getRadio() {
		double x = radio;
		return x;
	}
	public double getAngulo() {
		double x = angulo;
		return x;
	}
	public void setAngulo(double x) {
		angulo = x;
	}
	public void setRadio(double x) {
		radio = x;
	}
	public void convertiraRectangular(double r,double c) {
		 r = radio * Math.cos(angulo);
		 c = radio * Math.sin(angulo);

	}

}
