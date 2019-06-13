package hyp3;

public class Publicacion {
	private String titulo;
	private int precio;
	public Publicacion(String t,int p) {
		titulo = t;
		precio = p;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getPrecio(){
		return precio;
	}
}
