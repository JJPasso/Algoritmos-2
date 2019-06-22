package hyp9;

import java.util.ArrayList;

public class ColaDynamicsGenerics<E> implements Cola<E> {
	private ArrayList<E> contenido;
	public ColaDynamicsGenerics() {
		contenido = new ArrayList<E>();
	}
	public void Vaciarcola() {
		contenido.clear();
	}
	public boolean esColavacia() {
		return contenido.isEmpty();
	}
	public void encolar(E x){
		contenido.add(x);
	}
	public void desencolar(E n) {
		if (esColavacia()) {
			System.out.println("la cola esta vacia ERROR");
			System.exit(0);
		}else {
		n = contenido.get(0);
		contenido.remove(0);
		}
	}
}
