package parciales2;

import java.util.ArrayList;

public class PedidoaDomicilio extends Pedido{
	private String domicilio;
	private ArrayList<Enviable> Productos;
	public PedidoaDomicilio(String d){
		id = codigopedido;
		codigopedido++;
		Productos = new ArrayList<>();
		importe = 0;
		domicilio = d;
	}
	
	public int calcularImporte() {
		return (int) (importe + (importe*0.20));
	}
	public void agregarProducto(Enviable d) {
		Productos.add(d);
		importe += d.Obtenerimporte();
	}
	public void removerProducto(Enviable d) {
		Productos.remove(d);
	}
	
}
