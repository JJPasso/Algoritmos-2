package hyp4;

public class Proveedor extends Persona {
	int codigovendedor;
	float saldo;
	String fax;
	int telefono;
	int descuentos;
	public Proveedor(String n,String d,String c, int cv,float s,String f,int t,int des) {
		super(n,d,c);
		saldo=s;
		fax = f;
		telefono = t;
		descuentos = des;
		
	}
	public void pagarfactura() {
		
	}
}
