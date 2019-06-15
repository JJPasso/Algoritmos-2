package hyp4;

public class Empleado extends Persona {
	int codigoEmpleado;
	int horasExtras;
	String companiaseguro;
	public Empleado(String n,String d,String c,int ce,int he,String cs) {
		super(n,d,c);
		codigoEmpleado = ce;
		horasExtras = he;
		companiaseguro = cs;
	}
	public int enviarSalario() {
		 return salario;
	}
}
