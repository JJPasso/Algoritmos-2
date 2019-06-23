package interface1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		try {
			 @SuppressWarnings("unchecked")
				ArrayList<Medible> lista = new ArrayList();
				CuentaBancaria bbva = new CuentaBancaria(04545,"maria antonella",568900);
				Termometro stone = new Termometro();
				stone.setTermometro(56);
				lista.add(stone);
				lista.add(bbva);
			for (int i = 0;i<=1;i++) {
				if (!lista.get(i).incremento(500)) {
					if (!lista.get(i).decremento(-795)) {
				System.out.println(lista.get(i).medida());
					}
				}
			}
		}catch (IllegalArgumentException e1) {
			System.out.println("letra invalida:" + e1.getMessage());
		}
	}

}
