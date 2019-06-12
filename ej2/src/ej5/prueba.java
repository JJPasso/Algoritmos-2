package ej5;

public class prueba {
	public prueba(char c) {
		System.out.println("el dato caracter es " + c);
	}
	public prueba(int i) {
		int j = i;
		j++;
		System.out.println("el entero "+ i +" se aumente en 1: "+ j);
	}
	public prueba(double d){
		double f = d + 0.75;
		System.out.println("el decimal: "+d+" se aumenta en 0.75: "+ f);
	}
	
}
