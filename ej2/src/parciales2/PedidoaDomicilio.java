package parciales2;

import java.util.ArrayList;

public class PedidoaDomicilio extends Pedido{
	String domicilio;
	public PedidoaDomicilio(String d){
		id = codigopedido;
		codigopedido++;
		Productos = new ArrayList<Producto>();
		importe = 0;
		domicilio = d;
	}
	public void pedirProducto(Comida p) {
		Productos.add(p);
		importe += p.getImporte();
	}
	public int calcularImporte() {
		return (importe += (importe*0.20));
	}
	
	
}
