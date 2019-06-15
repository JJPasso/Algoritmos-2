package hyp4;

public class Planta extends Empleado{
	int salario;
	int anosAntiguedad;
	public Planta(String n,String d,String c,int ce,int he,String cs,int s,int aa) {
		super(n,d,c,ce,he,cs);
		salario = s;
		anosAntiguedad = aa;
	}
	public int pagarSalario() {
		return salario;
	}
}
