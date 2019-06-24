package parciales2;

public class Hamburguesa extends Comida{
	public Hamburguesa(int p) {
		this.nombre = "Hamburguesa";
		this.importe = p;
		
	}
	public int Obtenerimporte() {
		return importe;
	}
	public void empaquetar() {
		System.out.println("se empaqueto: "+ nombre);
	}
}
