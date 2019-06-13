package hyp3;

import ej12.Fecha;

public class Libro extends Publicacion {
	private int numpag;
	private Fecha publibro;
	public Libro(String t,int p,int np,Fecha f) {
		super(t,p);
		numpag = np;
		publibro = f;
	}
	public int getNumeropaginas() {
		return numpag;
	}
	public Fecha getFechapublicacion(){
		return publibro;
	}
	public void infoLibro(Libro d) {
		Fecha r = d.getFechapublicacion();
		System.out.println("titulo:"+d.getTitulo()+"precio:"+d.getPrecio()+"Numero de Paginas:"+d.getNumeropaginas()+"Fecha de publicacion"+r.toSpring());
	}
}
