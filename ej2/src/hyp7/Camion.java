package hyp7;



public class Camion extends Automovil {
	private Concesionaria c;
	public Concesionaria getC() {
		return c;
	}
	public void setC(Concesionaria c) {
		this.c = c;
	}
	public Camion(int p,String m,Concesionaria c) {
		patente = p;
		marca = m;
		this.c = c;
	}
	public boolean Habilitar() {
		Permiso pm = new Permiso(c);
		return pm.Permisocamion(this);
	}
}
