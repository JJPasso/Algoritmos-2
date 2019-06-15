package hyp4;

public class Persona {
	private String nombre;
	private String direccion;
	private String ciudad;
	public Persona(String n,String d,String c) {
		nombre = n;
		direccion =d;
		ciudad=c;
	}
	public void mostrar() {
		System.out.println("Nombre: "+nombre+"Direccion: "+direccion+"Ciudad: "+ciudad);
	}
	public void leer(String n,String d,String c) {
		nombre = n;
		direccion = d;
		ciudad = c;
	}
}
