package hyp11;

public class TipoDeViaje {
	enum tecnologia {DIESEL,ELECTRICO,ALTAVELOCIDAD};
	tecnologia t;
	public tecnologia getT() {
		return t;
	}
	public void setT(tecnologia t) {
		this.t = t;
	}

	public void setTipoDeViaje(int n)throws IllegalArgumentException {
		
		if (n == 1) {
			this.t = tecnologia.DIESEL;
		}
		if (n == 2) {
			this.t = tecnologia.ELECTRICO;
		}
		if (n == 3) {
			this.t = tecnologia.ALTAVELOCIDAD;
		}
		if ((n != 1)&&(n != 2)&&(n !=3)) {
			throw new IllegalArgumentException ("ERROR: 1 es tipo de viaje con diesel, 2 es tipo de viaje electrico y 3 es tipo de viaje a alta velocidad");
		}
	}
	public boolean esDiesel(TipoDeViaje tt) {
		return (tt.t == tecnologia.DIESEL);
	}
	public boolean esElectrico(TipoDeViaje tt) {
		return (tt.t == tecnologia.ELECTRICO);
	}
	public boolean esAltavelocidad(TipoDeViaje tt) {
		return (tt.t == tecnologia.ALTAVELOCIDAD);
	}
}
