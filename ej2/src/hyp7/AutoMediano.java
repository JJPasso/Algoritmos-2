package hyp7;
import ej12.Fecha;
public class AutoMediano extends Automovil<Fecha> {
	public AutoMediano(int p,String m,Fecha f) {
		patente = p;
		vencimientopatente = f;
		marca = m;
	}
	public boolean Habilitar(Fecha ff) {
		return (ff.esMayor(vencimientopatente,ff));
		}
}