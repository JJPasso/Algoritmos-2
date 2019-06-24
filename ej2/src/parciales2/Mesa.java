package parciales2;

public class Mesa {
	int id;
	boolean esExterior;
	boolean ocupada;
	int capacidad;
	static int codigomesa;
	public Mesa(boolean e,int cap) {
		id = codigomesa;
		codigomesa++;
		ocupada = false;
		esExterior = e;
		capacidad = cap; 
	}
	public boolean esExterior() {
		return (esExterior);
	}
	public void Ocuparmesa() {
		ocupada = true;
	}
}
