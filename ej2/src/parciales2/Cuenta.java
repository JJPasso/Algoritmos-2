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
	public void OcuparUnaMesaMas(Mesa x) {
		Mesasocupadas.add(x);
	}
	public boolean esCuentaAbierta() {
		return CuentaAbierta;
	}
	
	public void Generarpedido(Pedido p){
		Pedidos.add(p);
	}
	public boolean cancelarPedido(Pedido p) {
		if (Pedidos.contains(p)) {
			p.Eliminarpedido();
			Pedidos.remove(p);
			return true;
		}else {
			return false;
		}
	}
	public int calcularImporte() {
		int r = 0;
		for (Pedido x : Pedidos) {
			r += x.calcularImporte();
		}
		for (Mesa x : Mesasocupadas) {
			if (x.esExterior) {
				r += (r*10);
			}
		}
		return r;
	}
	public void Cerrarcuenta() {
		CuentaAbierta=false;
		Pedidos.clear();
		Mesasocupadas.clear();
	}
}
