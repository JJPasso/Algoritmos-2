package parciales2;

import java.util.ArrayList;

public abstract class Pedido {
	ArrayList<Producto> Productos;
	int importe;
	int id;
	public int getImporte() {
		return importe;
	}
	public int getId() {
		return id;
	}
	static int codigopedido = 0;
	public void Eliminarpedido() {
		Productos.clear();
	}
	public abstract int calcularImporte();
}
