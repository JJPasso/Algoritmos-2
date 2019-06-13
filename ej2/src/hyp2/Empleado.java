package hyp2;

public class Empleado extends Persona {
	int CUIL;
	String idinterno;
	public Empleado(String n,int d,int cuil,String id) {
		super(n,d);
		CUIL = cuil;
		idinterno = id;
	}
	
}
