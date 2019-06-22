package hyp7;
import ej12.Fecha;
public class AutoMediano extends Automovil {
	private Fecha vencimientopatente;
	private Fecha actual;
	public Fecha getVencimientopatente() {
		return vencimientopatente;
	}
	public void setVencimientopatente(Fecha vencimientopatente) {
		this.vencimientopatente = vencimientopatente;
	}
	public Fecha getActual() {
		return actual;
	}
	public void setActual(Fecha actual) {
		this.actual = actual;
	}
	public AutoMediano(int p,String m,Fecha v,Fecha actual) {
		patente = p;
		vencimientopatente = v;
		marca = m;
		this.actual = actual;
	}
	public boolean Habilitar() {
		Permiso pm = new Permiso(vencimientopatente,actual);
		return pm.Permisoautomediano();
		}
}