package hyp7;

import ej12.Fecha;

public class Permiso {
	private Fecha factual;
	private Fecha vencimiento;
	private Concesionaria con;
	public Fecha getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Fecha vencimiento) {
		this.vencimiento = vencimiento;
	}
	public Fecha getFactual() {
		return factual;
	}
	public void setFactual(Fecha factual) {
		this.factual = factual;
	}
	public Permiso(Fecha v,Fecha fa) {
		this.factual = fa;
		this.vencimiento = v;
	}
	public Permiso(Concesionaria c) {
		setCon(c);
	}
	public boolean Permisoautomediano(){
		return factual.esMayor(factual, vencimiento);
	}
	public boolean Permisocamion(Camion cm) {
		Concesionaria con = cm.getC();
		return con.Verificacion(cm);
	}
	public Concesionaria getCon() {
		return con;
	}
	public void setCon(Concesionaria con) {
		this.con = con;
	}
}
