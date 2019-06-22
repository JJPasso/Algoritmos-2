package hyp11;

public class Trayecto extends Viaje {
	public Trayecto(String to,String td,TipoDeViaje tdv,int d,int ce,int cv,int mp) {
		TerminalOrigen = to;
		TerminalDestino = td;
		tv = tdv;
		Distancia = d;
		CantidadEstaciones = ce;
		CantidadVagones = cv;
		MaximoPasajeros = mp;
	}
	public float TiempodeDemora() {
		float r;
		if (tv.esDiesel(tv)) {
			r = (((Distancia*CantidadEstaciones)/2)+(CantidadEstaciones/10)+(MaximoPasajeros/10));
			return r;
		}else {
			if (tv.esElectrico(tv)) {
				 r = ((Distancia*CantidadEstaciones)/2);
				return r;
		}else {
			if (tv.esAltavelocidad(tv)) {
				 r = (Distancia/10);
				return r;
		}
	}
	
}
}

}