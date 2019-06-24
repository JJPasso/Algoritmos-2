package parciales2;

import java.util.ArrayList;

public class Cuenta {
	private ArrayList<Cliente> Clientes;
	private ArrayList<Mesa> Mesasocupadas;
	private static int proximoCodigo = 0;
	private int id;
	private boolean CuentaAbierta;
	ArrayList<Pedido> Pedidos;
	public Cuenta(Cliente primercliente,Mesa primermesa) {
		Clientes = new ArrayList<Cliente>();
		Mesasocupadas = new ArrayList<Mesa>();
		CuentaAbierta = true;
		Pedidos = new ArrayList<Pedido>();
		id = proximoCodigo;
		proximoCodigo++;
	}
	public int getId() {
		return id;
	}
	public int cantidaddeComensales() {
		return (Clientes.size());
	}
	public void OcuparUnaMesaMas(Mesa x) {
		Mesasocupadas.add(x);
	}
	public boolean esCuentaAbierta() {
		return CuentaAbierta;
	}
	public void AgregarClienteaCuenta(Cliente c) {
		Clientes.add(c);
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
		Clientes.clear();
		Pedidos.clear();
		Mesasocupadas.clear();
	}
}
