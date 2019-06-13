package hyp3;

import ej12.Fecha;

public class Disco extends Publicacion {
	private int duracion;
	public Disco(String t,int p,int d) {
		super(t,p);
		duracion = d;
	}
	public int getDuracionenminutos() {
		return duracion;
	}
	public void infoDisco(Disco d) {
		System.out.println("titulo:"+d.getTitulo()+"precio:"+d.getPrecio()+"Duracion en minutos:"+d.getDuracionenminutos());
	}
}
