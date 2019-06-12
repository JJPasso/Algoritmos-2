package ej12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha(02,04,2020);
		Fecha f2 = new Fecha(22,05,2019);
		if (f1.esMayor(f1, f2)) {
			System.out.println("f1 es mas grande");
		}else {
			System.out.println("f2 es mas grande");
		}
		System.out.println(f1.toSpring());
		System.out.println(f2.toSpring());
	}

}
