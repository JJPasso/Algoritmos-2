package hyp4;

import ej12.Fecha;

public class Paciente extends Persona{
	private int telefono;
	private int codigoDiagnostico;
	private Fecha fechadenacimiento;
	public Paciente(String n,String d,String c,int t,int cd,Fecha fn) {
		super(n,d,c);
		telefono = t;
		codigoDiagnostico = cd;
		fechadenacimiento = fn;
	}
	
}
