package parciales2;

import java.util.ArrayList;

public class Restaurant {
	ArrayList<Mesa> Mesatotales;
	ArrayList<Cuenta> Cuentas;

	public Restaurant() {
	
		
	}
	private void InicializarMesas() {
		Mesa m1 = new Mesa(true,5);
		Mesa m2 = new Mesa(false,6);
		Mesa m3 = new Mesa(false,8);
		Mesatotales = new ArrayList<>();
		Mesatotales.add(m1);
		Mesatotales.add(m2);
		Mesatotales.add(m3);
	}
	public void abrirCuenta() {
		Cuenta c1 = new Cuenta();
		Cuentas.add(c1);
	}
}
