package parciales2;

import java.util.ArrayList;

public class Cuenta {
	private ArrayList<Mesa> Mesasocupadas;
	private int id;
	private static int codigocuenta = 0;
	private boolean CuentaAbierta;
	ArrayList<Pedido> Pedidos;
	public Cuenta() {
		Mesasocupadas = new ArrayList<Mesa>();
		CuentaAbierta = true;
		Pedidos = new ArrayList<Pedido>();
		id = codigocuenta;
		codigocuenta++;
	}
	public int getId() {
		return id;
	}
	public void Pedirmesa(Mesa x)throws CuentacerradaException {
		if (CuentaAbierta) {
			Mesasocupadas.add(x);
		}else { 
			 throw new CuentacerradaException();
		}
	}
	
	public void Generarpedido(Pedido p)throws CuentacerradaException{
		if (CuentaAbierta) {
			Pedidos.add(p);
		}else { 
			 throw new CuentacerradaException();
		}
	}

	public void Imprimirticket() {
		int r = 0;
		for (Pedido x : Pedidos) {
			r += x.calcularImporte();
				x.Mostrarpedido();
		}
		for (Mesa x : Mesasocupadas) {
			if (x.esExterior()) {
				r += (r*10);
			}
		}
		System.out.println("el importe total es: " + r);
	}
	public void Cerrarcuenta() {
		CuentaAbierta=false;
	}
}
