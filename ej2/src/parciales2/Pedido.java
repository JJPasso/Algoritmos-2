package parciales2;

import java.util.ArrayList;

public class Pedido {
	protected ArrayList<Facturable> Productos;
	int importe;
	int id;
	static int codigopedido = 0;
	public Pedido() {
		Productos = new ArrayList<>();
		id = codigopedido;
		codigopedido++;
		
	}
	public void Mostrarpedido() {
		for (Facturable x : Productos) {
			System.out.println("nombre :"+ x.getNombre() + "importe: " + x.Obtenerimporte());
		}
	}
	public int calcularImporte() {
		return importe;
	}
	public int getId() {
		return id;
	}
	public void agregarProducto(Facturable d) {
		Productos.add(d);
		importe += d.Obtenerimporte();
	}
	public void removerProducto(Facturable d) {
		Productos.remove(d);
	}

}
