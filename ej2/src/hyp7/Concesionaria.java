package hyp7;

import java.util.ArrayList;

public class Concesionaria {
	private ArrayList<Camion> registrocamiones;
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Concesionaria (String n) {
		nombre = n;
		registrocamiones = new ArrayList<Camion>();
	}
	public boolean Verificacion(Camion cm) {
		boolean v = !registrocamiones.contains(cm);
		if (v) {
			registrocamiones.add(0,cm);
		}else {
			System.out.println("la patente"+ cm.patente +"del camion marca: "+cm.marca+" ya existe, error de documentacion");
		}
		return v;
	}
		
}
