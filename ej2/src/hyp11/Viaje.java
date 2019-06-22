package hyp11;

public abstract class Viaje {
	String TerminalOrigen;
	String TerminalDestino;
	TipoDeViaje tv;
	int Distancia;
	int CantidadEstaciones;
	int CantidadVagones;
	int MaximoPasajeros;
	public abstract float TiempodeDemora();
}
