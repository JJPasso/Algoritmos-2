package parciales3;

public class AgenteInmobiliario {
	private int id;
	private static int proximocodigo = 0;
	private String nombre;
	private String Apellido;
	private int dni;
	private int cuil;
	private int telefono;
	private int telefonomovil;
	private String email;
	private String direccion;
	private int codigopostal;
	private String Localidad;
	private int salariobasico;
	public AgenteInmobiliario(String n,String a,int s) {
		id = proximocodigo;
		proximocodigo++;
		salariobasico = s;
		nombre = n;
		Apellido = a;
	}
}
