package hyp7;

import ej12.Fecha;


public abstract class Automovil<E extends Automovil> {
	int patente;
	Fecha vencimientopatente;
	String marca;
	public abstract boolean Habilitar(E f);
}
