package parciales2;

import java.util.ArrayList;

public class Restaurant {
	private ArrayList<Mesa> Mesatotales;
	private ArrayList<Cuenta> Cuentas;

	public Restaurant() {
		Mesatotales = new ArrayList<>();
		Cuentas = new ArrayList<>();
		
	}
	public void InicializarMesas() {
		Mesa m1 = new Mesa(true,5);
		Mesa m2 = new Mesa(false,6);
		Mesa m3 = new Mesa(false,8);
		Mesatotales.add(m1);
		Mesatotales.add(m2);
		Mesatotales.add(m3);
	}
	public void abrirCuenta(Cuenta c1) {
		Cuentas.add(c1);
	}
public Mesa Buscarmesalibre()throws NohaymesasException {
		boolean hayLibre = false;
		int i = 0;
		Mesa m = null;
		while ((!hayLibre)&&(i <= Mesatotales.size())) {
			m = Mesatotales.get(i);
			if (!m.estaOcupada()) {
				hayLibre = true;
				m.Ocuparmesa();
			}
			i++;
		}
		if (!hayLibre) {
			throw new NohaymesasException();
		}else {
			return m;
		}
	}
}
