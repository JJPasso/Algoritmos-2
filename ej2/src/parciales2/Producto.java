package parciales2;

public abstract class Producto implements Facturable{
	protected String nombre;
	protected int importe;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int Obtenermporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	
	
}
