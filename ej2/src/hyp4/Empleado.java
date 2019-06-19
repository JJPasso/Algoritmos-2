package hyp4;

public abstract class Empleado extends Persona {
	float salarioTotalganado;
	int codigoEmpleado;
	int horasExtras;
	String companiaseguro;
	public Empleado(String n,String d,String c,int ce,int he,String cs) {
		super(n,d,c);
		codigoEmpleado = ce;
		horasExtras = he;
		companiaseguro = cs;
	}
	public abstract void enviarSalario();
	public abstract float calculoSalario();
}
