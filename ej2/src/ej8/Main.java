package ej8;

public class Main {

	public static void main(String[] args) {
		Punto a = new Punto(2,5);
		Punto b = new Punto (6,8);
		Vector3D v = new Vector3D(4,7,8);
		Vector3D vv = new Vector3D(4,9,8);
		a.setPunto(5, 6);
		b.setPunto(7, 2);
		float x = a.getPuntoX() + b.getPuntoX();
		float y = a.getPuntoY() + b.getPuntoY();
		System.out.println("punto x: "+x +", punto y: " + y);
		if (a.esigual(a.getPuntoX(), a.getPuntoY(), b.getPuntoX(), b.getPuntoY())){
			System.out.println("son iguales");
		}else{
			System.out.println("no son iguales");
		}
		a.setPunto(2, 2);
		b.setPunto(2, 2);
		x = a.getPuntoX() + b.getPuntoX();
		y = a.getPuntoY() + b.getPuntoY();
		System.out.println("punto x: "+x +", punto y: " + y);
		if (a.esigual(a.getPuntoX(), a.getPuntoY(), b.getPuntoX(), b.getPuntoY())){
			System.out.println("son iguales");
		}else{
			System.out.println("no son iguales");
		}
		if (v.esigual(v.getPuntoX(), v.getPuntoY(),v.getZ(), vv.getPuntoX(), vv.getPuntoY(),vv.getZ())){
			System.out.println("son iguales");
		}else{
			System.out.println("no son iguales");
		}
		
	}

}

