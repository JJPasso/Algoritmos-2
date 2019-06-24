package parciales2;

public class Mesa extends Idmesa{
	int id;
	boolean esExterior;
	boolean ocupada;
	int capacidad;
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
}
