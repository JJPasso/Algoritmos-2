package parciales2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant rest = new Restaurant();
		Cuenta c1 = new Cuenta();
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		PedidoaDomicilio p3 = new PedidoaDomicilio("Av de Mayo");
		Hamburguesa h = new Hamburguesa(12);
		CocaCola cc = new CocaCola(6);
		rest.InicializarMesas();
		rest.abrirCuenta(c1);
		p1.agregarProducto(h);
		p1.agregarProducto(cc);
		p2.agregarProducto(h);
		p2.agregarProducto(cc);
		h.empaquetar();
		p3.agregarProducto(h);
		try {
			c1.Pedirmesa(rest.Buscarmesalibre());
			c1.Generarpedido(p1);
			c1.Generarpedido(p2);
			c1.Generarpedido(p3);
		}catch (NohaymesasException e) {
			System.out.println("no hay mesas disponibles");
		}catch (CuentacerradaException e1) {
			System.out.println("ERROR cuenta cerrada");
		}
		c1.Cerrarcuenta();
		c1.Imprimirticket();
		
	}

}
