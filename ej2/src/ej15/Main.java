package ej15;

public class Main {

	public static void main(String[] args) {
		Potencia n = new Potencia(2,17);
		float r = n.evaluar(n.getBase(),n.getExp());
		System.out.println("resultado:"+r);
	}

}
