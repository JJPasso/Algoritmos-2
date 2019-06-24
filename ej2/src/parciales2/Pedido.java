package parciales2;

import java.util.ArrayList;

public class Pedido {
	protected ArrayList<Facturable> Productos;
	int importe;
	int id;
	protected boolean esCancelable;
	static int codigopedido = 0;
	public Pedido() {
		Productos = new ArrayList<>();
		id = codigopedido;
		codigopedido++;
		esCancelable = false;
	}
	public int getImporte() {
		return importe;
	}
	public int getId() {
		return id;
	}
	public void agregarProducto(Facturable d) {
		Productos.add(d);
	}
	public void removerProducto(Facturable d) {
		Productos.remove(d);
	}

}
