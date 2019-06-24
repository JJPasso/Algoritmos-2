package parciales2;

import java.util.ArrayList;

public class PedidoLocal extends Pedido{
	
	public PedidoLocal(){
		id = codigopedido;
		codigopedido++;
		Productos = new ArrayList<Producto>();
		importe = 0;
	
	}
	public void pedirProducto(Producto p) {
		Productos.add(p);
		importe += p.getImporte();
	}
	public int calcularImporte() {
		return (importe);
	}
}
