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
	public TipoDeViaje(tecnologia t) {
		this.t = t;
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
