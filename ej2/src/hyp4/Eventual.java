package hyp4;

public class Eventual extends Empleado{
	int honorariosporhora;
	public Eventual(String n,String d,String c,int ce,int he,String cs,int hph) {
		super(n,d,c,ce,he,cs);
		honorariosporhora = hph;
	}
	public void enviarSalario() {
		float c = this.calculoSalario();
		salarioTotalganado = salarioTotalganado + c;
	}
	public float calculoSalario() {
			float hd = 30*8;
			hd = hd + horasExtras;
			float salario = hd*honorariosporhora;
			return salario;
	}
}
