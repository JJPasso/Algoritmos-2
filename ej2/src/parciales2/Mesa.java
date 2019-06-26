package parciales2;

public class Mesa {
	private int id;
	private boolean esExterior;
	private boolean ocupada;
	private int capacidad;
	static int codigomesa;
	public Mesa(boolean e,int cap) {
		id = codigomesa;
		codigomesa++;
		ocupada = false;
		esExterior = e;
		capacidad = cap; 
	}
	public boolean estaOcupada() {
		return ocupada;
	}
	public boolean esExterior() {
		return (esExterior);
	}
	public void Ocuparmesa() {
		ocupada = true;
	}
}
