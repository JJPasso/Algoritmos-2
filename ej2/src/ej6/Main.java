package ej6;

public class Main {

	public static void main(String[] args) {
		Hora obj = new Hora(5,5,9);
		Hora obj2 = new Hora();
		String resultado = obj.miembro(obj.getHora(), obj.getMinutos(), obj.getSegundos(), obj2.getHora(), obj2.getMinutos(), obj2.getSegundos());
		System.out.println("la suma de "+ obj.ver() +" y "+obj2.ver()+ " es " + resultado);
	}

}
