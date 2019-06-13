package hyp2;

public class Persona {
	private String nombre;
	private int DNI;
	public Persona(String n,int DNI) {
		nombre = n;
		this.DNI = DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDni() {
		return DNI;
	}
}
