package parciales3;

import java.util.ArrayList;

public class Propietario {
	ArrayList<Propiedad> InmueblesAsociados;
	private String nombre;
	private String apellido;
	private int dni;
	private int telefono;
	private int telefonomovil;
	private String email;
	private String direccion;
	private int codigopostal;
	private String localidad;
	public Propietario(String n,String a) {
		nombre = n;
		apellido = a;
	}
}
