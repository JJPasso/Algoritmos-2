package hyp9;

import java.util.ArrayList;

public class PilaDynamicsGenerics<E> implements Pila<E> {
	private ArrayList<E> contenido;
	public PilaDynamicsGenerics(){
		contenido = new ArrayList<E>();
	}
	public void Vaciarpila() {
		contenido.clear();
	}
	public boolean esPilavacia() {
		return contenido.isEmpty();
	}
	public void poner(E x) {
		contenido.add(0, x);
	}
	public void sacar(E x) {
		if (esPilavacia()) {
			System.out.println("la pila esta vacia ERROR");
			System.exit(0);
		}else {
		x = contenido.get(0);
		contenido.remove(0);
		}
	}
}
